import java.util.*;

/** Approach: Sort both the arrays containing strengths of vaccines as well as midichlorians count of patients, then
 * for each element check if strength of vaccine is greater than or equal to corresponding midichlorian count of a patient.
 * **/
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] strengths = new int[n];
        for(int i = 0; i < n; i++){
            strengths[i] = sc.nextInt();
        }
        int[] counts = new int[n];
        sc.nextLine();
        for(int i = 0; i < n; i++){
            counts[i] = sc.nextInt();
        }
        
        Arrays.sort(strengths);
        Arrays.sort(counts);
        
        for(int i = 0; i < n; i++){
            if(strengths[i] <= counts[i]) continue;
            else {
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
    }
}
