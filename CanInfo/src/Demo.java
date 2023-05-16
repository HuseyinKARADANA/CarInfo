public class Demo {


    public static void main(String[] args) {
        ContactInfo contactInfo=new ContactInfo("Turkey", "+90 4326473243", "info@gmail.com");
        Person person=new Person("Sedef", contactInfo);
        Bus bus=new Bus(27, 4, "Volkswagen", "35 TR 4356", "Yasemin");
        System.out.println(bus.toString());
        System.out.println(bus.calculateTax());
        
        Bus bus2=new Bus(bus);
        System.out.println(bus2.equals(bus));
        
    }
    
}
