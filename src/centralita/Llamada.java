package centralita;

import java.util.ArrayList;

public abstract class Llamada extends Centralita {

	private String numeroOrigen;
	private String numeroDestino;
	private Double duracion;

	public Llamada(String numeroOrigen, String numeroDestino, Double duracion) {
		setNumeroOrigen(numeroOrigen);
		this.numeroDestino = numeroDestino;
		setDuracion(duracion);

	}

	public String getNumeroOrigen() {
		return numeroOrigen;
	}

	public void setNumeroOrigen(String numeroOrigen) throws IllegalArgumentException {

		if (numeroOrigen == null || numeroOrigen.isEmpty() || numeroOrigen.length() < 9)
			throw new IllegalArgumentException("tlf. origen error");

		this.numeroOrigen = numeroOrigen;
	}

	public String getNumeroDestino() {
		return numeroDestino;
	}

	public void setNumeroDestino(String  numeroDestino) {
		this.numeroDestino = numeroDestino;
	}

	public Double getDuracion() {
		return duracion;
	}
 
	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}

	public abstract Double coste();

	@Override
	public String toString() {
		return "  numeroOrigen=" + numeroOrigen + ", numeroDestino=" + numeroDestino + ", duracion=" + duracion;
	}
}
