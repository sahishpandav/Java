package ExceptionHandeling;

public class Ex1 {

    public static void main(String args[]){
        try{
            //code that may raise exception
            int data=100/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        //executed regardless of exception occurred or not
        finally {
            System.out.println("finally block is always executed");
        }
        //rest code of the program
        System.out.println("rest of the code...");
    }

}
