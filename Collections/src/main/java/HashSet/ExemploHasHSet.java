
package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHasHSet {
     public static void main(String[] args) {
     
         Set<Double> notaAluno = new HashSet<>();
         //Insere elemnos em ordem aleatória
         notaAluno.add(5.8);
         notaAluno.add(9.3);
         notaAluno.add(6.5);
         notaAluno.add(10.0);
         notaAluno.add(5.4);
         notaAluno.add(7.3);
         notaAluno.add(3.8);
         notaAluno.add(4.0);
         
         System.out.println(notaAluno);
         
         notaAluno.remove(3.8);
         System.out.println(notaAluno);
         
         System.out.println(notaAluno.size()+" notas");
         
         Iterator <Double> notas = notaAluno.iterator();
         while(notas.hasNext()){
             System.out.println(notas.next());
         }
         
         for (Double nota: notaAluno){
             System.out.println("->"+nota);
         }
     }    
}
