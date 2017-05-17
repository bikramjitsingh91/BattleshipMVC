import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by bsvic on 2017-05-10.
 */
public class StringUtill_v2 {

    /**
     * This function test the string is unique or not
     * @param test
     * @return Boolean
     */
        public boolean uniqueString(String str){
        if (str.length() > 256)
            return false;

        int result = 0;
        for (int i = 0; i< str.length();i++){
            int val = str.charAt(i) - 'a';
            if((result & (1<< val)) > 0)
                return false;
            result = (result |= (1<<val));
        }
        return true;
    }

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String you want to Test: ");
        String str = sc.nextLine();
        StringUtill_v2 strUtill = new StringUtill_v2();

        while(!str.equals("bye")){

            boolean result =  strUtill.uniqueString(str);
            if(result)
                System.out.println("Input String is Unique");
            if(!result)
                System.out.println("Input String is not Unique");
            System.out.print("Enter the String you want to Test: ");
            str = sc.nextLine();
        }


    }
}
