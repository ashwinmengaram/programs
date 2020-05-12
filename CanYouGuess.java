import java.util.Scanner;

public class CanYouGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<T;i++){
            String s = scanner.nextLine();
            int n = Integer.parseInt(s);
            int sum=0;
            for(int j=1;j<n;j++){
                if(n%j==0){
                    sum+=j;
                   // System.out.println(j);
                }
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}