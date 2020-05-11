import java.util.Scanner;

public class MonkAndPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<T;i++){
            String s = scanner.nextLine();
            char[]  chars = s.toCharArray();
            StringBuilder reverseString = new StringBuilder(s);
            //String reverseString = "";
           
            
            if(s.equalsIgnoreCase(reverseString.reverse().toString())){
                String type = (chars.length%2==0)?"EVEN":"ODD";
                System.out.println("YES"+" "+type);
            }else{
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}