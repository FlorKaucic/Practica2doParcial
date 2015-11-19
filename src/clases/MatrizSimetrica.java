package clases;

public class MatrizSimetrica {
	protected int[] vector;
	protected int nodos;

	public MatrizSimetrica(int nodos) {
		this.nodos = nodos;
		this.vector = new int[nodos * (nodos - 1) / 2];
		for (int i = 0; i < this.vector.length; i++)
			this.vector[i] = -1;
	}
	
	public int getTam(){
		return this.nodos;
	}

	public int getPeso(int i, int j) { 
		return (getPos(i-1, j-1) >= 0) ? this.vector[getPos(i-1, j-1)] : -1;
	}

	public int getPeso(int p) {
		return this.vector[p-1];
	}

//	public void setPeso(int i, int j, int v) { // roto esto porque hardcodee al reves los datos
	public void setPeso(int i, int v, int j){
		if (getPos(i-1, j-1) >= 0) this.vector[getPos(i-1, j-1)] = v;
	}

	public void setPeso(int p, int v) {
		this.vector[p-1] = v;
	}

	protected int getPos(int fil, int col) { 
		if (fil == col) return -1;
		int f = (fil < col) ? fil : col;
		int c = (col < fil) ? fil : col;
		return f * (this.nodos - 1) - f * (f+1) / 2 + c - 1;
	}

	protected int[][] clone() {
		int[][] m = new int[this.nodos][this.nodos];
		for(int i = 0; i < this.nodos; i++)
			for(int j = 0; j < this.nodos; j++)
				m[i][j] = this.getPeso(i+1, j+1);
		return m;
	}
	
	
}
