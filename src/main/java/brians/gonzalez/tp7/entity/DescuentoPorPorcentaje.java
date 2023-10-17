package brians.gonzalez.tp7.entity;

import java.time.LocalDate;

public class DescuentoPorPorcentaje extends Descuento {

	private Double porcentaje;

	public DescuentoPorPorcentaje() {
	}

	public DescuentoPorPorcentaje(Double porcentaje) {
		super();
		this.porcentaje = porcentaje;
	}

	public DescuentoPorPorcentaje(LocalDate comienzo, LocalDate fin) {
		super(comienzo, fin);
	}

	public DescuentoPorPorcentaje(LocalDate comienzo, LocalDate fin, Double porcentaje) {
		super(comienzo, fin);
		this.porcentaje = porcentaje;
	}

	@Override
	public double descuento(double base) {
		return porcentaje * base;
	}

	@Override
	public String tipoDescuento() {
		return "descuento del " + porcentaje * 100 + "%";
	}

	public Double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(Double porcentaje) {
		this.porcentaje = porcentaje;
	}
}
