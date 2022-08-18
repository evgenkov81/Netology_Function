import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String text = "There is a growing demand for specialists in the field of digital economy in Russia";
        Function<String, List<String>> function = (a) ->
                Arrays.stream(a.split(" ")).map(n -> n.toLowerCase())
                        .sorted().distinct().collect(Collectors.toList());
        function.apply(text).forEach(System.out::println);
    }
}
/*
The program is written in a functional style.
This is indicated by the use of the implementation of the functional
interface Function and the monad in the form of a Stream API.
*/