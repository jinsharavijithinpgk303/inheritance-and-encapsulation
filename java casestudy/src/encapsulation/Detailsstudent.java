package encapsulation;
import java.util.Scanner;
public class Detailsstudent {

	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     student1 st = new student1();
     System.out.println("Enter the name");
     st.setName(s.next());
     System.out.println("Enter the id");
     st.setId(s.next());
     System.out.println("Name: "+st.getName());
     System.out.println("Id: "+st.getId());
     
     
	}

}
