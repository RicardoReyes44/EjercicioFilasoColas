import java.util.LinkedList;
import java.util.Queue;

public class ImplementacionFilaDinamica implements RegistroImpresiones{

	Queue<Integer> imp;
	
	public ImplementacionFilaDinamica() {
	    imp = new LinkedList<Integer>();
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
