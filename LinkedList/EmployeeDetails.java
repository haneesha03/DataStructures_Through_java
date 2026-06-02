public class EmployeeDetails{
    String name;
    int id;
    String Profession;
    EmployeeDetails reportsTo;
    public EmployeeDetails(String name,int id,String Profession){
        this.name=name;
        this.id=id;
        this.Profession=Profession;
        this.reportsTo=null;
    }
}