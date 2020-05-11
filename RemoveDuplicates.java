import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s =  scanner.nextLine();
        List<Character> set = new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
        }
        String result="";
        for(Character c:set){
            result+=c;
        }
        System.out.println(result);
        scanner.close();
    }
}