import java.util.Scanner;

public class NobitaAndString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<T;i++){
            String s = scanner.nextLine();
            String[] words = s.split(" ");
            for(int j=words.length-1;j>=0;j--){
                if(j>0){
                    System.out.print(words[j]+" ");
                }else{
                    System.out.println(words[j]);
                }
            }
        }
        scanner.close();
    }
}