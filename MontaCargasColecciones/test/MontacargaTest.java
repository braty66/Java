

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.progra2.claseDeRepaso.Carga;
import ar.edu.unlam.progra2.claseDeRepaso.Montacargas;

public class MontacargaTest {
	
	
	@Test 
	
	public void testObtenerCarga(){
		
		Montacargas montaCarga1 = new Montacargas(300.0);
		Carga carga1 = new Carga(20.0);
		Carga carga2 = new Carga(20.0);
		Carga carga3 = new Carga(20.0);
		Carga carga4 = new Carga(20.0);
		Carga carga5 = new Carga(20.0);
		montaCarga1.cargar(carga1);
		montaCarga1.cargar(carga2);
		montaCarga1.cargar(carga3);
		montaCarga1.cargar(carga4);
		montaCarga1.cargar(carga5);
		
		
		Double valorEsperado = 100.0;
		
		Assert.assertEquals(valorEsperado,  montaCarga1.obtenerCarga());
 		
		
		
	}
	@Test
	public void testSiPuedoCargarSobrePeso() {
		Montacargas montaCarga1 = new Montacargas(300.0);
		Carga carga1 = new Carga(20.0);
		Carga carga2 = new Carga(20.0);
		Carga carga3 = new Carga(20.0);
		Carga carga4 = new Carga(20.0);
		Carga carga5 = new Carga(20.0);
		Carga carga6 = new Carga(250.0);
		montaCarga1.cargar(carga1);
		montaCarga1.cargar(carga2);
		montaCarga1.cargar(carga3);
		montaCarga1.cargar(carga4);
		montaCarga1.cargar(carga5);
		montaCarga1.cargar(carga6);
		
		Double valorEsperado = 100.0;
		
		Assert.assertEquals(valorEsperado,montaCarga1.obtenerCarga());
		
		
	}
	
	@Test 
	
	public void testSiPuedoDescargar() {
		Montacargas montaCarga1 = new Montacargas(300.0);
		Carga carga1 = new Carga(20.0);
		Carga carga2 = new Carga(20.0);
		Carga carga3 = new Carga(20.0);
		Carga carga4 = new Carga(20.0);
		Carga carga5 = new Carga(20.0);
		montaCarga1.cargar(carga1);
		montaCarga1.cargar(carga2);
		montaCarga1.cargar(carga3);
		montaCarga1.cargar(carga4);
		montaCarga1.cargar(carga5);
		montaCarga1.descargar();
		Double valorEsperado = 0.0;
		
		Assert.assertEquals(valorEsperado, montaCarga1.obtenerCarga());
		
	}
	@Test
	public void TestSiElPromedioFunciona() {
		Montacargas montaCarga1 = new Montacargas(300.0);
		Carga carga1 = new Carga(20.0);
		montaCarga1.cargar(carga1);
		montaCarga1.descargar();
		Carga carga2 = new Carga(20.0);
		montaCarga1.cargar(carga2);
		montaCarga1.descargar();
		Carga carga3 = new Carga(50.0);
		montaCarga1.cargar(carga3);
		montaCarga1.descargar();
		Double valorEsperado = 30.0;
		Double valorObtenido = montaCarga1.obtenerCargaPromedio();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
	}

}
