public class Employee {

    private String name;
    private String email;
    private int id;
    private float salary;

    public void setName(){
        name = "farjana akter papri";
    }

    public String getName(){
        return name;

    }

    public void setEmail(){

        email = "farjana@gmail.com";
    }

    public String getEmail(){
        return email;

    }

    public void setId(int s){

        id = s;
        if(id>50)
        {
            System.out.println("value of id to 0" );
        }
        else {

            System.out.println("value of id is " +id);
        }

    }

    public int getId(){

        return id;

    }

    public void setSalary(float s){

        salary = s;
    }

    public float getSalary(){

        if(salary>10000 || salary<5000)
        {
            System.out.println("It is not a good manner to ask someone's salary" );
        }
        else {

            System.out.println("Salary is " +salary);
        }
        return salary;

    }
    public static void main(String[] args) {

        Employee obj = new Employee();
        obj.setName();
        obj.setEmail();
        obj.setId(40);
        obj.setSalary(12000);
        System.out.println("The Name is " +obj.getName());
        System.out.println("The Email is " +obj.getEmail());
        System.out.println("return id is " +obj.getId());
        System.out.println("The salary is " +obj.getSalary());

    }

}
