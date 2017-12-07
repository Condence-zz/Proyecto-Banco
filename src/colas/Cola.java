package colas;  
import objetoNegocio.Turno; 
public class Cola {
    public int max;
    public Turno dret;
    public Turno c[];
    public int fre = -1;
    public int fin = -1; 
    public Cola() {
        max=20;
        c=new Turno [max];
    } 
    public Cola(int n) { 
        max=n;
        c=new Turno [max];
    }
    public boolean colallena(int fin,int max) {
        boolean llena;
        if (fin==max-1)
            llena=true;
        else
            llena=false;
        return llena;
    } 
    public boolean colavacia(int fre) {
        boolean vacia;
        if (fre==-1)
            vacia=true;
        else
            vacia=false;
        return vacia;
    }   
    public boolean inscola(Turno dato) {
        if (fin==max-1)
            return false;
        fin++;
        c[fin] = dato;
        if (fin==0)
           fre=0;
        return true;
    } 
    public boolean retcola() {
        if (fre ==-1)
           return false;
        dret=c[fre];
        if (fre==fin) {
            fre=-1;
            fin=-1;
        }
        else
           fre++;
        return true;
    }
 }