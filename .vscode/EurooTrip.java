public class EurooTrip{
    //INSTANCE VARIABlES (data)
    private static int procesFee = 1000;
    private  String TravelerName;
    private int durationInDays;
    private boolean fivestarHotel;    
    private double luggageWeight;
    private String destinations; 
    
    //CONSTRUCTORS (defult + parameterized)
    public EurooTrip(){
        this.TravelerName = "DefaultClient"; 
        this.durationInDays= 14; 
        this.fivestarHotel= yes;
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
         return procesFee;
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
        this.DurationInDays = newDurationInDays; 
     }
     public void setFivestarHotel (boolean newFivestarHotel){
        this.FivestarHotel = newFivestarHotel; 
     }
     public void setLuggageWeight (double newLuggageWeight){
        this.LuggageWeight = newLuggageWeight; 
     }
     public void setDestinations (String newDestination){
        this.Destinations = newDestination;
     }



     public void setTotalCost (){
        this.TotalCost = processFee * this.durationInDays;
     }

     public String toString(){
     String itinerary = "-----------------------------------------\n" +
                     "       🇪🇸🏖️ EUROO TRIP ☀️✨        \n" +
                     "-----------------------------------------\n" +
                     "GUEST NAME:    " + travelerName + "\n" +
                     "STAY DURATION: " + DurationInDays + " Nights\n" +
                     "LUXURY RATING: " + FivestarHotel + " / 5.0 ⭐️\n" +
                     "Luggage Weight" + LuggageWeight + "\n" +
                     "DESTINATION:   " + destination + "\n" +
                     "-----------------------------------------\n" +
                     "TOTAL COST:  $" + TotalPackageCost + ".00\n" +
                     "-----------------------------------------\n" +
                     "  Thank you for booking with Wanderlust! \n";
    return itinerary;  
}












    }