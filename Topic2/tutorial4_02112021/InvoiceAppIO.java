import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class InvoiceAppIO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Topic2/tutorial4_02112021/invoiceData.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("Topic2/tutorial4_02112021/highLowQty.txt"));
        PrintWriter pw2 = new PrintWriter(new FileWriter("Topic2/tutorial4_02112021/sortProduct.txt"));

        ArrayList<Invoice> invoiceList = new ArrayList<Invoice>();

        String line = null;
        while((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line, ";");
            int orderID = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            String prodName = st.nextToken();
            int prodQuantity = Integer.parseInt(st.nextToken());
            double unitPrice = Double.parseDouble(st.nextToken());

            invoiceList.add(new Invoice(orderID, name, prodName, prodQuantity, unitPrice));
        }
        br.close();

        System.out.println("Data in ArrayList: \n" + invoiceList.toString());

        int highest = 0, lowest = invoiceList.get(0).getProdQuantity();
        int iHighest = 0, iLowest = 0;
        for (int i = 0; i < invoiceList.size(); i++) {
            if (invoiceList.get(i).getProdQuantity() > highest) {
                highest = invoiceList.get(i).getProdQuantity();
                iHighest = i;
            }

            if (invoiceList.get(i).getProdQuantity() < lowest) {
                lowest = invoiceList.get(i).getProdQuantity();
                iLowest = i;
            }       
        }

        pw.println("Lowest Product Quantity: " + lowest + "\n"
                 + "Order Details: " + invoiceList.get(iLowest).toString());
                 pw.println("Highest Product Quantity: " + highest + "\n"
                 + "Order Details: " + invoiceList.get(iHighest).toString());
        pw.close();

        for (int i = 0; i < invoiceList.size(); i++) {
            for (int j = 1; j < invoiceList.size(); j++) {
                if (invoiceList.get(j - 1).getProdName().compareToIgnoreCase(invoiceList.get(j).getProdName()) > 0) {
                    Invoice temp = invoiceList.get(j - 1);
                    invoiceList.set(j - 1, invoiceList.get(j));
                    invoiceList.set(j, temp);
                }
            }
        }
        pw2.println("Sorted List:");
        for (int i = 0; i < invoiceList.size(); i++) {
            pw2.print(invoiceList.get(i).toString()); 
        }
        pw2.close();
    }
    
}