
public class LlamadaLocal extends Llamadas {
	
	private Double precio;

	

	public LlamadaLocal(String nombre, String llamadaOrigen, String llamadaDestino, Double duracion) {
		super(nombre, llamadaOrigen, llamadaDestino, duracion);
		this.precio = 15d;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public Double precioLlamada() {
		
		return null;
	}
	
	
	
	
	

}
