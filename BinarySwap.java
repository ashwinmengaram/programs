import java.util.Scanner;

public class BinarySwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        char chars[] =  s2.toCharArray();
        
        int c = 0;
        for(int i=0;i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i))
            {
                chars[i] = s1.charAt(i);
                c++;
            }
        }
        s2=String.valueOf(chars);
        if(s1.equals(s2)){
            System.out.println(c);
        }else{
            System.out.println(-1);
        }

        scanner.close();
    }
}