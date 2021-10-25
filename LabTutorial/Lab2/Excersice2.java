package Lab2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Excersice2 {

    public static void main(String[] args) {
        // Scanner Objects
        Scanner inText = new Scanner(System.in);

        // IC_Arr ArrayList declaration
        ArrayList<String> IC_Arr = new ArrayList<String>();

        // User Input for IC_Arr
        System.out.println("IC Number format 888888-88-8888");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " - Insert IC Number >> ");
            IC_Arr.add(inText.nextLine());
        }
        inText.close();

        // KedahICArr ArrayList declaration
        ArrayList<String> KedahICArr = new ArrayList<String>();
        int count = 0; // Count for the total person from Pahang
        System.out.println("\nPerson from Pahang:- ");
        for(int i = 0; i < IC_Arr.size(); i++) {
            // Seperate each tokens from the IC Number
            StringTokenizer st = new StringTokenizer(IC_Arr.get(i), "-");
            String birthdate = st.nextToken();
            String state = st.nextToken();
            String uniqueID = st.nextToken();

            // Count and display IC Number for person from Pahang
            if (state.equals("06")) {
                System.out.println(IC_Arr.get(i));
                count++;
            }

            // Searching for person from Kedah and insert it into KedahICArr
            if (state.equals("02")) {
                KedahICArr.add(IC_Arr.get(i));
            }
        }
        System.out.println("TOTAL : " + count + "\n");
        System.out.println("The size of KedahICArr : " + KedahICArr.size());
        System.out.println("IC_Arr : " + IC_Arr.toString());
        System.out.println("KedahICArr : " + KedahICArr.toString());
    }
}