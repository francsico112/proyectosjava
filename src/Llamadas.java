
public abstract class  Llamadas extends Centralita  {
	
	private String LlamadaOrigen;
	private String LlamadaDestino;
	private Double duracion;
	private Double precioLlamada;
	
	
	
	
	public Llamadas(String nombre, String llamadaOrigen, String llamadaDestino, Double duracion) {
		super(nombre);
		LlamadaOrigen = llamadaOrigen;
		LlamadaDestino = llamadaDestino;
		this.duracion = duracion;
		
		
	}
	
	
	
	
	
	public String getLlamadaOrigen() {
		return LlamadaOrigen;
	}
	public void setLlamadaOrigen(String llamadaOrigen) {
		LlamadaOrigen = llamadaOrigen;
	}
	public String getLlamadaDestino() {
		return LlamadaDestino;
	}
	public void setLlamadaDestino(String llamadaDestino) {
		LlamadaDestino = llamadaDestino;
	}
	public Double getDuracion() {
		return duracion;
	}
	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}
	
	
	
	
	public abstract Double precioLlamada();
	
	
	
	
	
	
	
	
	
	
	

}
