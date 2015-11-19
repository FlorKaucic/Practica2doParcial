package clases;

public class Infeccion {
	protected int nodo;
	protected int hora;
	
	public Infeccion(int nodo, int hora){
		this.nodo = nodo;
		this.hora = hora;
	}

	public int getNodo() {
		return nodo;
	}

	public void setNodo(int nodo) {
		this.nodo = nodo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	
	
}
