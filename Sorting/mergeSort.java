import java.util.ArrayList;

public class mergeSort {

    public static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();  // making temp array
        // now we have to merge two sorted arrays
        // left and right subarray
        // left array starts form low and right array starts form mid + 1
        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        // transfering all the elements from temp to arr
        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }
    }
    public static void mS(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = (low + high)/2;
        mS(arr, low, mid);
        mS(arr, mid+1, high);
        merge(arr, low, mid, high);

    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 3, 6, 9, 1, 4, 8, 2};
        int low, high;
        low = 0;
        high = arr.length;
        mS(arr, low, high - 1);
        for (int i = 0; i <high; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

