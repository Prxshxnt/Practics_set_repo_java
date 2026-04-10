package OOPs;
 class Vehical {
    boolean hasEngine;
    int wheels;
static void startvehical(){
    System.out.println("Vehical started");
}
void setHasEngine(boolean status){
    this.hasEngine=status;
}
}

class bike extends Vehical {
    static void startvehical(){
        System.out.println("Bike started");
    }
    int gears;
    int getGears(){
        return gears; 
        
    }
    void setGears(int numGears){
        this.gears=numGears;
    }
    public static void main(String[] args) {
        bike mybike = new bike();
        mybike.setHasEngine(true);
        mybike.setGears(5);   
        Vehical.startvehical();
        System.out.println("Bike has engine: " + mybike.hasEngine);
        System.out.println("Bike gears: " + mybike.gears);      
    }

}

