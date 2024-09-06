package Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class InputInGraphUsingAdjList {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n + 1; i++) adj.add(new ArrayList<>());
        for(int i = 0; i < m; i++){
            int n1 = sc.nextInt(), n2 = sc.nextInt();
            adj.get(n1).add(n2);
            adj.get(n2).add(n1);
        }
        System.out.println(adj);
    }
}
