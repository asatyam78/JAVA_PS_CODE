import java.util.Arrays;
import java.util.Scanner;

public class KthLargestAndSmallest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    
    for(int i = 0; i<n; i++) {
        arr[i] = sc.nextInt();
    }
    
    int k = sc.nextInt();

    if(k > n || k < 0) {
      System.out.println("Enter k less than n or greater than 0");
      System.exit(1);
  }

    System.out.println("Kth largest: " + kthLargest(arr, k));
    System.out.println("Kth Smallest: " + kthSmallest(arr, k));
  }

  public static int kthLargest (int arr[], int k) {
    Arrays.sort(arr);
    return arr[arr.length - k];
  }
  
  public static int kthSmallest (int arr[], int k) {
    Arrays.sort(arr);
    return arr[k - 1];
  }
}
