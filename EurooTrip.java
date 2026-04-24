public class EurooTrip{
    //INSTANCE VARIABlES (data)
    private static int processFee = 1000;
    private  String TravelerName;
    private int durationInDays;
    private boolean fivestarHotel;    
    private double luggageWeight;
    private String destinations; 
    private double TotalCost;
    
    //CONSTRUCTORS (defult + parameterized)
    public EurooTrip(){
        this.TravelerName = "DefaultClient"; 
        this.durationInDays= 14; 
        this.fivestarHotel= true;
        this.luggageWeight= 80; 
        this.destinations= "Europe Trip🛳️🗺️🇪🇸🌟";
    }
    // PARAMATERIZED CONSTRUCTORS
    public EurooTrip (String s, int t, boolean b, double d, String p ){
        this.TravelerName = s; 
        this.durationInDays = t;
        this.fivestarHotel = b;
        this.luggageWeight = d;
        this.destinations = p;
    }
   
    //ACCESSORS 
   public int getProcesFee(){
         return processFee;
   }
    public String getTravelerName(){
        return TravelerName;
    }
    public int getDurationInDays(){
        return durationInDays;
    }

    public boolean getFivestarHotel(){
        return fivestarHotel;
    }
    
    public double getLuggageWeight(){
        return luggageWeight;
    }
    public String getDestinations(){
        return destinations; 
    
   }

   //SETTERS & MUTATORS 

   public void setTravelerName (String newTravelerName){
    this.TravelerName = newTravelerName;
    }
    public void setdurationInDays(int newDurationInDays){
        this.durationInDays = newDurationInDays; 
     }
     public void setFivestarHotel (boolean newFivestarHotel){
        this.fivestarHotel = newFivestarHotel; 
     }
     public void setLuggageWeight (double newLuggageWeight){
        this.luggageWeight = newLuggageWeight; 
     }
     public void setDestinations (String newDestination){
        this.destinations = newDestination;
     }



     public void setTotalCost (){
        this.TotalCost = processFee * this.durationInDays;
     }

     public String toString(){
     String itinerary = "-----------------------------------------\n" +
                     "       🇪🇸🏖️ EUROO TRIP ☀️✨        \n" +
                     "-----------------------------------------\n" +
                     "GUEST NAME:    " + TravelerName + "\n" +
                     "STAY DURATION: " + durationInDays + " Nights\n" +
                     "LUXURY RATING: " + fivestarHotel + " / 5.0 ⭐️\n" +
                     "Luggage Weight" + luggageWeight + "\n" +
                     "DESTINATION:   " + destinations + "\n" +
                     "-----------------------------------------\n" +
                     "TOTAL COST:  $" + TotalCost + ".00\n" +
                     "-----------------------------------------\n" +
                     "  Thank you for booking with Wanderlust! \n";
    return itinerary;  
}












    }