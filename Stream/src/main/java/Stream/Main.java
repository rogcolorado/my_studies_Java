
package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();
        
        estudantes.add("Pedro");
        estudantes.add("Thaise");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");
        
        int contagem = (int) estudantes.stream().count();
        System.out.println(contagem+" alunos na lista");
        
        System.out.println(estudantes.stream().max(Comparator.comparing(String::
                length)));//retorna nome com mais letras
        
        System.out.println(estudantes.stream().min(Comparator.comparing(String::
                length)));//retorna nome com menos letras
        
        System.out.println(estudantes.stream().filter((estudante)-> estudante.
                toLowerCase().contains("r")).collect(Collectors.toList()));
        //retorna nome com R na lista
        
        System.out.println(estudantes.stream().map(estudante -> 
            estudante.concat("-").concat(String.valueOf(estudante.length())))
                    .collect(Collectors.toList()));
//retorna os nomes com a quantidade de letras
               
        System.out.println(estudantes.stream().limit(3).collect(Collectors.toList()));
        //RETORNA OS 3 PRIMEIROS NOMES
        
        System.out.println(estudantes.stream().peek(System.out::println).collect
        (Collectors.toList()));//imprime os itens da lista 1 por 1 e depois a coleção novamente
        
        estudantes.stream().forEach(System.out::println);
//imprime 1 po1 sem retornar a coleção

        System.out.println("Primeiro elemento da lista e: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        }
    }
    

