package RajaSoftwareLabs;

public class SecondSmallest {

    public static void insertion_sort(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j - 1];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1};
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) {
                min = arr[i];
            }else if(arr[i] < secondMin && arr[i] > min) secondMin = arr[i];
        }
        System.out.println(min + " " + secondMin);
        insertion_sort(arr);

    }
}
