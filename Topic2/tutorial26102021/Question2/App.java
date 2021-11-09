package Question2;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner inNum = new Scanner(System.in);
        
        ArrayList<Rectangle> rects = new ArrayList<Rectangle>();
        
        System.out.print("Enter Width >> ");
        double width = inNum.nextDouble();
        System.out.print("Enter Length >> ");
        double length = inNum.nextDouble();
        rects.add(new Rectangle(width, length));
        inNum.close();

        System.out.println("Area before changes: " + rects.get(0).calcArea());
        rects.get(0).setWidth(4.5);
        System.out.println("Area after changes: " +  rects.get(0).calcArea());

        System.out.println(rects.toString());
    }
    
}