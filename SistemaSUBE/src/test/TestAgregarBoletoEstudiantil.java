package test;

import negocio.BoletoEstudiantilABM;

public class TestAgregarBoletoEstudiantil {
	public static void main(String[] args) throws Exception {
		String beneficio= "Plan Estudiantes" ;
		double montoFijo = 6.15;
		BoletoEstudiantilABM dabm = BoletoEstudiantilABM.getInstanciaBoletoEstudiantilABM();
		dabm.agregar(beneficio,montoFijo);

	}
}
