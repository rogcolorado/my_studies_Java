
package Collections.ExemploTreeSet;

import java.util.Iterator;
import java.util.TreeSet;


public class ExemploTreeSet {

   
    public static void main(String[] args) {
        System.out.println("Capitais: ");
       TreeSet < String> TreeCapitais = new TreeSet();
       //Insere os elementos em ordem crescente neste caso, Alfabética
       TreeCapitais.add("Porto Alegre");
       TreeCapitais.add("Florianopolis");
       TreeCapitais.add("Curitiba");
       TreeCapitais.add("Sao Paulo");
       TreeCapitais.add("Rio de Janeiro");
       TreeCapitais.add("Belo Horizonte");
       
        System.out.println(TreeCapitais);
        String primeiro = TreeCapitais.first();
        System.out.println(primeiro);
        
        String ultimo = TreeCapitais.last();
        System.out.println(ultimo);
        
        String anterior = TreeCapitais.lower("Florianopolis");
        System.out.println(anterior);
        
        String posterior = TreeCapitais.higher("Florianopolis");
        System.out.println(posterior);
        
        String removePrimeiro = TreeCapitais.pollFirst();
        System.out.println(removePrimeiro+" removido");
        System.out.println(TreeCapitais);
        
        String removeUltimo = TreeCapitais.pollLast();
        System.out.println(removeUltimo+" removido");
        System.out.println(TreeCapitais);
        
        Iterator<String> capitais = TreeCapitais.iterator();
        while (capitais.hasNext()){
        System.out.println(capitais.next());
    }
        
        for(String capital: TreeCapitais){
            System.out.println("->"+capital);
        }
    }
    
}
