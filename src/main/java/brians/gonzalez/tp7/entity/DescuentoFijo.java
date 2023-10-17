package brians.gonzalez.tp7.entity;

public class DescuentoFijo extends Descuento {

	public DescuentoFijo() {
	}

	public DescuentoFijo(double valorDescuento) {
		super(valorDescuento);
	}

	@Override
	public double valorDescuento(double precioBase) {
		// TODO Auto-generated method stub
		return this.getValorDescuento();
	}

	@Override
	public double precioDescuento(double precioBase) {
		// TODO Auto-generated method stub
		return precioBase - this.getValorDescuento();
	}

}
