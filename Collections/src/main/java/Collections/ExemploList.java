
package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ExemploList {
     public static void main(String[] args) {
         
         List<String> nomes = new ArrayList<>();
         nomes.add("Carlos");
         nomes.add("Pedro");
         nomes.add("Tauane");
         nomes.add("Maria");
         nomes.add("Joao");
         
         System.out.println("Lista Normal: "+nomes);
         
         Collections.sort(nomes);
         System.out.println("Lista Ordenada: "+nomes);
         
         nomes.set(2, "Barbara");
         System.out.println("Lista Alterada: "+nomes);
         
         nomes.remove(4);
         System.out.println("Lista com Item removido: "+nomes);
         
         nomes.remove("Carlos");
         System.out.println(" Lista com 'Carlos' removido: "+nomes);
         
         String nome = nomes.get(0);
         System.out.println(nome);
         System.out.println("\n"+nomes.size()+" posicoes");
         
         boolean temFernando = nomes.contains("Fernando");//Verifica se existe Fernando na lista
         System.out.println(temFernando);
         
         //nomes.clear(); Limpaa lista
         
         boolean listaVazia = nomes.isEmpty();//Verifica se a lista esa vazia
         System.out.println(listaVazia);
         
         int posicao = nomes.indexOf("Barbara");//retorna a posicao do elemento na lista
         System.out.println(posicao);
         
         for (String nomeLista: nomes){
             System.out.println("Nome: "+nomeLista);//Listar os nomes da lista
         }
         
         Iterator<String> iterator = nomes.iterator();
         while(iterator.hasNext()){
             System.out.println("->Nome: "+iterator.next());//Listar os nomes da lista
         }
    }
    
}
