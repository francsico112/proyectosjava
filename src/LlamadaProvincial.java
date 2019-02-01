
public class LlamadaProvincial extends Llamadas {
	
		// franja 1 0h - 7h
			// franja 2 8h - 15h
			// franja 1 16h - 23h
			private static final int[] costesProv = { 20, 25, 30 };
			private int precio;
			private int franja;
			
			
			public LlamadaProvincial(String nombre, String llamadaOrigen, String llamadaDestino, Double duracion, int franja) {
				
				super(nombre, llamadaOrigen, llamadaDestino, duracion);
				this.franja = franja;
				if (this.franja == 1) {
					this.precio= this.costesProv[franja - 1];
				} else if (this.franja==2) {
					this.precio= this.costesProv[franja - 1];
				} else {
					this.franja = 3;
					this.precio= this.costesProv[franja - 1];
				}

			}

			public int getFranja() {
				return franja;
			}

			public void setFranja(int franja) {
				this.franja = franja;
			}

			
	
	
	
	

	
		

	

	
	
	
	
}
