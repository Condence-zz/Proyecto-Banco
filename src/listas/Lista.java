package listas;
import javax.swing.DefaultListModel;
import objetoNegocio.*;
public class Lista {
    private NodoLista cabecera;

    public Lista() {
            this.cabecera = new NodoLista(null);
    }

    public NodoLista getCabecera() {
            return cabecera;
    }

    public void setCabecera(NodoLista cabecera) {
            this.cabecera = cabecera;
    }

    boolean estaVacia() {
            if (this.cabecera.getSiguiente() == null) {
                    return true;
            } else {
                    return false;
            }
    }

    public IteradorLista buscar(Cliente o) {
        NodoLista nodo = this.cabecera.getSiguiente();
        while (nodo != null && !nodo.getElemento().equals(o)) {
                nodo = nodo.getSiguiente();
        } 
        return new IteradorLista(nodo);
 
    }

    public void listarElementos() {
            NodoLista nodo = this.cabecera.getSiguiente();
            while (nodo != null) {
                    Cliente p = (Cliente) nodo.getElemento();
                    System.out.println(p);
                    nodo = nodo.getSiguiente();
            }
    }

    public void getTotal() {
            NodoLista nodo = this.cabecera.getSiguiente();
            double total = 0;
            while (nodo != null) {
                    Cliente p = (Cliente) nodo.getElemento();
                    total += p.getSaldo();
                    nodo = nodo.getSiguiente();
            }

            System.out.println("Total: " + total);
    }

    public void despliegaTicket() {
        NodoLista nodo = this.cabecera.getSiguiente();
        double total = 0;
        while (nodo != null) {
            Cliente p = (Cliente) nodo.getElemento();
            System.out.println(p);
            total += p.getSaldo();
            nodo = nodo.getSiguiente();
        }
        System.out.println("\n T O T A L : " + total);
    }

    /*
     * public void subTotal() { NodoLista nodo = this.cabecera.getSiguiente(); while
     * (nodo!=null) { Producto total = (Producto)nodo.getElemento();
     * total.getPrecio(); } }
     */
    public void insertar(Cliente o, IteradorLista it) {
            if (it != null && it.getActual() != null) {
                    it.getActual().setSiguiente(new NodoLista(o, it.getActual().getSiguiente()));
            }
    }

    public void eliminar(Cliente o) {
        
        IteradorLista it=encontrarPrevio(o); 
        if (it.getActual().getSiguiente() != null) {
            it.getActual().setSiguiente(it.getActual().getSiguiente().getSiguiente());
        }
        
    }

    public IteradorLista encontrarPrevio(Cliente o) {
            NodoLista nodo = this.cabecera;
            while (nodo.getSiguiente() != null && !nodo.getSiguiente().getElemento().equals(o)) {
                    nodo = nodo.getSiguiente();
            }
            return new IteradorLista(nodo);
    }

    public void setModel(DefaultListModel modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}