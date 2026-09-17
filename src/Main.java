import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,35,45,53,60);

        List<Integer> evenList = list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenList);
    }
}