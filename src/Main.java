import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45, 50);

        List<Integer> evenList = list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenList);

        List<Integer> oddList = list.stream().filter(n->n%2 !=0).collect(Collectors.toList());

        System.out.println(oddList);


        List<Integer> greaterThan30 = list.stream().filter(n->n>30).collect(Collectors.toList());
        System.out.println(greaterThan30);

        List<Integer> greaterThan20AndEven = list.stream().filter(n->n>20).filter(n-> n%2==0).collect(Collectors.toList());

        System.out.println(greaterThan20AndEven);
    }
}