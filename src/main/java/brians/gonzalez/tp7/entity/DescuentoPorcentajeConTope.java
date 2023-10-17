package brians.gonzalez.tp7.entity;

public class DescuentoPorcentajeConTope extends Descuento {

	private Double porcentaje;
	private double monto;

	public DescuentoPorcentajeConTope() {
		super();
	}

	public DescuentoPorcentajeConTope(double valorDescuento) {
		super(valorDescuento);
		// TODO Auto-generated constructor stub
	}

	public DescuentoPorcentajeConTope(Double porcentaje, double monto) {
		super();
		this.porcentaje = porcentaje;
		this.monto = monto;
	}

	@Override
	public double valorDescuento(double precioBase) {
		double descuentoPorcentaje = porcentaje * precioBase;
		// System.out.println("Desc %: " + descuentoPorcentaje);
		// System.out.println("Desc F: " + monto);
		if (descuentoPorcentaje > monto)
			return monto;
		else
			return descuentoPorcentaje;
	}

	@Override
	public double precioDescuento(double precioBase) {
		double descuentoPorcentaje = porcentaje * precioBase;
		if (descuentoPorcentaje > monto)
			return precioBase - monto;
		else
			return precioBase - descuentoPorcentaje;
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
