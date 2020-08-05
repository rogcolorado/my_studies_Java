
package JavaLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class Main {

    
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList();
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");
        
        System.out.println(filaBanco);
        
        String clienteAtendido = filaBanco.poll();
        System.out.println(filaBanco);
        
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        
        //filaBanco.clear();
        String vaziaOuPrimeiro = filaBanco.element();
        System.out.println(vaziaOuPrimeiro+"\n");//Mostra o primeiro elemento ou erro
        //caso a fila esteja vazia
        
        for(String cliente: filaBanco){
            System.out.println(cliente);//Mostra todos os clientes
        }
        
        Iterator <String> fila = filaBanco.iterator();
        while(fila.hasNext()){
            System.out.println("-->> "+fila.next());
        }
        System.out.println(filaBanco.size());
    }
    
}
