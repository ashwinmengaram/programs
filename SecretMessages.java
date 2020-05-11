import java.util.Scanner;

public class SecretMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        while(T>0){
            String [] s=scanner.nextLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            String str= scanner.nextLine();
            char[] c=str.toCharArray();
            int r=0;
            char[] op=new char[n];
            for(int i=0;i<str.length();i++)
            {
                char cc=c[i];
                
                if(cc>='A' && cc<='Z')
                {
                    r=k%26;
                    cc=(char)(cc+r);
                    if(cc-0>90)
                    cc=(char)(cc-26);
                    op[i]=cc;
                    
                }
                else if(cc>='a' && cc<='z')
                {
                    r=k%26;
                    cc=(char)(cc+r);
                    if(cc-0>122)
                    cc=(char)(cc-26);
                    op[i]=cc;
                    
                }
                else if(cc >= '0' && cc<='9')
                {
                    r=k%10;
                    cc=(char)(cc+r);
                    if(cc>'9')
                    cc=(char)(cc-10);
                    op[i]=cc;
                }
                else
                {
                    op[i]=c[i];
                }
            }
            System.out.println(op);
            T--;
        }
        scanner.close();
    }
}