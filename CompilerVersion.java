import java.util.Scanner;

public class CompilerVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        
        while(scanner.hasNextLine()){
            result=scanner.nextLine();
            int k=result.indexOf("//");
            if(k!=-1){
                String s_new=result.substring(0,k);
                
                System.out.println(s_new.replaceAll("->", ".")+result.substring(k));
            }
            else{
                System.out.println(result.replaceAll("->","."));
                continue;
            }
        }
        
        scanner.close();
    }
}