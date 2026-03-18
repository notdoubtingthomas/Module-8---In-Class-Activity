import java.util.Scanner;

public class Purchase_Student {
    private int invoiceNumber;
    private double saleAmount;
    private double salesTax;

    // TODO 1: Create a setter for invoiceNumber.
    public void setInvoiceNumber (int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
    // TODO 2: Create a setter for saleAmount.
    //         Inside the setter, compute salesTax as 5 percent of saleAmount.

    public void setSaleAmount(int saleAmount) {
        this.saleAmount = saleAmount;
        this.salesTax = saleAmount * 0.05;
    }
    // TODO 3: Create a display() method that prints all purchase details.

    public void display(int invoiceNumber, int saleAmount) {
        System.out.println("Purchase details: ");
        System.out.println("=================");
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Sale Amount: $" + saleAmount);
        System.out.println("Tax Amount: $" + salesTax);
        System.out.println("Total: $" + (saleAmount + salesTax));
    }

    public static void main(String[] args) {
        Purchase_Student purchase = new Purchase_Student();

        Scanner input = new Scanner(System.in);

        // TODO 4: Set the invoice number.
        System.out.print("Enter invoice number: ");
        int invoiceNumber = input.nextInt();
        purchase.setInvoiceNumber(invoiceNumber);
        // TODO 5: Set the sale amount.
        System.out.print("Enter sale amount: ");
        int saleAmount = input.nextInt();
        purchase.setSaleAmount(saleAmount);
        // TODO 6: Call display() to show the purchase details.
        purchase.display(invoiceNumber, saleAmount);
    }
}
