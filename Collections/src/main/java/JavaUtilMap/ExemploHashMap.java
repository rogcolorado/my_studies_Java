
package JavaUtilMap;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
   
    public static void main(String[] args) {
       Map<String, Integer> campeoesFifa = new HashMap<>(); 
       campeoesFifa.put("Brasil", 5);
       campeoesFifa.put("Alemanha", 4);
       campeoesFifa.put("Italia", 4);
       campeoesFifa.put("Uruguai",2);
       campeoesFifa.put("Argentina", 2);
       campeoesFifa.put("Franca", 2);
       campeoesFifa.put("Inglaterra", 1);
       campeoesFifa.put("Espanha", 1);
       
        System.out.println(campeoesFifa);
        
        //campeoesFifa.put("Brasil", 6);//atualiza Brasil para 6 titulos
        //System.out.println(campeoesFifa);
        
        Integer argentina = campeoesFifa.get("Argentina");//Busca titulos da 
//        Argentina
        System.out.println(argentina);
        
        boolean temFranca = campeoesFifa.containsKey("Franca");//Verifica se 
//contém o elemento
        System.out.println(temFranca);
        
         Integer remove1 = campeoesFifa.remove("Franca");
         System.out.println(campeoesFifa);
         
         boolean temExa = campeoesFifa.containsValue(6);
         System.out.println(temExa);
         
         Integer tamanho = campeoesFifa.size();
         System.out.println(tamanho+" selecoes");
         
         for (Map.Entry<String, Integer> entry : campeoesFifa.entrySet()){
             System.out.println(entry.getKey()+" -> "+entry.getValue()+" titutlos");
    }
    }
    
}
