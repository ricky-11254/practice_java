import java.util.Scanner;
public class Plane
{
    boolean seats[] = new boolean[11];
    int select;
    void run()
    {       
        while ( true )
        {
            Reservation();
        }   
    }
    void Reservation()
        {
            System.out.println("Please type 1 for First Class and Please type 2 for economy");
            Scanner choice = new Scanner(System.in);
            select = choice.nextInt();
             if ( select == 1 )
        {
            FirstClass();
        }
        else
        {
            Economy();
            run();
        }
        }
    void FirstClass()
    {
        Scanner input = new Scanner(System.in);
        for ( int i = 1; i <= 5; i++ )
        {
            if ( seats[i] == false )
            {
                seats[i] = true; 
                System.out.printf("First Class. Seat: %d\n", i);
                break;
            }
            else if ( seats[5] == true )
            {
                if ( seats[10] == true)
                {
                    System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
                }
                else 
                {
                    System.out.println("First Class is fully booked. Would you like Economy? 1 for Yes 2 for No");
                    select = input.nextInt();
                    if ( select == 1 )
                    {
                        Economy();
                    }
                    else
                    {
                        System.out.println("Next flight is in 3 hours.");
                    }
                }
            }
        }
    }
      void Economy()
    {
        Scanner input = new Scanner(System.in);
        for ( int i = 6; i <= 10; i++ )
        {
            if ( seats[i] == false )
            {
                seats[i] = true;
                System.out.printf("Economy. Seat: %d\n", i);
                break;
            }
            else if ( seats[10] == true )
            {
                if ( seats[5] == true)
                {
                    System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
                }
                else
                {
                    System.out.println("Economy is fully booked. Would you like First Class? 1 for Yes 2 for No");
                    select = input.nextInt();
                    if ( select == 1 )
                    {
                        FirstClass();
                        run();
                    }
                    else
                    {
                        System.out.println("Next flight is in 3 hours");
                    }
                }
            }
        }
    }
    public static void main(String[] args)
    {
      Plane passenger = new Plane();
      passenger.run();
    }
}
