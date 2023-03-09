package clases;

public class Alineacion extends Servicio implements CotizablePorManoObra {

	private int cantHoras;
	private boolean incluyeBalanceo;
	static final double EXTRABALANCEO = 500;
	
	public Alineacion(String descripcion, double porcentajeGanancia,
			 String patente, int horas, boolean conBalanceo) {
		super(descripcion,porcentajeGanancia,patente);
		this.setCantHoras(horas);
		this.setIncluyeBalanceo(conBalanceo);
	}
	
	public double calcularCostoHoras() {
	    return COSTOHORA * this.getCantHoras();	
	}

	public double calcularPrecioCosto() {
		double costo = 0;
		if (this.getIncluyeBalanceo()) {
			costo = this.calcularCostoHoras()+EXTRABALANCEO;
		} else {
			costo = this.calcularCostoHoras();
		}
		return costo;
	}

	private int getCantHoras() {
		return cantHoras;
	}
	
	private void setCantHoras(int cantHoras) {
		this.cantHoras = cantHoras;
	}
	
	private boolean getIncluyeBalanceo() {
		return incluyeBalanceo;
	}
	
	private void setIncluyeBalanceo(boolean incluyeBalanceo) {
		this.incluyeBalanceo = incluyeBalanceo;
	}

}
