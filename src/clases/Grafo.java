package clases;


public class Grafo extends MatrizSimetrica {
	protected int[][] costos;
	protected Infeccion[] inf;

	public Grafo(int nodos, Infeccion[] inf) {
		super(nodos);
		this.inf = inf;
	}

	public int hallarOrigen() {
		floyd();
		int n;
		for(int i = 0; i < this.nodos; i++){
			n = i;
			for(int j = 0; j < this.inf.length; j++)
				if(costos[i][inf[j].getNodo()-1]!=inf[j].getHora())
					n = -1;
			if(n!=-1)
				return n+1;
		}
		return -1;
	}
	
	private void floyd() {
		costos = this.clone();
		for (int k = 0; k < this.nodos; k++)
			for (int i = 0; i < this.nodos; i++)
				if(i!=k)
					for (int j = 0; j < this.nodos; j++)
						if(j!=k && i!=j)
							if (costos[i][k] != -1 && costos[k][j] != -1 && (costos[i][j]==-1 || costos[i][k] + costos[k][j] < costos[i][j])) {
								costos[i][j] = costos[i][k] + costos[k][j];
							}
	}

	public void printCostos() {
		for (int[] linea : costos) {
			System.out.print("\n");
			for (int c : linea)
				System.out.print(c + "  ");
		}
	}
	
	public void printCostos(int n) {
		System.out.print("\n");
		for (int c : costos[n-1]) {
			System.out.print(c + "  ");
		}
	}
}
