
package JavaUtilMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {
         TreeMap <String, String> treeCapitais = new TreeMap<>();
         
         treeCapitais.put("RS", "Porto Alegre");
         treeCapitais.put("SC", "Florianopolis");
         treeCapitais.put("PR", "Curitiba");
         treeCapitais.put("SP", "Sao Paulo");
         treeCapitais.put("RJ", "Rio de Janeiro");
         treeCapitais.put("MG", "Belo Horizonte");
         
         System.out.println(treeCapitais);
         
         String primeiro = treeCapitais.firstKey();
         System.out.println(primeiro);
         
         String ultimo = treeCapitais.lastKey();
         System.out.println(ultimo);
         
         String anterior = treeCapitais.lowerKey("SC");
         System.out.println(anterior);
         
         String posterior = treeCapitais.higherKey("SC");
         System.out.println(posterior);
         
          Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
          Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();
          
          System.out.println(treeCapitais);
          
          String removePrimeiro = firstEntry.getKey()+" ->>> "+firstEntry.getValue();
          System.out.println(removePrimeiro);//remove e mostra primeiro termo
          
          String removeUltimo = lastEntry.getKey()+" ->>> "+lastEntry.getValue();
          System.out.println(removeUltimo);//remove e mostra ultimo termo
          
          Iterator<String> iterator = treeCapitais.keySet().iterator();
          
          while(iterator.hasNext()){
              String key = iterator.next();
              System.out.println(key+" -> "+treeCapitais.get(key));
          }
         
    }
    
}
