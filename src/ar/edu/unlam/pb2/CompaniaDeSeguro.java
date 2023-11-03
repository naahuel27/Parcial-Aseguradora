package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class CompaniaDeSeguro {

	private String nombre;
	private Set<Poliza> polizas;
	
	public CompaniaDeSeguro(String nombre) {
		this.nombre = nombre;
		this.polizas = new HashSet<>();
	}

	public void agregarPoliza(Poliza poliza) {
		this.polizas.add(poliza);
	}

	public Integer obtenerLaCantidadDePolizasEmitidas() {
		return this.polizas.size();
	}

	public void denunciarSiniestro(Integer numero) {
		
		for (Poliza poliza : this.polizas) {
			if (poliza.getNumero().equals(numero)) {
				poliza.denunciar();
			}
		}
		//getPoliza(numero);
	}

	public Poliza getPoliza(Integer numero) {
		
		for (Poliza poliza : this.polizas) {
			if (poliza.getNumero().equals(numero)) {
				return poliza;
			}
		}
		
		return null;
	}
}
