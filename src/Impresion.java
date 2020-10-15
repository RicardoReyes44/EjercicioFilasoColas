
public class Impresion {
	
	int identificador;
	int cantidadDeHojas;
	byte tamaño;

	public Impresion(int identificador, int cantidadDeHojas, byte tamaño) {
		this.identificador = identificador;
		this.cantidadDeHojas = cantidadDeHojas;
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Impresion [identificador=" + identificador + ", cantidadDeHojas=" + cantidadDeHojas + ", tamaño="
				+ tamaño + "]";
	}
}
