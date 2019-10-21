import org.junit.Assert;
import org.junit.Test;

public class MontacargaTest{
	
	@Test
	public void testSiPuedoCargar() {
		Carga carga1 = new Carga (20.0);
		Carga carga2 = new Carga (40.0);
		Carga carga3 = new Carga (30.0);
		Montacargas montaCarga1 = new Montacargas(100.0);
		montaCarga1.cargar(carga3);
		montaCarga1.cargar(carga2);
		montaCarga1.cargar(carga1);
		Double valorEsperado = 90.0;
		Assert.assertEquals(valorEsperado,montaCarga1.obtenerCarga());
		
	}
	
	@Test
	public void testSiDescarga() {
		Carga carga1 = new Carga (20.0);
		Carga carga2 = new Carga (40.0);
		Carga carga3 = new Carga (30.0);
		Montacargas montaCarga1 = new Montacargas(100.0);
		montaCarga1.cargar(carga3);
		montaCarga1.cargar(carga2);
		montaCarga1.cargar(carga1);
		montaCarga1.descargar();
		Double valorEsperado = 0.0;
		Assert.assertEquals(valorEsperado,montaCarga1.obtenerCarga());
	}
	@Test 
	public void testCargaPromedio() {
		Carga carga1 = new Carga (20.0);
		Carga carga2 = new Carga (40.0);
		Carga carga3 = new Carga (30.0);
		Montacargas montaCarga1 = new Montacargas(100.0);
		montaCarga1.cargar(carga3);
		montaCarga1.cargar(carga2);
		montaCarga1.cargar(carga1);
		montaCarga1.descargar();
		montaCarga1.cargar(carga3);
		montaCarga1.cargar(carga2);
		montaCarga1.cargar(carga1);
		montaCarga1.descargar();
		montaCarga1.cargar(carga3);
		montaCarga1.cargar(carga2);
		montaCarga1.cargar(carga1);
		montaCarga1.descargar();
		
		
		Double valorEsperado = 90.0;
		Assert.assertEquals(valorEsperado,montaCarga1.obtenerCargaPromedio());
	}
	
	@Test 
	public void testSiDescargo(){
		Carga carga1 = new Carga (20.0);
		Carga carga2 = new Carga (40.0);
		Carga carga3 = new Carga (30.0);
		Montacargas montaCarga1 = new Montacargas(100.0);
		montaCarga1.cargar(carga3);
		montaCarga1.cargar(carga2);
		montaCarga1.cargar(carga1);
		montaCarga1.descargar();
		Double valorEsperado = 0.0;
		Assert.assertEquals(valorEsperado,montaCarga1.obtenerCarga());
	}
	@Test
	public void testSiCargaSobrePeso() {
		Carga carga1 = new Carga (100.0);
		Carga carga2 = new Carga (40.0);
		Carga carga3 = new Carga (30.0);
		Montacargas montaCarga1 = new Montacargas(100.0);
		montaCarga1.cargar(carga3);
		montaCarga1.cargar(carga2);
		montaCarga1.cargar(carga1);
		
		Double valorEsperado = 70.0;
		Assert.assertEquals(valorEsperado,montaCarga1.obtenerCarga());
		
		
		
	}

}