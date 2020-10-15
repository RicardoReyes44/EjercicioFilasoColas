import java.util.Arrays;

public class ImplementacionFilaEstatica implements RegistroImpresiones{

	private Impresion imp[];
	private int ultimo = -1;

	public ImplementacionFilaEstatica(int tamaño) {
		imp = new Impresion[tamaño];
	}

	@Override
	public boolean agregarElemento(Impresion imp) {
	    if(!verificarPilaLlena()) {
	    	this.imp[++ultimo] = imp;
	    	return true;
	    }else {
	    	return false;
	    }
	}

	@Override
	public Impresion eliminarElemento() {
		if(!verificarPilaVacia()) {
			Impresion e = imp[0];
			recorrer();
			imp[ultimo] = null;
			ultimo--;
			return e;
		}else {
			return null;
		}
	}

	@Override
	public int mostrarTamaño() {
		return ultimo+1;
	}

	@Override
	public boolean verificarPilaLlena() {
		return ultimo+1==imp.length;
	}

	@Override
	public boolean verificarPilaVacia() {
		return ultimo==-1;
	}

	@Override
	public Impresion mostrarFrente() {
		if(!verificarPilaVacia()) {
			return imp[0];
		}else {
			return null;
		}
	}

	@Override
	public void recorrer() {
		for(int i=1; i<=ultimo; i++) {
			imp[i-1] = imp[i];
		}
	}

	@Override
	public String toString() {
		return "ImplementacionFilaEstatica [imp=" + Arrays.toString(imp) + ", ultimo=" + ultimo + "]";
	}
}
