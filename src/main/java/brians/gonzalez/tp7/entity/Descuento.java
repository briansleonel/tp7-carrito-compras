package brians.gonzalez.tp7.entity;

public abstract class Descuento {
	private double valorDescuento;

	public Descuento() {
		super();
	}

	public Descuento(double valorDescuento) {
		super();
		this.valorDescuento = valorDescuento;
	}

	public abstract double valorDescuento(double precioBase);

	public abstract double precioDescuento(double precioBase);

	public double getValorDescuento() {
		return valorDescuento;
	}

	public void setValorDescuento(double valor) {
		this.valorDescuento = valor;
	}
}
