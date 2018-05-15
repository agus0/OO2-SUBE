package dao;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Descuento;
import datos.MontoFijo;

public class MontoFijoDao {
	private static Session session ;
	private Transaction tx ;
	private static MontoFijoDao instanciaMontoFijoDao;
	
	public static MontoFijoDao getInstanciaMontoFijoDao() {
		if ( instanciaMontoFijoDao == null ) {
			instanciaMontoFijoDao = new MontoFijoDao();
		}
		return instanciaMontoFijoDao ;
		}
	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil. getSessionFactory ().openSession();
		tx = session .beginTransaction();
	}
	
	private void manejaExcepcion(HibernateException he) throws HibernateException {
		tx .rollback();
		throw new HibernateException( "ERROR en la capa de acceso a datos" , he);
	}
	
	public int agregar(MontoFijo objeto) {int id = 0;
		try {
			iniciaOperacion();
			id = Integer. parseInt ( session .save(objeto).toString());
			tx .commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session .close();
		}
		return id;
	}
	
	public void actualizar(MontoFijo objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session .update(objeto);
			tx .commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
			} finally {
			session .close();
			}
		}
				
	public void eliminar(MontoFijo objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session .delete(objeto);
			tx .commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session .close();
		}
	}
		
	public MontoFijo traer( long id) throws HibernateException {
		MontoFijo objeto = null ;
		try {
			iniciaOperacion();
			objeto = (MontoFijo) session .get(Descuento. class , id);
		} finally {
			session .close();
		}
		return objeto;
	}
	
	@SuppressWarnings ( "unchecked" )
	public List<MontoFijo> traer() throws HibernateException {
		List<MontoFijo> lista= null ;
		try {
			iniciaOperacion();
			lista= session .createQuery( "from MontoFijo" ).list();
		} finally {
			session .close();
		}
		return lista;
	}
}
	