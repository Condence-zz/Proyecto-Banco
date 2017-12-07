package objetoNegocio;
public class Turno {
    private String Tramite;
    private int numero;
    public static int contador=0; 
    public static int actualmente;
    public static String actualmente_tipo;
    public Turno() { 
    }
    
    public Turno(String Tramite, int numero) { 
        this.Tramite = Tramite;
        this.numero = numero;
    } 
 
    public String getTramite() {
        return Tramite;
    }

    public void setTramite(String Tramite) {
        this.Tramite = Tramite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public static int getTurno(){
        return contador;
    }
    public static void setTurno(int con){
        Turno.contador = con;
    }

    public static int getActualmente() {
        return actualmente;
    }

    public static void setActualmente(int actualmente) {
        Turno.actualmente = actualmente;
    }

    public static String getActualmente_tipo() {
        return actualmente_tipo;
    }

    public static void setActualmente_tipo(String actualmente_tipo) {
        Turno.actualmente_tipo = actualmente_tipo;
    }
    
    @Override
    public String toString() {
        return "Turno{" + "Tramite=" + Tramite + ", numero=" + numero + '}';
    }
    
}
