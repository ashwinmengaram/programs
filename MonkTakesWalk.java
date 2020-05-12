import java.util.Scanner;

public class MonkTakesWalk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<T;i++){
            String s = scanner.nextLine();
            char[] chars = s.toCharArray();
            int count=0;
            for(int j=0;j<chars.length;j++){
                if(chars[j]=='A' || chars[j]=='E' || chars[j]=='I'|| chars[j]=='O'|| chars[j]=='U'|| chars[j]=='a'|| chars[j]=='e'|| chars[j]=='i'|| chars[j]=='o'|| chars[j]=='u'){
                    count++;
                }
            }
            System.out.println(count);
        }
        scanner.close();
    }
}