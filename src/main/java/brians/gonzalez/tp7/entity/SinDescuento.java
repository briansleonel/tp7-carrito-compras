package brians.gonzalez.tp7.entity;

public class SinDescuento extends Descuento {

	@Override
	public double descuento(double base) {
		return 0;
	}

	@Override
	public String tipoDescuento() {
		return "Sin descuento";
	}

}
