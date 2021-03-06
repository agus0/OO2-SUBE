package datos;

import java.util.Set;

public class Lector {
	private long idLector;
	private Linea linea;
	private SaldoMinimo saldoMinimo;
	private char tipoLector;
	private Set<Boleto> boletos;
	
	public Lector() {}

	public Lector(Linea linea,SaldoMinimo saldoMinimo, char tipoLector) {
		super();
		this.linea = linea;
		this.saldoMinimo = saldoMinimo;
		this.tipoLector = tipoLector;
	}

	public long getIdLector() {
		return idLector;
	}

	protected void setIdLector(long idLector) {
		this.idLector = idLector;
	}
	
	public Linea getLinea() {
		return linea;
	}

	public void setLinea(Linea linea) {
		this.linea = linea;
	}

	public SaldoMinimo getSaldoMinimo() {
		return saldoMinimo;
	}

	public void setSaldoMinimo(SaldoMinimo saldoMinimo) {
		this.saldoMinimo = saldoMinimo;
	}

	public char getTipoLector() {
		return tipoLector;
	}

	public void setTipoLector(char tipoLector) {
		this.tipoLector = tipoLector;
	}

	public Set<Boleto> getBoletos() {
		return boletos;
	}

	public void setBoletos(Set<Boleto> boletos) {
		this.boletos = boletos;
	}

	@Override
	public String toString() {
		return "Lector [idLector=" + idLector + ", tipoLector=" + tipoLector + "]";
	}

}
