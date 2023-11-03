package ar.edu.unlam.pb2;

import java.util.HashMap;
import java.util.Map;

public class PolizaCombinadoFamiliar extends Poliza implements SegurosDeVida{

	private Map<Persona, TipoDeBeneficiario> beneficiarios;
	private Vivienda casa;
	
	public PolizaCombinadoFamiliar(Integer numero, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numero, asegurado, sumaAsegurada, prima);
		this.beneficiarios = new HashMap<>();
		
	}

	@Override
	public void agregarBeneficiario(Persona hijo, TipoDeBeneficiario tipoDeBeneficiario) {
		this.beneficiarios.put(hijo, tipoDeBeneficiario);
	}

	@Override
	public Integer obtenerCantidadDeBeneficiarios() {
		Integer cantidadBeneficiarios = 0;
		
		for (Map.Entry<Persona, TipoDeBeneficiario> entry : this.beneficiarios.entrySet()) {
			Persona key = entry.getKey();
			TipoDeBeneficiario val = entry.getValue();
			
			cantidadBeneficiarios++;
			
		}
		
		return cantidadBeneficiarios;
	}

	public void agregarBienAsegurado(Vivienda casa) {
		this.casa = casa;
	}

	@Override
	protected void denunciar() {
		// TODO Auto-generated method stub
		
	}
	
	

}
