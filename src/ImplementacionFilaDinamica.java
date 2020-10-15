import java.util.LinkedList;
import java.util.Queue;

public class ImplementacionFilaDinamica implements RegistroImpresiones{

	private Queue<Impresion> impresiones;
	private int longitud = 0;
	
	public ImplementacionFilaDinamica() {
	    impresiones = new LinkedList<Impresion>();
	}

	@Override
	public boolean agregarElemento(Impresion imp) {
		    longitud++;
			impresiones.add(imp);
			return true;
	}

	@Override
	public Impresion eliminarElemento() {
		if(!verificarPilaVacia()) {
			longitud--;
			return impresiones.poll();
		}else {
			return null;
		}
	}
	
	@Override
	public int mostrarTamaño() {
		return impresiones.size();
	}

	@Override
	public boolean verificarPilaVacia() {
		return impresiones.size()==0;
	}

	@Override
	public Impresion mostrarFrente() {
		if(!verificarPilaVacia()) {
			return impresiones.element();
		}else {
			return null;
		}
	}

	@Override
	public boolean verificarPilaLlena() {
		return true;
	}

	@Override
	public void recorrer() {}

	@Override
	public String toString() {
		return "ImplementacionFilaDinamica [impresiones=" + impresiones + ", longitud=" + longitud + "]";
	}
}
