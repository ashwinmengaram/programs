import java.util.Arrays;
import java.util.Scanner;

public class SpecialShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i=0;i<T;i++){
            Integer N = scanner.nextInt();
            Integer A = scanner.nextInt();
            Integer B = scanner.nextInt();
            Integer[] arr = new Integer[N+1];
            for(int j=0;j<=N;j++){
                arr[j]=A*(j*j)+(B*(N-j)*(N-j));
            }
            Arrays.sort(arr);
            System.out.println(arr[0]);
        }
        scanner.close();
    }
}