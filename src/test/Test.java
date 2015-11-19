package test;

import clases.Grafo;
import clases.Infeccion;

public class Test {

	public static void main(String[] args) {
//		Grafo g = new Grafo(5);
//		g.setPeso(0, 1, 3);
//		g.setPeso(1, 0, 5);
//		System.out.println(g.getPeso(0, 1));
	
//		Grafo g = new Grafo(4);
//		g.setPeso(0, 1, 9);
//		g.setPeso(0, 2, 3);
//		g.setPeso(0, 3, 5);
//		g.setPeso(2, 1, 4);
//		g.setPeso(2, 3, 1);
//		g.setPeso(3, 1, 1);
//		
//		g.floyd();
//		
//		g.printCostos();
	
		Infeccion[] inf = new Infeccion[4];
		inf[0] = new Infeccion(7, 2);
		inf[1] = new Infeccion(1, 7);
		inf[2] = new Infeccion(15, 5);
		inf[3] = new Infeccion(12, 4);
		
		Grafo g = new Grafo(15, inf);
	
		g.setPeso(1, 2, 3);
		g.setPeso(1, 3, 2);
		g.setPeso(3, 2, 4);
		g.setPeso(2, 4, 5);
		g.setPeso(4, 4, 5);
		g.setPeso(11, 2, 10);
		g.setPeso(12, 3, 10);
		g.setPeso(10, 1, 5);
		g.setPeso(5, 2, 6);
		g.setPeso(6, 3, 15);
		g.setPeso(6, 3, 8);
		g.setPeso(5, 1, 8);
		g.setPeso(10, 4, 13);
		g.setPeso(8, 1, 7);
		g.setPeso(8, 2, 9);
		g.setPeso(8, 1, 14);
		g.setPeso(13, 2, 14);
		
		System.out.println(g.hallarOrigen());
		g.printCostos(5);
		
	}

}
