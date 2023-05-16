public abstract class Vehicle {
    private String brand ,licencePlate ,owner ;

    public Vehicle() {
        brand=null;
        licencePlate=null;
        owner=null;
    }

    public Vehicle(String brand, String licencePlate, String owner) {
        this.brand = brand;
        this.licencePlate = licencePlate;
        this.owner = owner;
    }

     public Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.licencePlate = vehicle.licencePlate;
        this.owner = vehicle.owner;
    }
    
    public String toString() {
        return "Brand: " + this.brand + "\nLicence Plate: " + this.licencePlate + "\nOwner: " + this.owner;
    }
    
    abstract public int calculateTax();
       
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }else if(this.getClass()!=other.getClass()){
            return false;
        }
        else{
       Vehicle vehicle = (Vehicle) other;
        return this.getBrand().equals(vehicle.getBrand()) && this.getLicencePlate().equals(vehicle.getLicencePlate())
                && this.getOwner().equals(vehicle.getOwner());
        }   
    }
         
    
}
