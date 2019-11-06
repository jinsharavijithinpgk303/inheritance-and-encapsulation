package encapsulation;

public class Customer {
	String name;
	String address;
	String contactNumber ;
	String email;
	String proofType;
	String proofID;
	

	public boolean setName(String name)
	    {
	        if (name.matches("^[A-Z a-z]*$"))
	        {
	            this.name=name;
	            return true;
	        }
	        else
	        {
	            
	            return false;
	        }
	    }
	    public String getName()
	    {
	        return this.name;
	    }




	//public void setName(String name) {
	// this.name = name;

	public String getAddress() {
	return address;
	}

	public boolean setAddress(String address)
	    {
	        if (address.matches("^[0-9 A-Z a-z -]*$"))
	        {
	            this.address=address;
	            return true;
	        }
	        else
	        {
	           
	            return false;
	        }
	    }
	   



	//public void setAddress(String address) {
	//this.address = address;

	public String getContactNumber() {
	return contactNumber;
	}

	public boolean setContactNumber(String contactNumber)
	    {
	        if (contactNumber.matches("^[0-9]*$"))
	        {
	            this.contactNumber=contactNumber;
	            return true;
	        }
	        else
	        {
	            
	            return false;
	        }
	    }
	    public String getcontactNumber()
	    {
	        return this.contactNumber;
	    }



	//public void setContactNumber(String contactNumber) {
	// this.contactNumber = contactNumber;

	public String getEmail() {
	return email;
	}
	//public void setEmail(String email) {
	//this.email = email;

	public boolean setEmail(String email)
	        {
	            if (email.contains("@"))
	            {
	                this.email=email;
	                return true;
	            }
	            else
	            {
	                
	                return false;
	            }
	        }
	       


	public String getProofType() {
	return proofType;
	}

	public boolean setProofType(String prooftype)
	    {
	        if (prooftype.matches("^[A-Z a-z]*$"))
	        {
	            this.proofType=prooftype;
	            return true;
	        }
	        else
	        {
	            
	            return false;
	        }
	    }
	    public String ProofType()
	    {
	        return this.proofType;
	    }


	//public void setProofType(String proofType) {
	//this.proofType = proofType;
	//}
	public String getProofID() {
	return proofID;
	}





	public boolean setProofID(String proofID)
	    {
	        if (proofID.matches("^[0-9 A-Z a-z]*$"))
	        {
	            this.proofID=proofID;
	            return true;
	        }
	        else
	        {
	            
	            return false;
	        }
	    }
	    public String getproofID()
	    {
	        return this.proofID;
	    }



	//public void setProofID(String proofID) {
	// this.proofID = proofID;
	//}
	    
	    
	    
	    public void view(String name,String address,String contactNumber,String email,String proofType,String proofId) {
			
	      	System.out.println("Name: "+name);
	     	System.out.println("Address: "+address);
	      	System.out.println("contactNumber: "+contactNumber);
	      	System.out.println("email: "+email);
	      	System.out.println("proofType: "+proofType);
	      	System.out.println("proofId: "+proofId);
	      	System.out.println("Thank you for registering. Your id is 1..");
	    }

	    	public void check(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
	    		if(!a ||!b ||!c|| !d||!e|| !f)
	    		{
	    			if(!a)
	    			{
	    				System.out.println("Invalid name");
	    			}
	    			if(!b)
	    			{
	    				System.out.println("Invalid address");
	    			}
	    			if(!c)
	    			{
	    				System.out.println("Invalid contact Number");
	    			}
	    			if(!d)
	    			{
	    				System.out.println("Invalid email");
	    			}
	    			if(!e)
	    			{
	    				System.out.println("Invalid proof type");
	    			}
	    			if(!f) 
	    			{
	    				System.out.println("Invalid proof id");
	    			}
	    			System.out.println("Registration Failed");
	    		}
	    		else
	    		{
	    			System.out.println("Registration Successfull");
	    			if(a && b && c && d && e && f)
	    			{
	    				view(getName(),getAddress(),getcontactNumber(),getEmail(),getProofType(),getProofID());
	    				
	    			}
	    		}
	    		
	    	}

	}

