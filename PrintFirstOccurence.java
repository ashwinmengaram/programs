import java.util.HashMap;
import java.util.Scanner;

public class PrintFirstOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        for(int j=0;j<t;j++){
            String s = input.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i=0;i<s.length();i++){
                if(map.containsKey(s.charAt(i)))
                {
                    
                }
                else
                {
                    map.put(s.charAt(i),i);
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();
        }
        input.close();
    }
}