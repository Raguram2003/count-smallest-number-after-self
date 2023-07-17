import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class Solution{
    public ArrayList<Integer> countSmallest(int[] arr) {

        ArrayList<Integer> ara = null;
        ara = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (arr[i] < 0) {
                ara.add(0);
            } else {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        count++;
                    }
                }
                ara.add(count);
            }
        }
        return ara;
    }
}
public class CountSmallestNumberAfterSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        Solution answer = new Solution();
        System.out.println((answer.countSmallest(arr)));
    }
}
