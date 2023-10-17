package brians.gonzalez.tp7.entity;

public class SinDescuento extends Descuento {
	public SinDescuento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SinDescuento(double valorDescuento) {
		super(valorDescuento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double valorDescuento(double precioBase) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double precioDescuento(double precioBase) {
		// TODO Auto-generated method stub
		return precioBase;
	}

}
