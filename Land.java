import java.util.Scanner;
class Land{
    Scanner input = new Scanner(System.in);
    double size;
    String location;
    void CaptureData()
    {
        System.out.println("Enter size of land: ");
        size = input.nextDouble();
        System.out.println("Enter location of land: ");
        location = input.nextLine();
    }
}
class Transaction extends Land{
    double price, discount;
    void Agreement()
    {
        CaptureData();
        System.out.println("Enter price per acre: ");
        price = input.nextDouble();
        System.out.println("Enter discount if any(in percentage): ");
        discount = input.nextDouble();

    }
}

class Payment extends Transaction{
    double payable_amount;
    String mode_of_payment;
    void Finalize()
    {
        Agreement();
        payable_amount = (size* price)- discount;
        System.out.println("Enter mode of payment: ");
        System.out.println("Amount to be paid: "+payable_amount);
        System.out.println("Mode of payment: "+mode_of_payment); 
        System.out.println("Location: "+location);
        System.out.println("Size: "+size);
        System.out.println("Price: "+price);
        System.out.println("Discount: "+discount);
        System.out.println("Payable Amount: "+payable_amount);
   }
   public static void main(String[] args)
   {
    Payment output = new Payment();
    output.Finalize();
   }
}