package test;

import negocio.LineaABM;

public class TestAgregarLinea {
	public static void main(String[] args) throws Exception {
		String linea = "EEE";
		LineaABM abm = LineaABM.getInstanciaLineaABM();
		abm.agregar(linea);

	}
}
