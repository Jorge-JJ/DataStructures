public class Nodo {

    private Nodo siguiente, anterior;
    private int dato;

    Nodo(int dato, Nodo siguiente){
        this.dato=dato;
        this.siguiente=siguiente;
    }

    Nodo(int dato, Nodo siguiente, Nodo anterior){
        this.dato=dato;
        this.siguiente=siguiente;
        this.anterior=anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getAnterior() {
        return anterior;
    }
}
