import java.util.Scanner;

public class Mystery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i=0;i<T;i++){
            int n = scanner.nextInt();
            int divisor = 0;
            for(int j=1;j<=n;j++){
                if(n%j==0){
                    divisor++;
                }
            }
            System.out.println(divisor);
        }
        scanner.close();
    }
}