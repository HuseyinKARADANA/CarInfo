public class Bus extends Vehicle{
    private int capacity,ageOfBus;
    @Override
    public int calculateTax() {
       if(this.ageOfBus<5){
           return 4000;
       }else if(this.ageOfBus>=5&& this.ageOfBus<10){
           return 3000 ;
       }else{
           return 2000;
       }
       
    }
    public Bus() {
        this.capacity=0;
        this.ageOfBus=0;
    }

    public Bus(int capacity, int ageOfBus, String brand, String licencePlate, String owner) {
        super(brand, licencePlate, owner);
        this.capacity = capacity;
        this.ageOfBus = ageOfBus;
    }
    
    public Bus(Bus bus){
        super(bus);
        this.capacity=bus.capacity;
        this.ageOfBus=bus.ageOfBus;  
       
    }
    
    public String toString() {
        return super.toString() + ", Capacity: " + capacity + ", Age of Bus: " + ageOfBus;
    }        

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAgeOfBus() {
        return ageOfBus;
    }

    public void setAgeOfBus(int ageOfBus) {
        this.ageOfBus = ageOfBus;
    }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }else if(this.getClass()!=other.getClass()){
            return false;
        }
        else{
       Bus bus = (Bus) other;
            return super.equals(bus) && this.getCapacity() == bus.getCapacity() && this.getAgeOfBus() == bus.getAgeOfBus();
        }   
    }
    
    
}
