package Graphs;
    //        5 6
    //        1 2
    //        1 3
    //        2 4
    //        3 4
    //        3 5
    //        4 5

import java.util.Scanner;

public class InputInGraphUsingAdjMatrix {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] adj = new int[n + 1][n + 1];
        for(int i = 0; i < m; i++){
            int n1 = sc.nextInt(), n2 = sc.nextInt();
            adj[n1][n2] = 1;
            adj[n2][n1] = 1;
        }

        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < n + 1; j++){
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
}
