package brians.gonzalez.tp7.entity;

import java.time.LocalDate;

public abstract class Descuento {
	private LocalDate comienzo;
	private LocalDate fin;

	public Descuento() {
		super();
	}

	public Descuento(LocalDate comienzo, LocalDate fin) {
		super();
		this.comienzo = comienzo;
		this.fin = fin;
	}

	public abstract double descuento(double base);

	public abstract String tipoDescuento();

	public LocalDate getComienzo() {
		return comienzo;
	}

	public void setComienzo(LocalDate comienzo) {
		this.comienzo = comienzo;
	}

	public LocalDate getFin() {
		return fin;
	}

	public void setFin(LocalDate fin) {
		this.fin = fin;
	}
}
