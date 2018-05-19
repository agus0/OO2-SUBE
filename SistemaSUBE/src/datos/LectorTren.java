package datos;

public class LectorTren extends Lector{
	private long idLectorTren;
	private boolean salida;
	private Estacion estacion;

	public LectorTren() {}

	public LectorTren(Linea linea,SaldoMinimo saldoMinimo, char tipoLector, String estacionSubte, boolean salida, Estacion estacion) {
		super(linea,saldoMinimo,tipoLector);
		this.salida = salida;
		this.estacion = estacion;
	}

	public long getIdLectorTren() {
		return idLectorTren;
	}

	protected void setIdLectorTren(long idLectorTren) {
		this.idLectorTren = idLectorTren;
	}

	public boolean isSalida() {
		return salida;
	}

	public void setSalida(boolean salida) {
		this.salida = salida;
	}

	public Estacion getEstacion() {
		return estacion;
	}

	public void setEstacion(Estacion estacion) {
		this.estacion = estacion;
	}
	
	
}