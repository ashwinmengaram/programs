import java.util.Scanner;

public class VowelsPhobia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        for(int i=0;i<T;i++){
            String s = scanner.nextLine();
            char[] chars = s.toCharArray();
            
            for(int j=0;j<s.length();j++){
                if(chars[j]=='a' || chars[j]=='e'|| chars[j]=='i'|| chars[j]=='o'|| chars[j]=='u'){
                    count++;
                }
            }
        }

        System.out.println(count);
        scanner.close();
    }
}