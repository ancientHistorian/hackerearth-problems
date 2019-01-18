
import java.util.*;
/**
 * Approach: Everytime you swap an element using bubble sort, just update the count variable.
 **/
 

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int len = sc.nextInt();
        int[] temp = new int[len];
        int count = 0;
        sc.nextLine();
        for(int i = 0; i < len; i++){
            temp[i] = sc.nextInt();
        }
        for(int i  = 0; i < len; i++){
            for(int j = 0; j < len -i -1; j++){
                if(temp[j] > temp[j + 1]){
                    swap(temp, j, j + 1);
                    count++;
                }
            }
        }
        
        System.out.println(count);

    }
    
    static void swap(int[] arr, int i, int j){
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
