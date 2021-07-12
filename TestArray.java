
import java.util.ArrayList;
public class TestArray {
    public static void main(String[] args) {
        ArrayList<Integer> list;
        list = new ArrayList<Integer>(10);
         
            for (Integer i = 0; i < 10; i++) {
                System.out.println("Hello" + " " + i);
            
        }

        for (Integer i : list) {
            System.out.println("Hello" + " " + i);
        
    }
    }
}