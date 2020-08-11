public class StudentClass {
    int phoneNumber;
    String firstName, lastName, email, id;

    public StudentClass(String stuID, String firstName, String lastName, String email, int phoneNumber) {
        this.id = stuID;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public static void main(String[] args) {
        StudentClass student = new StudentClass("0001", "Todd", "Hopkins", "thop@gmail.fake", 1234567890);
        StudentClass student2 = new StudentClass("0002", "Mario", "Wells", "wario@gmail.fake", 1234567891);
    }
}

class Exception_Handling{
    public static void main(String[] args) {
        try {
            int a, b;
            b = 0;
            a = 5/b;
            System.out.println("A"); //won't print as  you can't divide by zero
        } catch (ArithmeticException error){
            System.out.println("B"); //prints but with a math error
        }
    }
}
