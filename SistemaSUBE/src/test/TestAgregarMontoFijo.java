package test;

import datos.Usuario;
import negocio.MontoFijoABM;
import negocio.UsuarioABM;

public class TestAgregarMontoFijo {
	public static void main(String[] args) throws Exception {
		String beneficio= "Plan Estudiantes" ;
		double montoFijo = 6.15;
		UsuarioABM uabm = UsuarioABM.getInstanciaUsuarioABM();
		Usuario usuario = uabm.traerI(2);
		MontoFijoABM dabm = MontoFijoABM.getInstanciaMontoFijoABM();
		dabm.agregar(beneficio,usuario,montoFijo);

	}
}
