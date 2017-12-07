
package listas;
import objetoNegocio.*;
public class IteradorLista {
    private NodoLista actual;

    public NodoLista getActual() {
            return actual;
    }

    public void setActual(NodoLista actual) {
            this.actual = actual;
    }

    public IteradorLista(NodoLista n) {
            this.actual = n;
    }

    public boolean estaFuera() {
            if (actual == null)
                    return true;
            else
                    return false;
    } 
    public Cliente obtener() {
        return this.actual.getElemento();
    }

    public void avanzar() {
        if (!estaFuera()) {
                this.actual = this.actual.getSiguiente();
        }
    }
    
}