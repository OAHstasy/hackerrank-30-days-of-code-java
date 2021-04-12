import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        input.nextLine();
        
        for (int i = 0; i < n; i++){
            String even = "", odd = "";
            
            String word = input.nextLine();
            for(int j = 0; j < word.length(); j++){
                
                if (j % 2 == 0){
                    even += word.substring(j, j + 1);
                }
                else{
                    odd += word.substring(j, j + 1);
                }
                
            }
            System.out.println(even + " " + odd);
        }
    }
}
