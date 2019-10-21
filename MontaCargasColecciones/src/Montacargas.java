import java.util.ArrayList;

public class Montacargas {
	
	private Double pesoMaximo = 0.0;
	private ArrayList <Carga> montaCarga = new ArrayList<>();
	private Double pesoActual = 0.0;
	private ArrayList <Double> descargas = new ArrayList<>();
	public Montacargas(Double pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}
	public Double obtenerCarga() {
		
		for(int i = 0 ;i < montaCarga.size();i++) {
			pesoActual += montaCarga.get(i).getPesoKg(); 
		}
		return pesoActual;
	}
	public void cargar(Carga carga) {
		  Double  pesoActualMasCargaActual = carga.getPesoKg() + pesoActual;
		if (pesoActualMasCargaActual < pesoMaximo) {
			montaCarga.add(carga);
			
		}
		
	}
	public void descargar(){//baja del montacargas toda la carga que tiene.
		
		Double pesoDescarga = 0.0;
		for (int i =0; i< montaCarga.size();i++) {//(Carga carga:montaCarga) {
			pesoDescarga += montaCarga.get(i).getPesoKg();
			
			}
		descargas.add(pesoDescarga);
		montaCarga.clear();
		
	}
	public Double obtenerCargaPromedio() { //Devuelve el peso kg promedio de las cargas completadas (cargadas y luego descargadas)
	        Double pesoDescargas= 0.0;
	        Double cargaPromedio = 0.0;
	        
		for(int i =0 ;i<descargas.size();i++) {//(Double promedio: descargas) {
		    pesoDescargas += descargas.get(i).doubleValue();
		    }
	    cargaPromedio = (pesoDescargas / (double)descargas.size()); 
	    return cargaPromedio;
	}
	
}