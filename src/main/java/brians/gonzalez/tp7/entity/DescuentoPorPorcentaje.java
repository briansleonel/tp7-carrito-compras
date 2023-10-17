package brians.gonzalez.tp7.entity;

public class DescuentoPorPorcentaje extends Descuento {

	public DescuentoPorPorcentaje() {
		super();
	}

	public DescuentoPorPorcentaje(double valorDescuento) {
		super(valorDescuento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double valorDescuento(double precioBase) {
		// TODO Auto-generated method stub
		return precioBase * this.getValorDescuento();
	}

	@Override
	public double precioDescuento(double precioBase) {
		return precioBase - (precioBase * this.getValorDescuento());
	}

}
