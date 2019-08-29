/**
 * Created by SWATHI on 8/30/2019.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

    public class CollectionDemo {

        void listData(){
            //String name="rajan,shital,swaraj,priyanka,codekul";

            //List<String> list=new ArrayList<>();

            //list.add(name);
            Set<String> name = new HashSet<>(Arrays.asList("rajan", "shital",
                    "swaraj","priyanka","codekul"));
            System.out.println(name);




        /*list.add("Rajan");
        list.add("shital");
        list.add("swaraj");
        list.add("priyanka");
        list.add(1,"codekul");
*/
            //for (String s:name) {
              //  System.out.println(s);
            //}
        }


        public static void main(String[] args) {
            new CollectionDemo().listData();
        }
    }

