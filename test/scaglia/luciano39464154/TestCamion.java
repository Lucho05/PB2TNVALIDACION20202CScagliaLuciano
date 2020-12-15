package scaglia.luciano39464154;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import scaglia.luciano39464154.Camion;
import scaglia.luciano39464154.Producto;
import scaglia.luciano39464154.TiendaCamion;

public class TestCamion {

	// opcional
	@Test
	public void queSeAgregueUnProducto() {
		Camion camion = new Camion("adc987");
		Producto producto = new Producto(1, 10000.0, "xxxxx", 70.5);
		
		assertTrue(camion.cargarProducto(producto));
		
	}

	// opcional
	@Test
	public void queSeDescargueUnProducto() {

	}

	// obligatorio
	@Test
	public void queDescargueUnProductoInexistenteLanceUnaException() throws Exception{
		Camion camion = new Camion("adc987");
		
		try {
			camion.descargarProducto((Integer)1);
		} catch (Exception e) {
			
		}
	}

}
