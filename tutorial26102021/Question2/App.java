package Question2;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner inNum = new Scanner(System.in);
        
        Rectangle rec;
        System.out.print("Enter Width >> ");
        double width = inNum.nextDouble();
        System.out.print("Enter Length >> ");
        double length = inNum.nextDouble();
        rec = new Rectangle(width, length);
        inNum.close();

        System.out.println("Area before changes: " + rec.calcArea());
        rec.setWidth(4.5);
        System.out.println("Area after changes: " +  rec.calcArea());

        System.out.println(rec.toString());
    }
    
}