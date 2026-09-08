import java.util.*;
public class Team {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int val = 0;

        for(int i = 0 ; i < n ; i++){

            arr[i] = sc.nextInt();

        }

        for(int i = 0 ; i  < arr.length; i++){
            int count = 0;
            for(int j = 0 ; j < 3 ; j++){
                if(arr[j] == 1){
                    count++;
                }

            }

            if(count == 2){
                val++;
            }
        }

        System.out.println(val);
        
    }
}
