import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Collections;
/*
 * Data una lista di terne di numeri verificare se essa costituisce un triangolo.
 * Restituire la lista dei perimetri per le terne che rappresentano triangoli
*/

public class Main{

    public static void main(String[] args){
        List <int[]> lista = List.of(new int[] {2,3,4} , new int[] {3,4,6});

        List<Integer> output = lista.stream()
        .filter(v -> v[0] < v[1] + v[2])
        .filter(v -> v[1] < v[0] + v[2])
        .filter(v -> v[2] < v[1] + v[0])
        .map( v -> v[0] + v[1] + v[2])
        .collect(Collectors.toList());

        System.out.println(output);

    
    }
}