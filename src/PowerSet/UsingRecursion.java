package PowerSet;

import java.util.ArrayList;

public class UsingRecursion {
    public static void printSubset(int idx, int[] arr, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ls){
        if(idx >= arr.length){
           ans.add(new ArrayList<>(ls));

            return;

        }

//        take it
        ls.add(arr[idx]);
        printSubset(idx + 1, arr, ans, ls);

//        not take it
        ls.remove(ls.size() - 1);
        printSubset(idx + 1, arr, ans, ls);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ls = new ArrayList<>();

        printSubset(0, arr, ans, ls);

        System.out.println(ans);

    }
}
