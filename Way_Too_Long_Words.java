import java.util.*;

public class Way_Too_Long_Words {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String str = sc.next();

            

                int num = str.length() - 2;

                System.out.println(
                    "" + str.charAt(0) + num + str.charAt(str.length() - 1)
                );

      
        }
    }
}