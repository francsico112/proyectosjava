package centralita;

public class LlamadaLocal extends Llamada {

	private Double precio;

	public LlamadaLocal(String numeroOrigen, String numeroDestino, Double duracion) {
		super(numeroOrigen, numeroDestino, duracion);
		this.precio = 0.15;

	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public Double coste() {

		return getPrecio() * getDuracion();
	}

}
