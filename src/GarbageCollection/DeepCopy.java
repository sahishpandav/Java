package GarbageCollection;

public class DeepCopy {
    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = a;

        System.out.println(a);
        System.out.println(b);

        b--;
        System.out.println(a);
        System.out.println(b);
    }
}
