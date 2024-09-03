import java.util.Scanner;

public class email {
	private String firstName;
	private String lastName;
	private String department;
	private int passwordLength = 8;
	private String password;
	private String email;
	private String companySuffix = "anycompany.com";
	private int mailboxCapacity = 500 ;
	private String altEmail = "xyz@email.com";
	
		//Constructor to receive first and last name
	public email ( String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	    
	    //Call a method to return a department
	    this.department = setDepartment();
		 
		//call a method to return the generated random password
		this.password = randomPassword(passwordLength);
		
		//combine elements  to generate the Email id
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()
		+"@"+department+"."+companySuffix;
						
			
	}
	
	//ask for a department
	private String setDepartment(){
		System.out.println("Department codes \n1 for sales \n2 for development \n3 for accountant \n0 for none \n Enter your code:");
	    Scanner scan = new Scanner(System.in);
	    int code = scan.nextInt();
	    
	    if (code==1) {return "sales";}
	    else if (code==2) {return "Dev";}
	    else if (code==3) {return "Acc";}
	    else {return "";}

	}
	
	//generate a random password 
	private String randomPassword(int length) {
		String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
		char [] password = new char[length];
		for (int i=0; i<length; i++) {
			int random = (int)(Math.random() * passwordset.length());
			password[i] = passwordset.charAt(random);
		}
            return new String(password)	;	
	}
	
	//setting mailbox capacity
	public void setMailboxCapacity (int capacity) {
		this.mailboxCapacity = capacity;
	}
	public int getMailboxCapacity() {return mailboxCapacity;}
	 
	//Alternate email id 
	public void setAlternateEmail (String altEmail) {
		this.altEmail = altEmail;
	}
	public String getAlternateEmail() {return altEmail;}
	
	//create a function to access all the information
	 public String showInfo() {
		 return "DISPLAY NAME : "+this.firstName +" "+ this.lastName +"\n" +
				 " The department is  "+this.department + "\n"+
				 " Your password is " +this.password+ "\n"+
				 " Your email id is generated : " + email +"\n"+
				 " The mail box capacity is "+ getMailboxCapacity() +"mb \n"+
				 " Alternat email id :"+ getAlternateEmail();
	 }
		
	
}