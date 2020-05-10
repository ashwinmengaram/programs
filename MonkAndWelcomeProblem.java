import java.util.Arrays;
import java.util.Scanner;

/*input
5
1 2 3 4 5
4 5 3 2 10
*/
class MonkAndWelcomeProblem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val =scanner.nextInt();
        scanner.nextLine();
        String[] first = scanner.nextLine().split(" ");
        
        String[] second = scanner.nextLine().split(" ");
        

        Integer[] firstInts = Arrays.stream(first).map(Integer::valueOf).toArray(Integer[]::new);
        Integer[] secondInts = Arrays.stream(second).map(Integer::valueOf).toArray(Integer[]::new);
        Integer[] sum = new Integer[val];
        for(int i=0;i<val;i++){
            sum[i]=firstInts[i]+secondInts[i];
        }

        System.out.println(Arrays.toString(sum));
        
    }
}