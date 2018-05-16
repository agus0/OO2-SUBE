package datos;

import java.util.*;

public class Tarjeta {
	
	private long idTarjeta;
	private double saldo=0;
	private boolean redSUBE=false;
	private int nivelRS;
	private GregorianCalendar inicioRS;
	private boolean baja;
	private Set<Boleto> boletos;
	
	public Tarjeta() {}

	public Tarjeta(double saldo, boolean redSUBE, int nivelRS,GregorianCalendar inicioRS, boolean baja) {
		super();
		this.saldo = saldo;
		this.redSUBE = redSUBE;
		this.nivelRS = nivelRS;
		this.inicioRS = inicioRS;
		this.baja = baja;
	}

	public long getIdTarjeta() {
		return idTarjeta;
	}

	protected void setIdTarjeta(long idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isRedSUBE() {
		return redSUBE;
	}

	public void setRedSUBE(boolean redSUBE) {
		this.redSUBE = redSUBE;
	}

	public int getNivelRS() {
		return nivelRS;
	}

	public void setNivelRS(int nivelRS) {
		this.nivelRS = nivelRS;
	}

	public GregorianCalendar getInicioRS() {
		return inicioRS;
	}

	public void setInicioRS(GregorianCalendar inicioRS) {
		this.inicioRS = inicioRS;
	}

	public boolean isBaja() {
		return baja;
	}

	public void setBaja(boolean baja) {
		this.baja = baja;
	}

	public Set<Boleto> getBoletos() {
		return boletos;
	}

	public void setBoletos(Set<Boleto> boletos) {
		this.boletos = boletos;
	}

	@Override
	public String toString() {
		return "Tarjeta [idTarjeta=" + idTarjeta + ", saldo=" + saldo + ", redSUBE=" + redSUBE
				+ ", nivelRS=" + nivelRS + ", baja=" + baja +"]";
	}


}
