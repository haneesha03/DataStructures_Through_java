package CaseStudyIMS;

public class Supplier {
    private String supplierId;
    private String supplierName;;
    private String contactperson;
    private String phoneNumber;
    public Supplier(String supplierId, String supplierName, String contactperson, String phoneNumber) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.contactperson = contactperson;
        this.phoneNumber = phoneNumber;
    }
    public String getsupplierId(){
        return supplierId;
    }
    public String getsupplierName(){
        return supplierName;
    }
    public String getcontactperson(){
        return contactperson;
    }
    public String getphoneNumber(){
        return phoneNumber;
    }
    public String toString(){
        return "Supplier ID: " + supplierId + "\n" +
               "Name: " + supplierName + "\n" +
               "Contact Person: " + contactperson + "\n" +
               "Phone Number: " + phoneNumber;
    }
}
