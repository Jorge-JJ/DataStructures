public class Pila{
    private Nodo arriba;

    public void push(int dato){
        arriba=new Nodo(dato,arriba);
    }

    public void pop(){
        arriba=arriba.getSiguiente();
    }

    public int top() {
        if (!empty()) {
            return arriba.getDato();
        } else {
            System.out.println("Pila vacía");
        }
        return 0;
    }

    public boolean  empty(){
        return arriba==null;
    }
}