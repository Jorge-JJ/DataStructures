import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //Implementacion de una pila
        Pila p = new Pila();
        p.push(4);
        p.push(9);
        p.push(3);
        System.out.println("Implementación de una pila");
        while (!p.empty()){
            System.out.println("\t"+p.top());
            p.pop();
        }
        //Implementación de una cola
        Cola c = new Cola();
        c.push(1);
        c.push(2);
        c.push(3);
        System.out.println("Implementación de una cola");
        System.out.println("\tPrimer valor de la cola: "+c.front());
        System.out.println("\tUltimo valor de la cola: "+c.back());
        while (!c.empty()){
            System.out.println("\t"+c.front());
            c.pop();
        }


        //Implementacion de una lista simple
        ListaSimple l = new ListaSimple();
        System.out.println("Agregando valores");
        l.insertar(-22);
        l.insertar(0);
        l.insertar(33);
        l.mostrar();
        System.out.println("\nBorrando valores:");
        l.borrar(44);
        l.borrar(-50);
        l.borrar(1);
        l.borrar(33);
        l.mostrar();

    }
}
