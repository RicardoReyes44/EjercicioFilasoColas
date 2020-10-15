import java.util.LinkedList;
import java.util.Queue;

public class ImplementacionFilaDinamica implements RegistroImpresiones{

	private Queue<Integer> imp;
	private int ultimo = -1;
	
	public ImplementacionFilaDinamica() {
	    imp = new LinkedList<Integer>();
	}

	@Override
	public boolean agregarElemento(Impresion imp) {
		return true;
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
		return imp.size()==ultimo;
	}

	@Override
	public Impresion mostrarFrente() {
		// TODO Auto-generated method stub
		return null;
	}
}
