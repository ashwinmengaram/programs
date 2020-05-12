import java.util.Scanner;

public class RestInPeace21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i=0;i<T;i++){
            long n = scanner.nextLong();
            boolean found = false;
            if(String.valueOf(n).indexOf("21") > -1){
                found=true;
            }

            if(!found && n%21==0)
                found=true;

            if(found){
                System.out.println("The streak is broken!");
            }else{
                System.out.println("The streak lives still in our heart!");
            }
        }
        scanner.close();
    }
}