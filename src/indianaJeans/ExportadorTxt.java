package indianaJeans;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class ExportadorTxt extends Exportador {

	@Override
	public void exportar(String lista, String ruta) {
		File fichero = new File(ruta);
		File archivo = new File(fichero + "/lista.txt");
		 
		 if (!fichero.exists()) {
		 	fichero.mkdirs();
			try {
				archivo.createNewFile();
				FileWriter fw = new FileWriter(archivo);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(lista);
				bw.close();
						
		} catch (IOException e) {
			e.printStackTrace();
		
		}
		}

	}
}
	



