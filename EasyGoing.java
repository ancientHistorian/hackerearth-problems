
import java.util.*;

/** Approach : Sort the elements, find the sum of first (m-n) elements and subtract it from sum of last (m - n) elements.
 * */
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc   = new Scanner(System.in);
        
        int test = sc.nextInt();
        
        for(int j = 0; j  < test; j++){
            sc.nextLine();
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            int[] temp = new int[n];
            for(int i = 0; i < n; i++){
                temp[i] = sc.nextInt();
            }
            
            for(int k = 0; k < temp.length; k++){
                for(int l = 0; l < temp.length - k - 1; l++){
                    if(temp[l] > temp[l + 1]){
                        swap(temp, l, l + 1);
                    }
                }
            }
            int diff = n - m;
            int small = 0;
            for(int i = 0; i < diff; i++){
                small+= temp[i];
            }
            int big  = 0;
            for(int i = temp.length - 1; i > temp.length - diff - 1; i--){
                big += temp[i];
            }

            System.out.println(big - small);
        }
        
    }
    static void swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
}
