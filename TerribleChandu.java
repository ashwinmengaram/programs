import java.util.Scanner;

public class TerribleChandu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<T;i++){
            String s = scanner.nextLine();
            StringBuilder sb = new StringBuilder(s);
            System.out.println(sb.reverse().toString());
        }
        scanner.close();
    }
}