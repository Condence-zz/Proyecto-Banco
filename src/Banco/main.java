package Banco;
import Interfaz.Interfaz;
import colas.Cola;
import java.util.Scanner; 
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import listas.*;
import objetoNegocio.*;
public class main {
    private static int Opcion;
    private static String OpcionString;
    private static Lista lista = new Lista();
    private static IteradorLista it = new IteradorLista(lista.getCabecera());
    private static Scanner tec = new Scanner(System.in);   
    private static String line = null;
    
    private static Cola obj = new Cola();
    public static void main(String[] args) { 
        Cliente clie1 = new Cliente(98473,19, "David", "Partida", 501000);
        Cliente clie2 = new Cliente(98474,20, "David", "Partida", 900.00);
        Cliente clie3 = new Cliente(98475,21, "David", "Partida", 900.00);
         
        lista.insertar(clie1, it);
        lista.insertar(clie2, it);
        lista.insertar(clie3, it);
          
        
        Interfaz lista_interfaz = new Interfaz(lista);
        lista_interfaz.setVisible(true); 
        lista_interfaz.setLocationRelativeTo(null); 
        lista_interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }  
    public static void add(int id,int edad, String nombre, String apellido, Double saldo) {
        Cliente c = new Cliente(id, edad, nombre, apellido, saldo);
        System.out.println(c);
        lista.insertar(c, it); 
        System.out.println("Cliente Agregado...");  
    }
    public static void delete(int id){
        Cliente borrar = new Cliente(id);
        lista.eliminar(borrar);   
    } 
}
