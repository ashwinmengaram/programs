import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<T;i++){
            String s = scanner.nextLine();
            StringBuilder sb = new StringBuilder();
            if(s.equals(sb.append(s).reverse().toString())){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}