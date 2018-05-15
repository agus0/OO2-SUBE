package test;
import negocio.UsuarioABM;

public class TestAgregarUsuario {
	public static void main(String[] args) throws Exception {
		String apellido= "Saavedra Griott" ;
		String nombre= "Daniel" ;
		int documento=36681165;
		UsuarioABM abm= UsuarioABM.getInstanciaUsuarioABM();
		abm.agregar(apellido, nombre, documento);
	}
}