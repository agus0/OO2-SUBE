package negocio;
import java.util.List;

import dao.LectorDao;
import datos.Lector;
import datos.Linea;
import datos.SaldoMinimo;

public class LectorABM {
	private static LectorABM instanciaLectorABM;
	LectorDao dao = LectorDao.getInstanciaLectorDao();
	
	public static LectorABM getInstanciaLectorABM() {
		if ( instanciaLectorABM == null ) {
			instanciaLectorABM = new LectorABM();
		}
		return instanciaLectorABM ;
		}
	
	public Lector traer( long id)throws Exception{
		Lector c= dao .traer(id);
		if(c==null) throw new Exception("El lector con esa ID no existe");
		else return c;
	}

	public int agregar(Linea linea,SaldoMinimo saldoMinimo, char tipoLector){
		Lector c= new Lector(linea,saldoMinimo,tipoLector);
			return dao .agregar(c);
	}
	
	public void modificar(Lector c){
		dao .actualizar(c);
	}
	
	public void eliminar( long id){ 
		Lector c= dao .traer(id);
		dao .eliminar(c);
	}
	
	public List<Lector> traer(){
		return dao .traer();
		}

}