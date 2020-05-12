import java.util.Scanner;

public class BishuAndSoldiers {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sp[]=new int[n];
        for(int i=0;i<n;i++)
        sp[i]=s.nextInt();
        int r=s.nextInt();
        for(int i=0;i<r;i++)
        {
            int sum=0, co=0;
            int bp=s.nextInt();
            for(int j=0;j<sp.length;j++)
            {
                if(sp[j]<=bp)
                {
                    sum+=sp[j];
                    co++;
                }
            }
            System.out.println(co+" "+sum);
        }
        s.close();
        // Scanner scanner = new Scanner(System.in);
        // int T = scanner.nextInt();
        // scanner.nextLine();
        // String[] arr = scanner.nextLine().split(" ");
        // Integer[] soldiers = Arrays.stream(arr).map(Integer::valueOf).toArray(Integer[]::new);
        // int Q = scanner.nextInt();
        // for(int i=0;i<Q;i++){
        //     int n = scanner.nextInt();
        //     int c = 0;
        //     int sum = 0; 
        //     for(int j=0;j<soldiers.length;j++){
        //         if(soldiers[j]<=n){
        //              c++;
        //              sum+=soldiers[j];
        //         }
        //     }
        //     System.out.println(c+" "+sum);
        // }
    }
}