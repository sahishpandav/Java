package Arrays;
//        A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
//
//        For example, for arr = [1,2,3], the following are all the permutations of arr:
//        [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
//        The next permutation of an array of integers is the next lexicographically greater
//        permutation of its integer. More formally, if all the permutations of the array are
//        sorted in one container according to their lexicographical order, then the next permutation
//        of that array is the permutation that follows it in the sorted container.
//        If such arrangement is not possible, the array must be rearranged as the lowest possible
//        order (i.e., sorted in ascending order).
//
//        For example, the next permutation of arr = [1,2,3] is [1,3,2].
//        Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
//        While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a
//        lexicographical larger rearrangement.
//        Given an array of integers nums, find the next permutation of nums.
//
//        The replacement must be in place and use only constant extra memory.
public class nextPermutation {
//    in order to solve this question we need to find the breakpoint first.
//    the break point is the index i in the array when traversed in reverse order where a[i] < a[i+1]
//    for eg. breakpoint in the array {2, 1, 5, 4, 3, 0, 0} is index number 1.
//    now the array is divided into two sections at the breakpoint. 0 to i and i+1 to n-1;
//    {2, 1} {5, 4, 3, 0, 0}
//    now find the element from the second subarray such that the element is just greater that than the element
//    at break point. We will find this by traversing in reverse order as well. in this case the breakpoint is 1.
//    0 < 1, 0 < 1, 3 > 1. Therefore the 3 is the element which is just greater than the 1 in array, now swap that element
//    with the breakpoint, now our array will become {2, 3, 5, 4, 1, 0, 0}
//    now the last part is to arrange the second subarray in sorted order. we dont need to actually sort the array because
//    we only need to reverse second subarray.
//
//    there is one edge case where the array is alerady in its last permutation.
//    in such case we need to only reverse the array and return it.

    public static void reverse(int[] nums, int start, int end){
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void solve(int[] nums){
//        check for the edge case as well as the breakpoint at one iteration.
        if(nums.length <= 1) return;
        int breakpoint = 0;
        for(int i = nums.length - 2; i  >= 0; --i){
            breakpoint = i;
            if(nums[i] < nums[i+1]) break;
        }
        if(breakpoint == 0 && nums[breakpoint] > nums[breakpoint + 1]){
            reverse(nums, 0, nums.length - 1);
            return;
        }
        for(int i = nums.length - 1; i >= 0; --i) {
            if (nums[breakpoint] < nums[i]) {
                int temp = nums[breakpoint];
                nums[breakpoint] = nums[i];
                nums[i] = temp;
                reverse(nums, breakpoint + 1, nums.length - 1);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 4, 3, 0, 0};
        for(int num: nums) System.out.print(num + " ");
        System.out.println();

        solve(nums);
        for(int num: nums) System.out.print(num + " ");

    }
}
