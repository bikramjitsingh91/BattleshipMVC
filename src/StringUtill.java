import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class StringUtill {

    /**
     * This function test the string is unique or not
     * @param test
     * @return Boolean
     */
    public boolean uniqueString(String test){
        boolean unique = true;          //boolean store the state of string read so far, which is true initially
        /**
         * Store the characters of the string,this is used beaucse it does not allow the duplicate and check for
         * duplicate in O(1) time using hashing function
         */
        Set<Character> checkString = new HashSet<Character>(test.length());

        int i = 0;

        // Putting the charters into the set and keep checking for dublicate at the same time
        while(i < test.length() && unique){
            char ch = test.charAt(i);
            unique = checkString.add(ch);
            i++;
        }


        return unique;
    }

    public boolean actualUnique(String str){
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
        StringUtill strUtill = new StringUtill();
        int val = str.charAt(0) - 'a';
        String binary = Integer.toBinaryString(val);
        String binaryshift = Integer.toBinaryString(1 << val);
        System.out.println("val = " + val +" Binary = " + binary + "binaryShift = " + binaryshift);
//        while(!str.equals("bye")){
//
//            boolean result =  strUtill.uniqueString(str);
//            if(result)
//                System.out.println("Input String is Unique");
//            if(!result)
//                System.out.println("Input String is not Unique");
//            System.out.print("Enter the String you want to Test: ");
//            str = sc.nextLine();
//        }


    }
}
