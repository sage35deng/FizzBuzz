public class Reduce {
    public static void main(String[] args) {
        int num = 100;
        int count = 0;
        while (num != 0){
            count ++;
            num = reducing(num);
        }
        System.out.println(count);
    }
    private static int reducing (int a) {
        if (a % 2 == 0){
            return a/2;
        }
        else{
            return a-1;
        }
    }
}
