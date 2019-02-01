package centralita;

public class LlamadaProvincial extends Llamada {

	private Double precio;
	private int franja;

	public LlamadaProvincial(String numeroOrigen,String numeroDestino, Double duracion, int franja) {
		super(numeroOrigen, numeroDestino, duracion);
		setFranja(franja);
		if (this.franja == 1)
			this.precio = 0.15;
		else if (this.franja == 2)
			this.precio = 0.25;
		else
			this.precio = 0.30;
	}

	public int getFranja() {
		return franja;
	}

	public void setFranja(int franja) {

		if (franja == 1 | franja == 2 | franja == 2)
			this.franja = franja;
		else
			throw new IllegalArgumentException("no es correcto lo que has introducido");
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public Double coste() {

		return getPrecio() * getDuracion();
	}
}