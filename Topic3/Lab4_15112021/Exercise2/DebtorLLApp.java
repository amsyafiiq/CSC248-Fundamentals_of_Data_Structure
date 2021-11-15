package Exercise2;

/**
 * DebtorLLApp class Definition
 */

import java.util.*;

public class DebtorLLApp {
    public static void main(String[] args){
        Scanner inText = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);

        LinkedList debtorList = new LinkedList();

        debtorList.insertAtFront(new Debtor("Ahmad Sulung bin Razak", 5800.70, 30390, "2"));
        debtorList.insertAtFront(new Debtor("Juliana binti Ahmad Kamil", 8880.80, 70000.00, "1"));

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Name >> ");
            String name = inText.nextLine();
            System.out.print("Enter Salary >> RM ");
            double salary = inNum.nextDouble();
            System.out.print("Enter Amount of Debt >> RM ");
            double debt = inNum.nextDouble();
            System.out.print("Enter Category (1, 2) >> ");
            String category = inText.nextLine();

            debtorList.insertAtBack(new Debtor(name, salary, debt, category));
        }
        inText.close(); inNum.close();

        Debtor debtor = debtorList.getFirst();
        System.out.println("Debtor with Salary is higher than RM 2000");
        System.out.println("=========================================");
        while(debtor != null) {
            if (debtor.getSalary() > 2000) {
                System.out.println(debtor.toString());
            }
            debtor = debtorList.getNext();
        }

        System.out.println("Loan for category \"1\": " + count1(debtorList));
    
        debtor = debtorList.getFirst();
        final double INTEREST = 0.15;
        System.out.println("\nTotal Amount to be Paid by all Debtors");
        System.out.println("======================================");
        while(debtor != null) {
            double overdue = (debtor.getAmount() * INTEREST) + debtor.getAmount();

            System.out.println("Debtor Name       >> " + debtor.getName() + "\n"
                             + "Amount to be Paid >> RM " + String.format("%.2f", overdue));
            debtor = debtorList.getNext();
        }
    }

    public static int count1(LinkedList list) {
        int count = 0; Debtor debtor = list.getFirst();

        while(debtor != null) {
            if (debtor.getCategory().equals("1")) 
                count++;
            
            debtor = list.getNext();
        }
        return count;
    }

    // For printing all value in LinkedList
    public static void printLL(LinkedList list) {
        Debtor debtor = list.getFirst();

        while(debtor != null) {
            System.out.println(debtor.toString());
            debtor = list.getNext();
        }
    }
}