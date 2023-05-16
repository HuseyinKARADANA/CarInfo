public class ContactInfo {
    private String homeAddress,telNumber,eMail ;

    public ContactInfo() {
         this.homeAddress = null;
        this.telNumber = null;
        this.eMail = null;
    }

    public ContactInfo(String homeAddress, String telNumber, String eMail) {
        this.homeAddress = homeAddress;
        this.telNumber = telNumber;
        this.eMail = eMail;
    }

    public void ContactInfo(ContactInfo other) {
        this.homeAddress = other.homeAddress;
        this.telNumber = other.telNumber;
        this.eMail = other.eMail;
    }
    
    public String toString() {
        return "Home Address: " + homeAddress + "\n" +
                "Telephone Number: " + telNumber + "\n" +
                "E-mail: " + eMail;
    }
    
    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    
     public boolean equals(Object other) {
        if (other == null) {
            return false;
        }else if(this.getClass()!=other.getClass()){
            return false;
        }
        else{
            ContactInfo contactInfo=(ContactInfo) other;
            return this.getHomeAddress().equals(contactInfo.getHomeAddress()) && 
                    this.getTelNumber().equals(contactInfo.getTelNumber()) &&
                    this.geteMail().equals(contactInfo.geteMail());
        }   
    }
    
}
