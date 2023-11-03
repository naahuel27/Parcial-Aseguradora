package ar.edu.unlam.pb2;

public class PolizaDeAuto extends Poliza implements SegurosGenerales {

	private Auto auto;
	private Boolean autoRobado;
	
	public PolizaDeAuto(Integer numero, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numero, asegurado, sumaAsegurada, prima);
		this.autoRobado = false;
	}

	@Override
	public void agregarBienAsegurado(Auto auto) {
		this.auto = auto;
	}

	@Override
	public Auto getAuto() {
		return this.auto;
	}
	
	public Boolean fueRobado() {
		return this.autoRobado;
	}

	@Override
	protected void denunciar() {
		this.autoRobado = true;
	}
	
}
