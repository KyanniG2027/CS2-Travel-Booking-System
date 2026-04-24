import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        EurooTrip myTrip = bookTrip(scan);

     }

     //Our method to creare objects 
     public static EurooTrip bookTrip( Scanner scan) {
        EurooTrip trip = new EurooTrip ();
        
        System.out.println("Name");
        String name = scan.nextLine(); 

        System.out.println("How long are you going for?");
        int duration = scan.nextInt(); 

        System.out.println("5 start Hotel? true or false");
        boolean hotel = scan.nextBoolean();

        System.out.println ("How much does your luggage weigh?");
        double weight = scan.nextDouble();

        System.out.println("Where are you going");
        String destination = scan.nextLine();

        trip.setTravelerName(name); 
        trip.setdurationInDays(duration);
        trip.setFivestarHotel(hotel);
        trip.setLuggageWeight(weight);
        trip.setDestinations(destination);
        trip.setTotalCost();
        return trip;

     }


}

