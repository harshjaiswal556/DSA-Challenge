import java.util.*;

public class question3 {
    static int k_smallest(int arr[], int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }
        int cnt = 1, ans=0;
        while (!pq.isEmpty()) {
            if(cnt==k){
                ans=pq.peek();
            }
            cnt++;
            pq.poll();
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(k_smallest(arr, n, k));
    }
}
