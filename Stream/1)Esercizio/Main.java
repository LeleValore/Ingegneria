import java.util.Arrays;
import java.util.List;

 
 public class Main{
  
   public static void main(String[] argc){
   
        List<String> lista = Arrays.asList("auteto","autore", "architetto", "amico", "more");
        final String l1 = "au";
        List <String> output = lista.stream()
                                    .filter(s->s.startsWith(l1))
                                    .toList();
        for( String s : output ) System.out.println(s);
        
    }

}