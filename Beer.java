import java.util.Scanner;

/**
 *
 * @author MOBBI
 */
public class Beer {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        System.out.println("BEER BRAND\tPrice\n1).Tusker\t100/=\n2).Pilsner\t120/=\n3).Smirnoff Ice\t140/=\n4).White Cap\t90/=\n");
        Scanner pombe=new Scanner(System.in);
        
        int choice,quantity;
        double amount;
        choice= pombe.nextInt();
        switch(choice){
            case 1:
                System.out.println("how many bottles of tusker do you want?");
                quantity= pombe.nextInt();
                amount=quantity*100;
                System.out.printf("%d bottles of tusker will cost you KSH.%.2f", quantity,amount);
                break;
            case 2:
                System.out.println("how many bottles of Pilsner do you want?");
                quantity= pombe.nextInt();
                amount=quantity*120;
                System.out.printf("%d bottles of pilsner will cost you KSH.%.2f", quantity,amount);
                break;
            case 3:
                System.out.println("how many bottles of Smirnoff Ice do you want?");
                quantity= pombe.nextInt();
                amount=quantity*140;
                System.out.printf("%d bottles of Smirnoff Ice will cost you KSH.%.2f", quantity,amount);
                break;
            case 4:
                System.out.println("how many bottles of White Cap do you want?");
                quantity= pombe.nextInt();
                amount=quantity*90;
                System.out.printf("%d bottles of White Cap will cost you KSH.%.2f", quantity,amount);
                break;
            default:
                System.out.println("Be realistic.");
                break;
        }
        
    }
}