
package Collections.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class ExemploLinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet <Integer> seqNumerica = new LinkedHashSet<>();
        //Insere elementos na ordem de inserção
        seqNumerica.add(16);
        seqNumerica.add(1);
        seqNumerica.add(2);
        seqNumerica.add(4);
        seqNumerica.add(8);
        
        
        System.out.println(seqNumerica);
        
        seqNumerica.remove(4);
        System.out.println(seqNumerica);
        
        Iterator <Integer> sequencia = seqNumerica.iterator();
        while (sequencia.hasNext()){
            System.out.println(sequencia.next());
        }        
        
        for (Integer numeros: seqNumerica){
            System.out.println("-> "+numeros);
        } 
        
        System.out.println("Tamanho: "+seqNumerica.size()+" posicoes");
    }
    
}
