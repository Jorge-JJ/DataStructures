public class Cola {
    private Nodo inicio,fin;

     Cola(){
        inicio=fin=null;
    }

    public void push(int dato){
        if(!empty())
        {
            fin.setSiguiente(new Nodo(dato,null)); /*Tiene que apuntar a nulo porque
                                                             "fin" siempre será el ultimo valor*/
            fin=fin.getSiguiente();
        }
        else{
            inicio = new Nodo(dato,fin);
            fin=inicio;
        }
    }

    public int front(){
        if(!empty()){
            return inicio.getDato();
        }
        else {
            System.out.println("Cola vacía");
        }
        return 0;
    }

    public int back(){
        if(!empty()){
            return fin.getDato();
        }
        else {
            System.out.println("Cola vacía");
        }
        return 0;
    }

    public void pop(){
        if(!empty()){
            Nodo aux=inicio;
            inicio=inicio.getSiguiente();
            aux=null;
        }
    }
    public boolean empty(){
        return inicio==null;
    }
}



