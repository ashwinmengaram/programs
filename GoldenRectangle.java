import java.util.Scanner;

public class GoldenRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            double a = scanner.nextInt();
            double b = scanner.nextInt();
            double w=Math.max(a,b);
            double h=Math.min(a,b);
            double ratio = (double)w/h;
            if(1.6 <= ratio && ratio <= 1.7){
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}