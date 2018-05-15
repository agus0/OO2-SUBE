package test;
import datos.Usuario;
import negocio.DescuentoABM;
import negocio.UsuarioABM;

public class TestAgregarDescuento {
	public static void main(String[] args) throws Exception {
		String beneficio= "Plan Progresar" ;
		double porcentajeDescuento = 0.45;
		UsuarioABM uabm = UsuarioABM.getInstanciaUsuarioABM();
		Usuario usuario = uabm.traerI(2);
		DescuentoABM dabm = DescuentoABM.getInstanciaDescuentoABM();
		dabm.agregar(beneficio,usuario,porcentajeDescuento);

	}
}