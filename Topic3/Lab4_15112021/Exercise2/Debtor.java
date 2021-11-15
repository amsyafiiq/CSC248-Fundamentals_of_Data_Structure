package Exercise2;

public class Debtor {
    private String name;
    private double salary;
    private double amount;
    private String category;

    public Debtor(String name, double salary, double amount, String category) {
        this.name = name;
        this.salary = salary;
        this.amount = amount;
        this.category = category;
    }

    public String getName() {return name;}
    public double getSalary() {return salary;}
    public double getAmount() {return amount;}
    public String getCategory() {return category;}

    public void setName(String name) {this.name = name;}
    public void setSalary(double salary) {this.salary = salary;}
    public void setAmount(double amount) {this.amount = amount;}
    public void setCategory(String category) {this.category = category;}

    public String toString () {
        return ("Name: " + name + "\n"
              + "Salary: " + salary + "\n"
              + "Amount :" + amount + "\n"
              + "Category: " + category + "\n");
    }
}