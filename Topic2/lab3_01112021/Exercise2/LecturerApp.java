package Exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class LecturerApp {
    public static void main(String[] args){
        // Scanner class Declaration
        Scanner inText = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);
        
        // ArrayList of Object Lecturer named lectArr
        ArrayList<Lecturer> lectArr = new ArrayList<Lecturer>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Lecturer " + (i + 1));
            System.out.print("Enter Name >> ");
            String name = inText.nextLine();
            System.out.print("Enter Staff ID >> ");
            int staffID = inNum.nextInt();
            System.out.print("Enter Grade >> ");
            int grade = inNum.nextInt();

            System.out.println();
            lectArr.add(new Lecturer(name, staffID, grade));
        }
        inText.close();inNum.close();


        int count = 0;
        for (int i = 0; i < lectArr.size(); i++) {
            if (lectArr.get(i).getGrade() == 52) {
                count++;
            }
        }
        System.out.println("Total lecturers with grade 52: " + count);
        System.out.println();

        Lecturer lect = null;
        for (int i = 0; i < lectArr.size(); i++) {
            for (int j = 1; j < lectArr.size() - i; j++) {
                if (lectArr.get(j - 1).getName().compareToIgnoreCase(lectArr.get(j).getName()) > 0) {
                    // Swap Element
                    lect = lectArr.get(j - 1);
                    lectArr.set(j - 1, lectArr.get(j));
                    lectArr.set(j, lect);
                }
            }
        }
        System.out.println("After Sorting: \n" + lectArr.toString());
        System.out.println();

        System.out.println("Lecturer details with name Yusuf:-");
        boolean found = false;
        for (int i = 0; i < lectArr.size(); i++) {
            if (lectArr.get(i).getName().contains("Yusuf")) {
                System.out.println(lectArr.get(i).toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println(" -- Not Found --");
        }
        System.out.println();

        for (int i = 0; i < lectArr.size(); i++) {
            for (int j = 1; j < lectArr.size() - i; j++) {
                if (lectArr.get(j - 1).getGrade() > lectArr.get(j).getGrade()) {
                    // Swap Element
                    lect = lectArr.get(j - 1);
                    lectArr.set(j - 1, lectArr.get(j));
                    lectArr.set(j, lect);
                } else if (lectArr.get(j - 1).getGrade() > lectArr.get(j).getGrade()) {
                    if (lectArr.get(j - 1).getName().compareToIgnoreCase(lectArr.get(j).getName()) > 0) {
                        // Swap Element
                        lect = lectArr.get(j - 1);
                        lectArr.set(j - 1, lectArr.get(j));
                        lectArr.set(j, lect);
                    }
                }
            }
        }
        System.out.println("After Sorting Based on Grade and Name: \n" + lectArr.toString());
        System.out.println();
    }
}