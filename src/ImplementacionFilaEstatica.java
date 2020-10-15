
public class ImplementacionFilaEstatica implements RegistroImpresiones{

	Impresion imp[];
	int ultimo = 0;

	public ImplementacionFilaEstatica(int tamaño) {
		imp = new Impresion[tamaño];
	}

	@Override
	public boolean agregarElemento() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Impresion eliminarElemento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verificarPilaLlena() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verificarPilaVacia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Impresion mostrarFrente() {
		// TODO Auto-generated method stub
		return null;
	}
}
