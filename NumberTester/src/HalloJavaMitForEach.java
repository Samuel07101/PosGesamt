import java.util.ArrayList;

public class HalloJavaMitForEach {

   public void forEach() {
       ArrayList<String> arr = new ArrayList<>();
       arr.add("Java");
       arr.add("dd");

       for (int i = 1; i < arr.size(); i++) {
           System.out.println(arr.get(i));
       }

   }
}
