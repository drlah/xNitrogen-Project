import java.util.Scanner;

public class TilesShop 
{
    String id, city, manager, name, ceo;
    String mobile;
    
    TilesShop()
    {
        id = "CBE";
        city = "Coimbatore";
        manager = "Velmurugan";
    }

    TilesShop(String name, String head_branch_city, String mobile, String ceo)
    {
        this.name = name;
        this.city = head_branch_city;
        this.mobile = mobile;
        this.ceo = ceo;
    }
    
    TilesShop(String ceo)
    {
        this("Mahalakshmi Cerramics", "Kumbakonam", "9000080000", ceo);
    }
    
    TilesShop(String head_branch_city, String mobile)
    {
        this("Mahalakshmi Cerramics", head_branch_city, mobile, "Arun");
    }
    
    void display()
    {
        System.out.println("\nShop Name         : " + name);
        System.out.println("\nHead Branch City  : " + city);
        System.out.println("\nMobile            : " + mobile);
        System.out.println("\nCEO               : " + ceo);
        System.out.println("=========================================");
    }
    
    void branchInfo(String id, String city, String manager) 
    {
        System.out.println("\n=========================================");
        System.out.println("Branch Details: ");
        System.out.println("\nID          : " + this.id);
        System.out.println("\nName        : " + this.manager);
        System.out.println("\nDesignation : " + this.city);
        System.out.println("=========================================");
    }
    
    public static void main(String[] args) {

        int choice;
        String empid, empname, desig, bid, manager, bcity;
        String shop_name, mobile, ceo, head_city;
        double salary;
        Scanner in = new Scanner(System.in);
        
        EmployeeInfo emp = new EmployeeInfo();
        BranchInfo branch = new BranchInfo();

        System.out.print("\nMAHALAKSHMI CERRAMICS\n=========== =========");
        System.out.print("\n1) Employee Info");
        System.out.print("\n2) Branches Info");
        System.out.print("\n3) Tiles Shop Info\n");
        System.out.print("\nSelect which info you want to work on: ");
        choice = in.nextInt();
        
        switch (choice) {
            case 1:
            System.out.println("\n=========================================");
            System.out.println("Enter Employee Details:");
                System.out.print("\nID         : ");
                empid = in.next();
                System.out.print("\nName       : ");
                empname = in.next();
                System.out.print("\nDesignation: ");
                desig = in.next();
                System.out.print("\nSalary     : ");
                salary = in.nextDouble();
                
                System.out.println("=========================================");
                emp.empDetails(empid, empname);
                emp.display();
                emp.empDetails(empid, empname, desig);
                emp.display();
                System.out.println("4 Params Employee Details:");
                emp.empDetails(empid, empname, desig, salary);
                emp.display();
                break;
                
            case 2:
                System.out.println("\n=========================================");
                System.out.println("Enter Branch Details:");
                System.out.print("\nBranch ID: ");
                bid = in.next();
                System.out.print("\nBranch City: ");
                bcity = in.next();
                System.out.print("\nManager Name: ");
                manager = in.next();
                
                branch.branchInfo(bid, bcity, manager);
                break;
                
                case 3:
                System.out.println("\n=========================================");
                System.out.println("Enter Tiles Shop Details:");
                System.out.print("\nShop Name: ");
                shop_name = in.next();
                System.out.print("\nHead Branch City: ");
                head_city = in.next();
                System.out.print("\nMobile: ");
                mobile = in.next();
                System.out.print("\nCEO Name: ");
                ceo = in.next();
                System.out.println("\n=========================================");

                TilesShop shop = new TilesShop(shop_name, head_city, mobile, ceo);
                TilesShop shop1 = new TilesShop(head_city, mobile);
                TilesShop shop2 = new TilesShop(ceo);
                
                System.out.println("Shop Details:");
                shop.display();
                System.out.println("Shop 1 Details:");
                shop1.display();
                System.out.println("Shop 2 Details:");
                shop2.display();
                break;
                
            default:
                System.out.println("\nSorry Choice is Not Avail!");
        }

        in.close(); //Closing Scanner Class
    }
}

//For Method Overriding
class BranchInfo extends TilesShop 
{
    //Overrides Parent Class TilesShop
    void branchInfo(String id, String city, String manager) 
    {
        System.out.println("\n=========================================");
        System.out.println("Branch Details: ");
        System.out.println("\nID          : " + id);
        System.out.println("\nDesignation : " + city);
        System.out.println("\nName        : " + manager);
        System.out.println("=========================================");
    }
}

//For Method Overloading
class EmployeeInfo
{
    private String id;
    private String empName, designation;
    private double salary;

    void empDetails(String id, String empname, String desg, double salary) 
    {
        this.id = id;
        this.empName = empname;
        this.designation = desg;
        this.salary = salary;
    }

    void empDetails(String id, String empname, String desg)
    {
        empDetails(id, empname, desg, 0.00);
        System.out.println("3 Params Employee Details:");
    }
    
    void empDetails(String id, String empname)
    {
        empDetails(id, empname, "Salesman", 10000.00);
        System.out.println("2 Params Employee Details:");
    }

    void display()
    {
        System.out.println("\nID          : " + id);
        System.out.println("\nName        : " +  empName);
        System.out.println("\nDesignation : " +  designation);
        System.out.println("\nSalary      : " +  salary);
        System.out.println("=========================================");
    }
}