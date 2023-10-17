package brians.gonzalez.tp7.entity;

public class DescuentoPorcentajeConTope extends Descuento {

	private Double porcentaje;
	private double monto;

	public DescuentoPorcentajeConTope() {
		super();
	}

	public DescuentoPorcentajeConTope(Double porcentaje, double monto) {
		super();
		this.porcentaje = porcentaje;
		this.monto = monto;
	}

	@Override
	public double descuento(double base) {
		double descuentoPorcentaje = porcentaje * base;
		System.out.println("Desc %: " + descuentoPorcentaje);
		System.out.println("Desc F: " + monto);
		if (descuentoPorcentaje > monto)
			return monto;
		else
			return descuentoPorcentaje;
	}

	@Override
	public String tipoDescuento() {
		return "descuento porcentaje con tope";
	}

	public Double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(Double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

}
