import java.util.ArrayList;

public class Centralita {
	
	private String nombre;
	private static int contadorLlamadas;
	private static int costeTotalLLamadas;
	private static int contadorLlamadasLocales;
	private static int contadorLlamadasProvinciales;
	private static int CosteLlamadasLocales;
	private static int CosteLlamadasProvinciales;
	
	
	private ArrayList <Llamadas> listaLlamadas;
	
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	

	public Centralita(String nombre) {
		super();
		this.nombre = nombre;
		contadorLlamadas++;
		this.listaLlamadas = new ArrayList <Llamadas>();
	}
	// -------------------------------------------------------------------------------------------------------------------------------------------------------
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getContadorLlamadas() {
		return contadorLlamadas;
	}

	public static void setContadorLlamadas(int contadorLlamadas) {
		Centralita.contadorLlamadas = contadorLlamadas;
	}

	public static int getCosteTotalLLamadas() {
		return costeTotalLLamadas;
	}

	public static void setCosteTotalLLamadas(int costeTotalLLamadas) {
		Centralita.costeTotalLLamadas = costeTotalLLamadas;
	}

	public ArrayList<Llamadas> getListaLlamadas() {
		return listaLlamadas;
	}

	public void setListaLlamadas(ArrayList<Llamadas> listaLlamadas) {
		this.listaLlamadas = listaLlamadas;
	}

	public static int getContadorLlamadasLocales() {
		return contadorLlamadasLocales;
	}

	public static void setContadorLlamadasLocales(int contadorLlamadasLocales) {
		Centralita.contadorLlamadasLocales = contadorLlamadasLocales;
	}

	public static int getContadorLlamadasProvinciales() {
		return contadorLlamadasProvinciales;
	}

	public static void setContadorLlamadasProvinciales(int contadorLlamadasProvinciales) {
		Centralita.contadorLlamadasProvinciales = contadorLlamadasProvinciales;
	}

	public static int getCosteLlamadasLocales() {
		return CosteLlamadasLocales;
	}

	public static void setCosteLlamadasLocales(int costeLlamadasLocales) {
		CosteLlamadasLocales = costeLlamadasLocales;
	}

	public static int getCosteLlamadasProvinciales() {
		return CosteLlamadasProvinciales;
	}

	public static void setCosteLlamadasProvinciales(int costeLlamadasProvinciales) {
		CosteLlamadasProvinciales = costeLlamadasProvinciales;
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------

	public void añadirLista(Llamadas ll) {
		
		listaLlamadas.add(ll);
	}
	public int precioTotal() {

}
