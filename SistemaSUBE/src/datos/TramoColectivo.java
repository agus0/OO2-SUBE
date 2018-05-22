package datos;

public class TramoColectivo {
	private long idTramoColectivo;
	private SeccionColectivo seccionColectivo;
	private LectorColectivo lectorColectivo;
	
	public TramoColectivo(){}
	
	public TramoColectivo(SeccionColectivo seccionColectivo, LectorColectivo lectorColectivo) {
		this.seccionColectivo = seccionColectivo;
		this.lectorColectivo = lectorColectivo;
	}

	public long getIdTramoColectivo() {
		return idTramoColectivo;
	}

	protected void setIdTramoColectivo(long idTramoColectivo) {
		this.idTramoColectivo = idTramoColectivo;
	}

	public SeccionColectivo getSeccionColectivo() {
		return seccionColectivo;
	}

	public void setSeccionColectivo(SeccionColectivo seccionColectivo) {
		this.seccionColectivo = seccionColectivo;
	}

	public LectorColectivo getLectorColectivo() {
		return lectorColectivo;
	}

	public void setLectorColectivo(LectorColectivo lectorColectivo) {
		this.lectorColectivo = lectorColectivo;
	}
	
	

}
