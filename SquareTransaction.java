import java.util.Scanner;

public class SquareTransaction {
    public static void main(String[] args) {
        
        int z=0,sum;
        
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int a[]=new int[t];
        for (int i = 0; i < t; i++) {
            a[i]=s.nextInt();
        }
        int q=s.nextInt();
        for(int j=0;j<q;j++)
        { int n=s.nextInt();
            sum=0;
            for(int k=0;k<t;k++)
            {
                sum=sum+a[k];
                if(sum<n)
                z=-1;
                else
                
                {z=k+1;
                    break;}
                    
                }
                System.out.println(z);
                
            }
            s.close();
        }
        

        /*************
         import java.util.Arrays;
import java.util.Scanner;

public class SquareTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        String[] str = scanner.nextLine().split(" ");
        Integer[] ints = Arrays.stream(str).map(Integer::valueOf).toArray(Integer[]::new);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            int m = scanner.nextInt();
            int x=0;
            int c=0;
            for(int j=0;j<ints.length;j++){
                x+=ints[j];
                c++;
                if(x>=m){
                    System.out.println(c);
                    break;
                }
                if(c==ints.length){
                    System.out.println(-1);
                }
            }
           
        }
        scanner.close();
    }
}
         * ********* */
        
    }