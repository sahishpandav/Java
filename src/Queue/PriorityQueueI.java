package Queue;

import java.util.PriorityQueue;

public class PriorityQueueI {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,2,1,5,7,8,9,10};
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        for(int num: nums) pQ.offer(num);
        while(!pQ.isEmpty()){
            System.out.println(pQ.poll());
        }

    }
}
