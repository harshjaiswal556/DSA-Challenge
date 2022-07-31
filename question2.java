import java.util.*;
public class question2 {
    static void max_and_min(int arr[], int n){
        int resMin=arr[0], resMax=arr[0];
        for(int i=0;i<n;i++){
            resMin = Math.min(arr[i],resMin);
            resMax = Math.max(arr[i],resMax);
        }
        System.out.print(resMin+" "+resMax);
    }
    public static void main(String[] args){
        System.out.println("https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        max_and_min(arr,n);
    }
}
