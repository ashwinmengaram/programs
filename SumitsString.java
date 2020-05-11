import java.util.Arrays;
import java.util.Scanner;

public class SumitsString {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int test=sc.nextInt();
        String str[]=new String[test];
        for(int i=0;i<test;i++){
            str[i]=sc.next();
            
        }
        
        String output[]=new String[test];
        Arrays.fill(output, "YES");
        for(int i=0;i<test;i++){
            int pre=str[i].charAt(0);
            for(int j=1;j<str[i].length();j++){
                int diff=Math.abs(pre-str[i].charAt(j));
                
                if(diff>=13){
                    diff=26-diff;
                }
                if(diff!=1){
                    output[i]="NO";
                    break;
                }
                pre=str[i].charAt(j);
            }
        }
        for(String i:output){
            System.out.println(i);
        }
        
        sc.close();
    }
}