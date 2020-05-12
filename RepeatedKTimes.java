import java.util.Arrays;
import java.util.Scanner;

class RepeatedKTimes {
    public static void main(String args[] ) {
        
        Scanner br = new Scanner(System.in);
        int num = br.nextInt();
        int count=1;
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=br.nextInt();
        }
        int times = br.nextInt();
        Arrays.sort(arr);
        if(times==1)
        {
            System.out.println(arr[0]);
            br.close();
            return;
        }
        int small=Integer.MAX_VALUE;
        for(int i=0;i<num;i++)
        {
            int k=i+1;
            count=1;
            for(int j=1;j<times;j++)
            {
                if(arr[i]==arr[k])
                {
                    small=arr[i];
                    count=count+1;
                    k++;
                }
                else
                {
                    break;
                }
            }
            if(count==times)
            {
                System.out.println(small);
                break;
            }
        }
        br.close();
    }
}