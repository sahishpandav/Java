package BitManipulation;

public class decimal2Binary {
    private static String convert2Binary(int num){
        StringBuilder sb = new StringBuilder();
        while(num != 0){
            int x = num % 2;
            sb.append(x);
            num /= 2;
        }
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        int num = 100;
        System.out.println(num);
        System.out.println(convert2Binary(num));
        System.out.println(num);
    }
}
