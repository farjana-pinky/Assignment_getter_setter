import java.util.Scanner;
public class BankAccount {

    private String name;
    private String email;
    private int id;
    private String accountType;

    public void setName(String s){

        name = s;
    }

    public String getName(){

        return name;
    }

    public void setEmail(String s){

        email = s;
    }

    public String getEmail(){

        return email;
    }

    public void setId(int s){

        id = s;
        if(id<10)
        {
            id = 11;
        }
        else {

            System.out.println("value of id is " +id);
        }
    }
    public int getId(){

        return id;
    }

    public void setAccountType(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 's' or 'c' to know the account_type" );
        this.accountType = sc.nextLine();

        if (accountType.equalsIgnoreCase("s"))

        {
            this.accountType = "saving account";
        }

        else if (accountType.equalsIgnoreCase("c"))
            {

            this.accountType = "current account";
        }

    }
    public String getAccountType(){

        return this.accountType;
    }

    public static void main(String[] args) {

        BankAccount obj = new BankAccount();
        obj.setName("farjana akter papri");
        obj.setEmail("farjana@gmail.com");
        obj.setId(8);
        obj.setAccountType();
        System.out.println("The Name is " +obj.getName());
        System.out.println("The Email is " +obj.getEmail());
        System.out.println("return id is " +obj.getId());
       System.out.println(obj.getAccountType());

    }
}
