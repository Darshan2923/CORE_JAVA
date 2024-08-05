import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);
        // nums.forEach(n -> System.out.println(n));
        // Stream<Integer> s1 = nums.stream(); // can be used only once
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // Stream<Integer> s3 = s1.map(n -> n * 2);
        // s3.reduce(0, (c, e) -> c + e);
        // s3.forEach(n -> System.out.println(n));

        Stream<Integer> result = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .sorted();
        // .reduce(0, (c, e) -> c + e);

        System.out.println(result);

    }
}
