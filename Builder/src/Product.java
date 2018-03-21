import java.util.ArrayList;
import java.util.List;

public class Product {
    List<String> parts = new ArrayList<>();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println("create product:");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
