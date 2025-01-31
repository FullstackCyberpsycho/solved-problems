import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static String filterAndMap(List<String> listStr) {
        List<String> resStr = listStr.stream()
                .filter(e -> e.length() > 5)
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());
        return resStr.toString();
    }
    public static void main(String[] args) {
        List<String> listStr = Arrays.asList("apple", "banana", "cat", "dog", "elephant");
        System.out.println(filterAndMap(listStr));
    }
}
