package indianaJeans;

import java.util.Scanner;


	public class Menu {
	Scanner sc= new Scanner (System.in);
	ProductoServicio lista = new ProductoServicio();
	
	public Menu() {
		desplegarMenu();
	}

	public void desplegarMenu() {
		String opcion;

		do {
			System.out.println("------------------------------");
			System.out.println("-----Tienda INDIANA Jeans-----");
			System.out.println("1. Listar Producto");
			System.out.println("2. Agregar Producto");
			System.out.println("3. Exportar Datos");
			System.out.println("4. Salir");
			System.out.println("-----------------------------");
			System.out.println("Ingrese una opción:");
			opcion = sc.nextLine();

			if (opcion.equals("1")) {
				lista.listarProductos();
			} else if (opcion.equals("2")) {
				lista.agregarProductos();
			} else if (opcion.equals("3")) {
				System.out.println("Exportar Datos");
				System.out.println("Ingrese la opción 1 para exportar:");
				if (sc.nextLine().equals("1")) {
					System.out.println("Ingresa la ruta en donde desea exportar el archivo .txt:");
					String ruta = sc.nextLine();
					ExportadorTxt exportador = new ExportadorTxt();
					exportador.exportar(lista.listarProductos(),ruta);
					System.out.println("Datos de producto exportados correctamente en formato .txt");
					System.out.println();
				}
			} else if (opcion.equals("4")) {
				Utilidad.limpiarPantalla();
				Utilidad.tiempoEspera();
			} else {
				System.out.println("Ingrese una opcion valida");
			}
		} while (!opcion.equals("4"));
				
	}
	

}
