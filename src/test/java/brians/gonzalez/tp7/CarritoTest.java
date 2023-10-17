package brians.gonzalez.tp7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import brians.gonzalez.tp7.entity.Carrito;
import brians.gonzalez.tp7.entity.Descuento;
import brians.gonzalez.tp7.entity.DescuentoFijo;
import brians.gonzalez.tp7.entity.DescuentoPorPorcentaje;
import brians.gonzalez.tp7.entity.DescuentoPorcentajeConTope;
import brians.gonzalez.tp7.entity.ItemCarrito;
import brians.gonzalez.tp7.entity.Producto;
import brians.gonzalez.tp7.entity.SinDescuento;
import junit.framework.TestCase;

public class CarritoTest extends TestCase {

	private Carrito carrito;

	public void cargarCarrito() {
		Path carritoFile = Paths.get("./src/main/java/carrito.txt");

		List<ItemCarrito> items = new ArrayList<ItemCarrito>();

		try {
			// Creo el objeto de items del carrito leidos desde el archivo
			for (String texto : Files.readAllLines(carritoFile)) {
				String[] carritoSeparado = texto.split(",");

				Producto producto = new Producto();
				producto.setNombre(carritoSeparado[2]);
				producto.setPrecio(Double.parseDouble(carritoSeparado[1]));

				ItemCarrito item = new ItemCarrito(Integer.parseInt(carritoSeparado[0]), producto);

				items.add(item);
			}

			carrito = new Carrito();
			carrito.setItemsCarrito(items);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// Descuento desc = new DescuentoPorPorcentaje(0.2);
	// Descuento desc = new DescuentoPorcentajeConTope(0.2, 40);

	@Test
	public void testMetodoPrecioDelCarritoSinDescuento() {
		cargarCarrito();

		Descuento desc = new SinDescuento();

		assertEquals(270.0, carrito.getCostoFinal(desc));
	}

	@Test
	public void testMetodoPrecioDelCarritoConDescuentoPorPorcentaje() {
		cargarCarrito();

		Descuento desc = new DescuentoPorPorcentaje();
		desc.setValorDescuento(0.2); // Descuento del 20%

		assertEquals(216.0, carrito.getCostoFinal(desc));
	}

	@Test
	public void testMetodoPrecioDelCarritoConDescuentoFijo() {
		cargarCarrito();

		Descuento desc = new DescuentoFijo();
		desc.setValorDescuento(43.6);
		assertEquals(226.4, carrito.getCostoFinal(desc));
	}

	@Test
	public void testMetodoPrecioDelCarritoConDescuentoPorPorcentajeYTopeEnfatizandoDescuentoPorcentaje() {
		cargarCarrito();

		Descuento desc = new DescuentoPorcentajeConTope(0.2, 60);

		assertEquals(216.0, carrito.getCostoFinal(desc));
	}

	@Test
	public void testMetodoPrecioDelCarritoConDescuentoPorPorcentajeYTopeEnfatizandoDescuentoPorTope() {
		cargarCarrito();

		Descuento desc = new DescuentoPorcentajeConTope(0.2, 43.6);

		assertEquals(226.4, carrito.getCostoFinal(desc));
	}
}
