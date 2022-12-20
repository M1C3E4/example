import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("S");
        listString.add("I");
        listString.add("E");
        listString.add("M");
        listString.add("A");

        for(int i = 0; i < listString.size(); i++){
            System.out.println(listString.get(i));
        }

    }
}