
package javaarrays;

public class JavaArrays {

    public static void main(String[] args) {
        int[] meuArray ={0,1,2,3,4,5,6,7,8,9};
        for (int i=0; i<meuArray.length; i++){
        System.out.println("Elemento: "+meuArray[i]);}
        System.out.println(meuArray.length+" posições\n"); 
        
        int[][] arrayMulti={{1,2,3,4},{5,6,7}};
        for (int i=0; i<arrayMulti.length; i++){
            for (int j=0;j<arrayMulti[i].length;j++){
        System.out.println("Elemento: "+arrayMulti[i][j]);}
            System.out.println("\n"+arrayMulti[i].length+" posições\n"); 
            
        }
        
    }
    
}
