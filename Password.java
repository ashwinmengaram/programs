import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        List<String> list = new ArrayList<String>();
        for(int i=0;i<T;i++){
            String s = scanner.nextLine();
            list.add(s);
        }

        for(String pwd:list){
            String reverseString = new StringBuilder(pwd).reverse().toString();
            if(list.contains(reverseString)){
                int n = pwd.length();
                System.out.println(n+" "+ pwd.charAt((n/2)));
                break;
            }
        }
        scanner.close();
    }
}