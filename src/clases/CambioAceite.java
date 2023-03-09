package clases;

public class CambioAceite extends Servicio implements CotizablePorManoObra, CotizablePorMateriales {
	
	private int cantHoras;
	
	public CambioAceite(String descripcion, double porcentajeGanancia, String patente, int horas) {
		super(descripcion,porcentajeGanancia,patente);
		this.setCantHoras(horas);
	}

	public double calcularCostoHoras() {
	    return COSTOHORA * this.getCantHoras();	
	}
	
	public double calcularCostoMateriales() {
	    return (COSTOMATERIAL1 + COSTOMATERIAL2);
	}
	
	public double calcularPrecioCosto() {
		return this.calcularCostoMateriales() + this.calcularCostoHoras();
	}

	private int getCantHoras() {
		return cantHoras;
	}
	
	private void setCantHoras(int cantHoras) {
		this.cantHoras = cantHoras;
	}
	
	

}
