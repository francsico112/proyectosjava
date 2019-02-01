package centralita;

import java.util.ArrayList;

public class Centralita {

	public static int numeroLlamadasLocal;
	public static int numeroLlamadasProvincial;
	public static Double costeTotal;
	private ArrayList<Llamada> registro;

	public Centralita() {
		this.numeroLlamadasLocal = 0;
		this.numeroLlamadasProvincial = 0;
		this.costeTotal = 0d;
		this.registro = new ArrayList<Llamada>();
	}

	public String añadirLlamada(Llamada ll) {

		registro.add(ll);
		return "La llamada" + ll + " ha quedado grabada";
	}

	public int contar() {

		return registro.size();

	}

	public int contarLlamadasLocales() {

		for (Llamada llamada : registro) {
			if (llamada instanceof LlamadaLocal)
				this.numeroLlamadasLocal++;

		}
		return this.numeroLlamadasLocal;

	}

	public int contarLlamadasProvinciales() {

		for (Llamada llamada : registro) {
			if (llamada instanceof LlamadaProvincial)
				this.numeroLlamadasProvincial++;

		}
		return this.numeroLlamadasProvincial;

	}

	public Double totalPrecioLlamadas() {

		for (Llamada llamada : registro) {
			this.costeTotal += llamada.coste();
		}
		return costeTotal;

	}

}
