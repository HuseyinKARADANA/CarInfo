public class Person {
    private String name,surname;
    private ContactInfo contactInfo=new ContactInfo();

    public Person() {
        name=null;
        surname=null;
    }

     public Person(String name, ContactInfo contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }
    
    
    public Person(Person person) {
        this.name = person.name;
        this.contactInfo = person.contactInfo;
    }
     public String toString() {
        return "Name: " + this.name + "\nContact Information: " + this.contactInfo;
    }
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
    
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }else if(this.getClass()!=other.getClass()){
            return false;
        }
        else{
        Person person = (Person) other;
        return this.getName().equals(person.getName()) && this.getContactInfo().equals(person.getContactInfo());
        }   
    }
}
