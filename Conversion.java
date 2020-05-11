import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String result = "";
        scanner.nextLine();
        for(int i=0;i<T;i++){
            String s = scanner.nextLine();
            
            s=s.toLowerCase();
            for(int j=0;j<s.length();j++){
                if (s.charAt(j)== ' ')
                    {
                        result = result + '$';
                    }
                        else
                    {
                        result = result + ((int)s.charAt(j) - (int)'a'+1);
                    }
            }
        }
        System.out.println(result);
        scanner.close();
    }
    
}