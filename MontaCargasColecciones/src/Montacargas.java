

import java.util.LinkedList;

public class Montacargas {
	
	private Double pesoMaximoKg; 
	private int cantidadDeDescargas;
    
	LinkedList <Carga> listaDeCargas = new LinkedList <Carga>(); 
    
	public Montacargas( Double pesoMaximoKg) {
		this.pesoMaximoKg = pesoMaximoKg;
	}
    
	 public Double obtenerCarga() {
		 Double  cargaActual = 0.0d; 
		 int i;
		 for ( i = 0 ; i < listaDeCargas.size();i++ ) {
			cargaActual += listaDeCargas.get(i).getPesoKg();
			 
		}
		 return cargaActual;
	 }
	 public boolean cargar(Carga carga) {
	
	Double	 cargaRestante = pesoMaximoKg - obtenerCarga();
		
		 if (cargaRestante > carga.getPesoKg()&& carga.getPesoKg() > 0) {
			
		
			listaDeCargas.add(carga);
			return true;
	 	}
	 	else {
	 	return false;
	 	}
	 	
	 }
	 public Double   descargar(){
	 		
	 		Double pesoDescargado = 0.0d;
	 		
	        if (obtenerCarga().doubleValue() > 0){
	        ++cantidadDeDescargas;
	        pesoDescargado = obtenerCarga().doubleValue();
	        
	        listaDeCargas.clear();
	     
	 }
	return pesoDescargado;
	 }
	 
	 public double obtenerCargaPromedio(){
	       Double cargaPromedio = 0.0;
	    return cargaPromedio =  descargar()/cantidadDeDescargas;
	    
	    
	
	 
	 }
	 
 
 
 }