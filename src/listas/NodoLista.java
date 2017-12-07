package listas; 
import objetoNegocio.Cliente;

public class NodoLista {
	private Cliente elemento;
	private NodoLista siguiente;

	public Cliente getElemento() {
		return elemento;
	}

	public void setElemento(Cliente elemento) {
		this.elemento = elemento;
	}

	public NodoLista getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoLista siguiente) {
		this.siguiente = siguiente;
	}

	public NodoLista(Cliente o) {
		this.elemento = o;
		this.siguiente = null;
	}

	public NodoLista(Cliente o, NodoLista n) {
		this.elemento = o;
		this.siguiente = n;
	}
}