package indianaJeans;

import java.util.ArrayList;
import java.util.Scanner;


public class ProductoServicio {
	
	Scanner sc = new Scanner (System.in);
	
	ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		
		public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	@Override
	public String toString() {
		return "ProductoServicio [listaProductos=" + listaProductos + "]";
	}
	
	/*public String listarProductos() {
		String lista = "";
		for(Producto producto : listaProductos) {
			if (lista == "") {
				lista= producto.toString();
				System.out.println(lista);
			}
			System.out.println("-----------------------------");
		}
		return lista;
	}
	*/
	public String listarProductos() {
        String lista = "";
        for (Producto prodTemp : listaProductos) {
            if (lista == "")
                lista = String.format(
                        "Datos del producto:\n\nNombre artículo: %s \nCódigo:%s \nMarca: %s \nColor: %s \nDescripción: %s \nPrecio: %s \nTalla: %s \n\n",
                        prodTemp.getArticulo(), prodTemp.getCodigo(), prodTemp.getMarca(), prodTemp.getColor(),
                        prodTemp.getDescripcion(), prodTemp.getPrecio(), prodTemp.getTalla());
            else
                lista += String.format(
                        "Datos del producto:\n\nNombre artículo: %s \nCódigo:%s \nMarca: %s \nColor: %s \nDescripción: %s \nPrecio: %s \nTalla: %s \n\n",
                        prodTemp.getArticulo(), prodTemp.getCodigo(), prodTemp.getMarca(), prodTemp.getColor(),
                        prodTemp.getDescripcion(), prodTemp.getPrecio(), prodTemp.getTalla());
        }
        System.out.println(lista);
        return lista;
    }
    
	public void agregarProductos() {
		 
		Producto producto;
		
		System.out.println("Crear Producto");
		System.out.println("Ingresar nombre articulo:");
		String articulo = sc.nextLine();
		System.out.println("Ingresar precio:");
		String precio = sc.nextLine();
		System.out.println("Ingresar descripcion:");
		String descripcion = sc.nextLine();
		System.out.println("Ingresar codigo:");
		String codigo = sc.nextLine();
		System.out.println("Ingresar talla:");
		String talla = sc.nextLine();
		System.out.println("Ingresar marca:");
		String marca = sc.nextLine();
		System.out.println("Ingresar color:");
		String color = sc.nextLine();
		producto = new Producto(articulo, precio, descripcion, codigo, talla, marca, color);
		listaProductos.add(producto);
	}
}
