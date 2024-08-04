package BitManipulation;

public class XORwithANDandOR {
    private static int xor1(int a, int b){
        int res = 0;
        int b1 = 0, b2 = 0;

//        assuming 32 bit integer
        for(int i = 31; i >= 0; i++){
            if((a & (1 << i)) == 0) b1 = 0;
            else b1 = 1;
            if((b & (1 << i)) == 0) b2 = 0;
            else b2 = 1;

//            if both are 1 then 0 else OR
            int bit = 0;
            if(b1 == 1 && b2 == 1) bit = 0;
            else bit = b1 | b2;
            res = res | (bit << i);

        }
        return res;
    }
    private static int xor2(int a, int b){
        return (a | b) & (~a | ~b);
    }

    private static int xor3(int a, int b){
        return (a & (~b)) | ((~a) & b);
    }

    public static void main(String[] args) {
        int a = 45, b = 12;

        System.out.println("xor1 " + xor1(a, b));
        System.out.println("xor2 " + xor2(a, b));
        System.out.println("xor3 " + xor3(a, b));
        System.out.println("result " + (a ^ b));
    }
}
