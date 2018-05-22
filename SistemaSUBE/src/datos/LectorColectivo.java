package datos;

public class LectorColectivo extends Lector {
	private long idLectorColectivo;
	private String interno;
	private TramoColectivo tramoColectivo;
	
	public LectorColectivo () {}

	public LectorColectivo(Linea linea,SaldoMinimo saldoMinimo, char tipoLector, String interno) {
		super(linea, saldoMinimo, tipoLector);
		this.interno = interno;
	}

	public long getIdLectorColectivo() {
		return idLectorColectivo;
	}

	public void setIdLectorColectivo(long idLectorColectivo) {
		this.idLectorColectivo = idLectorColectivo;
	}

	public String getInterno() {
		return interno;
	}

	public void setInterno(String interno) {
		this.interno = interno;
	}

	public TramoColectivo getTramoColectivo() {
		return tramoColectivo;
	}

	public void setTramoColectivo(TramoColectivo tramoColectivo) {
		this.tramoColectivo = tramoColectivo;
	}

	@Override
	public String toString() {
		return "LectorColectivo [idLectorColectivo=" + idLectorColectivo + ", interno=" + interno + ", Linea=" + getLinea() + "]";
	}
	
	

}
