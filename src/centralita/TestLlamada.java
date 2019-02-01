package centralita;

public class TestLlamada {

	public static void main(String[] args) {

		Centralita c = new Centralita();

		c.añadirLlamada(new LlamadaLocal("617401547", "54948484", 20d));
		c.añadirLlamada(new LlamadaLocal("677471547", "54948483", 10d));
		

		System.out.println(c.contarLlamadasLocales());
		System.out.println(c.contarLlamadasProvinciales());
		System.out.println(c.totalPrecioLlamadas());

		
	}

}
