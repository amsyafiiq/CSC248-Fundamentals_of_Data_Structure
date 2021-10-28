import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceApp {
    public static void main(String[] args) {
        // Scanner Object Declartions
        Scanner inText = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);
        
        // Invoice Object ArrayList declaration
        ArrayList<Invoice> invoice = new ArrayList<Invoice>();
        
        // User input data
        final int SIZE = 6;  // For loop itteration
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Order ID >> ");
            int orderID = inNum.nextInt();
            System.out.print("Customer Name >> ");
            String custName = inText.nextLine();
            System.out.print("Product Name >> ");
            String prodName = inText.nextLine();
            System.out.print("Product Quantity >> ");
            int prodQuantity = inNum.nextInt();
            System.out.print("Unit Price >> ");
            double unitPrice = inNum.nextDouble();

            invoice.add(new Invoice(orderID, custName, prodName, prodQuantity, unitPrice));
        }
        inNum.close(); inText.close();

        int count = 0;
        for (int i = 0; i < invoice.size(); i++) {
            if (invoice.get(i).getUnitPrice() > 5000) {
                System.out.println(invoice.get(i).toString());
                count++;
            }
        }
        System.out.println("\nTOTAL: " + count);

        ArrayList<Double> payment = new ArrayList<Double>();
        for (int i = 0; i < invoice.size(); i++) {
            payment.add(invoice.get(i).getProdQuantity() + invoice.get(i).getUnitPrice());
        }

        double highest = 0; int index = 0;
        for(int i = 0; i < payment.size(); i++) {
            if (payment.get(i) > highest) {
                highest = payment.get(i);
                index = i;
            }
        }
        System.out.println("Highest total payment: RM " + highest);
        System.out.println(invoice.get(index).toString());
    }
    
}