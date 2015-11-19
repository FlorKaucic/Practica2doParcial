package archivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import clases.Grafo;
import clases.Infeccion;

public class Archivo {
	public static void leer(Grafo g, Infeccion[] inf) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("entrada.in"));
			String linea = br.readLine();
			int aristas = Integer.parseInt(linea);
			for (int i = 0; i < aristas; i++) {
				
			}

			//			� la cantidad de enlaces de la red (menor o igual a 30000)
			//			� una l�nea por cada enlace de la red, formada por el n�mero de la computadora
			//			origen (entre 1 y 1000), el tiempo que demanda la transmisi�n del gusano por el
			//			enlace (entre 1 y 50), y el n�mero de la computadora destino (entre 1 y 1000)
			//			� la cantidad de pares (<computadora>, <hora>) de llegada del gusano (menor o
			//			igual a 100)
			//			� una l�nea por cada par (<computadora>, <hora>), formada por el n�mero de la
			//			computadora y la hora a la que arrib� el gusano a dicha computadora (en
			//			segundos, menor o igual a 20000)
		} catch (FileNotFoundException e) {
			System.err.println("No se encontro el archivo");
		} catch (IOException e) {
			System.err.println("No se puede leer la linea del archivo");
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					System.err.println("No se pudo cerrar el archivo");
				}
		}
	}
}
