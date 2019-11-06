package encapsulation;
import java.util.Scanner;
public class Detailcasestudy {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Guest st = new Guest();
    Display d = new Display();
    System.out.println("Registration");
    System.out.println("Enter your name");
    st.setName(s.next());
    System.out.println("Enter your address");
    st.setAddress(s.next());
    System.out.println("Contact Number");
    st.setContactNumber(s.next());
    System.out.println("E-Mail ID");
    st.setEmail(s.next());
  
    System.out.println("Enter proof type");
    st.setProofType(s.next());
    System.out.println("Enter proof id");
    
    st.setProofId(s.next());
    d.display(st.getName(),st.getAddress(),st.getContactNumber(),st.getEmail(),st.getProofType(),st.getProofId());
    //st.display();
    
	}

}
