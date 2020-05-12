import java.util.Arrays;
import java.util.Scanner;

public class MinMax8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        int min = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            if(i!=n-1){
                min+=a[i];
            }

            if(i!=0){
                max+=a[i];
            }
        }
        System.out.println(min+" "+max);
        scanner.close();
    }
}