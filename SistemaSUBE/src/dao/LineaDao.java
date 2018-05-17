package dao;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Linea;

public class LineaDao {
	private static Session session ;
	private Transaction tx ;
	private static LineaDao instanciaLineaDao;
	
	public static LineaDao getInstanciaLineaDao() {
		if ( instanciaLineaDao == null ) {
			instanciaLineaDao = new LineaDao();
		}
		return instanciaLineaDao ;
		}
	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil. getSessionFactory ().openSession();
		tx = session .beginTransaction();
	}
	
	private void manejaExcepcion(HibernateException he) throws HibernateException {
		tx .rollback();
		throw new HibernateException( "ERROR en la capa de acceso a datos" , he);
	}
	
	public int agregar(Linea objeto) {int id = 0;
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
	
	public void actualizar(Linea objeto) throws HibernateException {
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
				
	public void eliminar(Linea objeto) throws HibernateException {
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
		
	public Linea traer( long id) throws HibernateException {
		Linea objeto = null ;
		try {
			iniciaOperacion();
			objeto = (Linea) session .get(Linea. class , id);
		} finally {
			session .close();
		}
		return objeto;
	}
	
	@SuppressWarnings ( "unchecked" )
	public List<Linea> traer() throws HibernateException {
		List<Linea> lista= null ;
		try {
			iniciaOperacion();
			lista= session .createQuery( "from Linea" ).list();
		} finally {
			session .close();
		}
		return lista;
	}
}
	