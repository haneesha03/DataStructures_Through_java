public class EmployeeList {
    public static void main(String args[]){
        EmployeeDetails emp1=new EmployeeDetails("haneesha",101,"CEO");
        EmployeeDetails emp2=new EmployeeDetails("John",102,"Manager");
        EmployeeDetails emp3=new EmployeeDetails("Alex",03,"TeamLeader");
        EmployeeDetails emp4=new EmployeeDetails("Emily",104,"Developer");
        emp4.reportsTo=emp3;
        emp3.reportsTo=emp2;
        emp2.reportsTo=emp1;
        EmployeeDetails current=emp4;
        while(current!=null){
            System.out.println("Employee Name:"+current.name);
            System.out.println("Employee ID:"+current.id);
            System.out.println("Employee Profession:"+current.Profession);
            current=current.reportsTo;
        }
        EmployeeDetails empNew=new EmployeeDetails("david",105,"Project Manager");
        empNew.reportsTo=emp2;
        emp3.reportsTo=empNew;
        System.out.println("printing in reverse order:\n\n");
        printReverse(emp4);
    }
    public static void printReverse(EmployeeDetails emp){
        if(emp==null){
            return;
        }
        printReverse(emp.reportsTo);
        System.out.println(emp.name);
    }
}
