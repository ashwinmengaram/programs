import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        int a[] = new int[T];
        for (int i = 0; i < T; i++) {
            a[i] = scanner.nextInt();
        }
        Integer n = scanner.nextInt();
        
        for(int i=0;i<a.length;i++){
            //System.out.println(a[i]);
            if(a[i]==n){
                System.out.println(i);
            }
        }
        scanner.close();
    }
}