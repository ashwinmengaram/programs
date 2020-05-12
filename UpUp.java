import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(Stream.of(s.trim().split("\\s")).filter(word -> word.length() > 0).map(word -> word.substring(0, 1).toUpperCase() + word.substring(1)).collect(Collectors.joining(" ")));
        scanner.close();
    }
}