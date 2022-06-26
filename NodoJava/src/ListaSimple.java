public class ListaSimple {
    private Nodo inicio, fin;

    public boolean empty(){
        return inicio==null;
    }

    public void insertar(int dato) {
        Nodo aux1, aux2;
        if (empty()) {
            inicio = fin = new Nodo(dato, null);
        } else {
            if (dato < inicio.getDato()) {
                inicio = new Nodo(dato, inicio);

            } else if (dato > fin.getDato()) {
                fin.setSiguiente(new Nodo(dato, null));
                fin = fin.getSiguiente();
            } else {
                aux1 = inicio;
                aux2 = inicio.getSiguiente();
                while (aux2.getDato() < dato) {

                    aux1 = aux1.getSiguiente();
                    aux2 = aux2.getSiguiente();

                }
                aux1.setSiguiente(new Nodo(dato, aux2));
            }
        }
    }

    public void borrar(int dato){
        if(!empty()){
            Nodo aux1,aux2;
            aux1=aux2=inicio;

            while (aux2.getDato()<dato && aux2.getSiguiente() !=null){
                aux1=aux2;
                aux2=aux2.getSiguiente();
            }
            if(aux2 == null){

                System.out.println("El valor "+dato+" no se encuentra en la lista");
            }
            else {
                if(aux2.getDato() != dato){
                    System.out.println("El valor "+dato+" no se encuentra en la lista");
                }
                else {
                    if(aux2 != inicio && aux2 != fin){
                        aux1.setSiguiente(aux2.getSiguiente());
                    }
                    else {
                        if(inicio==aux2){
                            inicio.getSiguiente();
                        }
                        else {
                            aux1.setSiguiente(null);
                            fin=aux1;
                        }
                    }
                }
            }
        }
        /*else {
            System.out.println("La lista está vacía");
        }*/
    }

    public void mostrar(){
        if(!empty()){
            Nodo auxiliar=inicio;
            while (auxiliar != null){
                System.out.println(auxiliar.getDato());
                auxiliar = auxiliar.getSiguiente();
            }
        }
        else {
            System.out.println("La lista está vacía");
        }
    }
}
