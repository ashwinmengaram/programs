import java.util.Arrays;

class Test{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String[] arr = {"1","2","3","4","5"};
        Integer[] ints = Arrays.stream(arr).map(Integer::valueOf).toArray(Integer[]::new);
        System.out.println(Arrays.toString(ints));
    }
}