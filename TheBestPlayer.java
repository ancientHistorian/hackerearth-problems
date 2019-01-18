
/**
Approach: Create a separate class to store each Fan object with attributes name and their quotient. Store all fans' names
quotients in an array 'fans' of type Fan[]. Sort them according to the conditions mentioned in the problem. Take the first
n entries and print them, where n is the number of fans to be chosen .
**/
import java.util.*;

class TestClass {
    
    static class Fan{
        String name;
        int quotient;
        Fan(String n, int q){
            this.name = n;
            this.quotient = q;
        }
        @Override
        public String toString(){
            return  this.name + " " + this.quotient;
        }
    }
    public static void main(String args[] ) throws Exception {
        
        Scanner sc =  new Scanner(System.in);
        
        int test = sc.nextInt();
        int choose  = sc.nextInt();
        sc.nextLine();
        Fan[] fans = new Fan[test];
        for(int i = 0; i < test; i++){
            
            String s = sc.nextLine();
            String[] temp  = s.split("\\s");
            String name = temp[0];
            int quot = Integer.parseInt(temp[1]);
            Fan f  = new Fan(name, quot);
            fans[i] = f;
            
            
        }
        sortByVal(fans);
        // System.out.println(Arrays.toString(fans));
        
        for(int i = 0; i < choose; i++){
            if(i < fans.length){
                System.out.println(fans[i].name);
            }
        }
   

    }
    
    static Fan[] sortByVal(Fan[] fans){
        
        Arrays.sort(fans, new Comparator<Fan>(){
            
            public int compare(Fan f1, Fan f2){
                if(f1.quotient > f2.quotient){
                    return -1;
                }
                else if(f1.quotient == f2.quotient){
                    return (f1.name).compareTo(f2.name);
                }else{
                    return 1;
                }
            }
        });
        
        return fans;
    }

}
