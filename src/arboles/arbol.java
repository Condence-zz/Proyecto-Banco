package arboles; 
import static Interfaz.DiagBuscarApellido.lista;
import listas.IteradorLista;
import listas.Lista; 
import listas.NodoLista;
import objetoNegocio.Cliente;
public class arbol {
    public static Lista getDiamante(Lista list){
        IteradorLista it = new IteradorLista(list.getCabecera());
        Lista diamante = new Lista();
        NodoLista nodo = list.getCabecera().getSiguiente();
        int count=0;
        while (nodo != null) {
            Cliente p = (Cliente) nodo.getElemento();  
            if (p.getSaldo()<1) {
                diamante.insertar(p, it);
                nodo = nodo.getSiguiente();
            }  else {
                nodo = nodo.getSiguiente();
            } 
        }
        return diamante;
    }
}
