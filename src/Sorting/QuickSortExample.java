package Sorting;

public class QuickSortExample {
    public static int partition(int[] nums, int low, int high){
        int pivot = nums[low];
        int i = low, j = high;
        while(i < j){
            while(pivot >= nums[i] && i <= high - 1){
                i++;
            }
            while(pivot <= nums[j] && j >= low + 1){
                j--;
            }
            if(i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;
        return j;
    }
    public static void quickSort(int[] nums, int low, int high){
        if(low < high){
            int pIndex = partition(nums, low, high);
            quickSort(nums, low, pIndex - 1);
            quickSort(nums, pIndex + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,6,2,3,10,15,16,84};
        for(int num: arr){
            System.out.print(num + " ");
        }
        quickSort(arr, 0, arr.length - 1);
        System.out.println();
        for(int num: arr){
            System.out.print(num + " ");
        }

    }
}
