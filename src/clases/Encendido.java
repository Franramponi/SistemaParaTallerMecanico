package clases;

public class Encendido extends Servicio implements CotizablePorMateriales {

	
	public Encendido(String descripcion, double porcentajeGanancia, String patente) {
		super(descripcion,porcentajeGanancia,patente);
	}
	
	public double calcularCostoMateriales() {
	    return (COSTOMATERIAL1 + COSTOMATERIAL2);
	}
	
	@Override
	public double calcularPrecioCosto() {
		return this.calcularCostoMateriales(); 
	}
	

}
