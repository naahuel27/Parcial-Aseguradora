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

	public void denunciarSiniestro(Integer numero) throws PolizaInexistente {
		Poliza polizaEncontrada = getPoliza(numero);
		
		polizaEncontrada.denunciar();
			
	}

	public Poliza getPoliza(Integer numero) throws PolizaInexistente {
		
		for (Poliza poliza : this.polizas) {
			if (poliza.getNumero().equals(numero)) {
				return poliza;
			}
		}
		
		throw new PolizaInexistente("La poliza ingresada es incorrecta");
	}
}
