package ar.edu.unlam.pb2;

import java.util.Objects;

public abstract class Poliza {
	
	private Integer numero;
	private Persona asegurado;
	private Double sumaAsegurada;
	private Double prima;

	public Poliza(Integer numero, Persona asegurado, Double sumaAsegurada, Double prima) {
		this.numero = numero;
		this.asegurado = asegurado;
		this.sumaAsegurada = sumaAsegurada;
		this.prima = prima;
		
	}
	
	public Integer getNumero() {
		return numero;
	}



	public void setNumero(Integer numero) {
		this.numero = numero;
	}



	public Persona getAsegurado() {
		return asegurado;
	}



	public void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}



	public Double getSumaAsegurada() {
		return sumaAsegurada;
	}



	public void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}



	public Double getPrima() {
		return prima;
	}



	public void setPrima(Double prima) {
		this.prima = prima;
	}



	public Double getPremio() {
		Double premio = 0.0;
		Double impuestos = this.prima * 0.2;
		
		premio = this.prima + impuestos;
		
		return premio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Poliza other = (Poliza) obj;
		return Objects.equals(numero, other.numero);
	}

	protected abstract void denunciar();
	
	

}
