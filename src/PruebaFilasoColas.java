import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaFilasoColas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ImplementacionFilaDinamica ifd = null;
		ImplementacionFilaEstatica ife = null;
		boolean candado = true;
		byte opcionFila = 0;
		int identificador = 0;
		
		while(candado) {
			System.out.println("1.- Fila estatica");
			System.out.println("2.- Fila dinamica");
			System.out.print("Introduce opcion: ");

			try {
			opcionFila = entrada.nextByte();

			switch(opcionFila) {
			case 1:
				int tamaño;
				
				while(true) {
					System.out.print("Introduce tamaño: ");
					tamaño = entrada.nextInt();

					if(tamaño>0) {
						break;
					}else {
						System.out.println("Tamaño invalido, el tamaño debe ser mayor 0");
					}
				}

				ife = new ImplementacionFilaEstatica(tamaño);
				candado = false;
				break;

			case 2:
				ifd = new ImplementacionFilaDinamica();
				candado = false;
				break;

			default:
				System.out.println("Opcion invalida");
				break;
			}
		    }catch(InputMismatchException error){
				System.out.println("\nError en la entrada de datos <" + error + ">, por favor vuelve a intentarlo");
				entrada.nextLine();
			}
		}


		candado = true;
		while(candado) {

			System.out.println("\n-------------------------------------\nMENU\n-------------------------------------\n1.- Agregar impresion\n"
					+ "2.- Imprimir\n" 
					+ "3.- Mostrar cantidad de impresiones restantes\n"
					+ "4.- Ver impresion en espera\n"
					+ "5.- Salir");
			System.out.print("Introduce opcion: ");

			try{
			byte opcion = entrada.nextByte();
			
			System.out.println();
			
			switch(opcion) {
			case 1:
				int cantidadDeHojas;
				byte tamaño;
				boolean val;
				
				while(true) {
					try {
					System.out.print("Introduce cantida de hojas: ");
					cantidadDeHojas = entrada.nextInt();
					System.out.print("Tamaño: ");
					tamaño = entrada.nextByte();
					break;
					}catch(InputMismatchException error){
						System.out.println("\nError en la entrada de datos <" + error + ">, por favor vuelve a intentarlo");
						entrada.nextLine();
					}
				}
				
				Impresion elemento = new Impresion(++identificador, cantidadDeHojas, tamaño);
				
				if(opcionFila==1) {
					val = ife.agregarElemento(elemento);
				}else {
					val = ifd.agregarElemento(elemento);
				}
				
				if(val) {
					System.out.println(val);
				}else {
					System.out.println("No tienes espacio\n\n");
					--identificador;
				}
				break;


			case 2:
				if(opcionFila==1) {
					System.out.println("Impresion obtenida: " + ife.eliminarElemento());
				}else {
				    System.out.println("Impresion obtenida: " + ifd.eliminarElemento());
				}
				break;


            case 3:
            	if(opcionFila==1) {
					System.out.println("Impresiones restantes: " + ife.mostrarTamaño());
				}else {
					System.out.println("Impresiones restantes: " + ifd.mostrarTamaño());
				}
				break;


			case 4:
				if(opcionFila==1) {
					System.out.println("Impresion en espera: " + ife.mostrarFrente());
				}else {
					System.out.println("Impresion en espera: " + ifd.mostrarFrente());
				}
				break;


			case 5:
				candado = false;
				break;


			default:
				System.out.println("Opcion invalida");
				break;
			}
		    }catch(InputMismatchException error) {
		    	entrada.nextLine();
		    	System.out.println("Error en la entrada de datos <" + error + ">\n\n");
		    }
			/*System.out.println(ifd);
			System.out.println(ife);*/
			System.out.println();
		}
		
		System.out.println("Programa terminado :)");
		
	}

}
