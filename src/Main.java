
public class Main {

    public static void main(String[] args) {
         teacher obj = new teacher();
         obj.setName("farjana");
        obj.setSubject("physices, chemistry, math, English");
        obj.setStudents(10);
        System.out.println("Name is " +obj.getName());
        System.out.println("The subject is " +obj.getSubject());
        System.out.println("number of student " +obj.getStudents());

    }
}
