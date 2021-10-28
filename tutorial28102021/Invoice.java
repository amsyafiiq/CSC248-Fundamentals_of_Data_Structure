/**
 * Invoice
 */
public class Invoice {
    private int orderID, prodQuantity;
    private String custName, prodName;
    private double unitPrice;

    public Invoice (int orderID, String custName, String prodName, int prodQuantity, double unitPrice) {
        this.orderID = orderID;
        this.custName = custName;
        this.prodName = prodName;
        this.prodQuantity = prodQuantity;
        this.unitPrice = unitPrice;
    }

    public int getOrderID() {return orderID;}
    public String getCustName() {return custName;}
    public String getProdName() {return prodName;}
    public int getProdQuantity() {return prodQuantity;}
    public double getUnitPrice() {return unitPrice;}

    public String toString() {
        return ("Invoice Information:-\n"
              + "Order ID: " + orderID + "\n"
              + "Customer Name: " + custName + "\n"
              + "Product Name: " + prodName + "\n"
              + "Product Quantity: " + prodQuantity + "\n"
              + "Unit Price: " + unitPrice);
    }
}