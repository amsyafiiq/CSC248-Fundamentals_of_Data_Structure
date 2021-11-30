import java.util.Scanner;

public class Question2Que {
    public static void main(String[] args){
        Scanner inText = new Scanner(System.in);
        

        Queue<String> boothQ = new Queue<String>();
        Queue<String> tempQ = new Queue<String>();

        boothQ.addLast("A02001"); boothQ.addLast("B010001"); boothQ.addLast("C02001");
        boothQ.addLast("B02001"); boothQ.addLast("B01003");

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a Booth >> ");
            boothQ.addLast(inText.nextLine());
        }
        inText.close();

        System.out.println("\nBooth:- ");
        int integer = 1;
        while(!boothQ.isEmpty()) {
            String temp = boothQ.removeFirst();
            System.out.println("#" + integer + " : " + temp);
            tempQ.addLast(temp);
            integer++;
        }

        System.out.println("\nBooth for B category:- ");
        integer = 1;
        while(!tempQ.isEmpty()) {
            String temp = tempQ.removeFirst();
            if (temp.substring(0, 1).equals("B")) System.out.println("#" + integer + " : " + temp);
            boothQ.addLast(temp);
            integer++;
        }

        int a, b, c;
        a = b = c = 0;
        while(!boothQ.isEmpty()) {

            String temp = boothQ.removeFirst();
            if (temp.substring(0, 1).equals("A")) a++;
            if (temp.substring(0, 1).equals("B")) b++;
            if (temp.substring(0, 1).equals("C")) c++;
            tempQ.addLast(temp);
        }
        System.out.println("\nA: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);

        int invention = 0;
        while(!tempQ.isEmpty()) {
            String temp = tempQ.removeFirst();
            if (temp.substring(1, 3).equals("01")) invention++;;
            boothQ.addLast(temp);
        }
        System.out.println("\nInvention: " + invention);
    }
}