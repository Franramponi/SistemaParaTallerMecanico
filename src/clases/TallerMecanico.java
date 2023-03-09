package clases;
import java.util.ArrayList;

public class TallerMecanico {

	private ArrayList<Servicio> serviciosEfectuados;
	private String nombre;
	
	private static final String FORMATO_CANTIDADES = "Se efectuaron: %d cambios de aceite, %d encendido y %d alineacion , total %s \n";

	
	public TallerMecanico(String nombre) {
		this.nombre = nombre;
		this.serviciosEfectuados = new ArrayList<Servicio>();
	}
	
	public boolean agregarServicio(Servicio nuevoServicio) {
		boolean pudo = false;
		if (nuevoServicio!=null) {
			pudo = this.serviciosEfectuados.add(nuevoServicio);
		}
		return pudo;
	}
	
	public void listarServicios() {
		
		System.out.println("Taller " + nombre);
		int cambioAceite = 0;
		int alineacion = 0;
		int inyeccion = 0;
		double total = 0;

		for (Servicio unServicio : this.serviciosEfectuados) {
			if (unServicio instanceof CambioAceite) {
				cambioAceite++;
			}
			if (unServicio instanceof Encendido) {
				inyeccion++;
			}
			if (unServicio instanceof Alineacion) {
				alineacion++;
			}
			total += unServicio.calcularPrecioVenta();
		}
		System.out.printf(FORMATO_CANTIDADES, cambioAceite,inyeccion,alineacion, total);
		System.out.println("El importe total de ventas es de $"+total);
	}
}
