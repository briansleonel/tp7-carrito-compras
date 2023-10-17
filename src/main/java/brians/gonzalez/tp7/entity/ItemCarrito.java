package brians.gonzalez.tp7.entity;

public class ItemCarrito {
	private int cantidad;
	private Producto producto;

	public ItemCarrito() {
	}

	public ItemCarrito(int cantidad, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}

	public double precio() {
		return cantidad * producto.getPrecio();
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
}
