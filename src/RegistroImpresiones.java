
/*
 * 0) Crear FILA
 * 1) Insertar/Agregar (PUSH)
 * 2) Eliminar/Sacar (PULL)
 * 
 * 3) Verificar si fila llena
 * 4) verificar si fila vacia
 * 
 * 5) Mostrar FRENTE
 * 
 * */

public interface RegistroImpresiones {

	public boolean agregarElemento();
	public Impresion eliminarElemento();
	public boolean verificarPilaLlena();
	public boolean verificarPilaVacia();
	public Impresion mostrarFrente();
}
