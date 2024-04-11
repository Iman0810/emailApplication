import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int defaultPasswordLength=10 ;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix= "sealanka.com";

    public Email(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;

        this.department=setDepartment();


        this.password= randomPassword(defaultPasswordLength);
        System.out.println("Password is: "+this.password);

        email =firstName.toLowerCase() +"" + lastName.toLowerCase() + "@" + department+ "." + companySuffix;




    }
    private String setDepartment(){
        System.out.print("new worker: "+ firstName + "Department Codes:\n1 for sales\n2 for Development\n3 Accounting \n4 for none\nEnter department code: ");
        Scanner sc = new Scanner(System.in);
        int depChoice =sc.nextInt();
        if(depChoice ==1){
            return "sales";
        }else if(depChoice ==2){
            return "dev";
        } else if (depChoice==3) {
            return "accounting";
        }else{
            return  "";
        }
    }
    private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPRSTUWXYZ123456789!@#$%^&*()";
        char[] password = new char[length];
        for(int i=0;i<length;i++){
           int rand = (int) (Math.random()* passwordSet.length());
            password[i]=passwordSet.charAt(rand);
            System.out.println(rand);
            System.out.println(passwordSet.charAt(rand));

        }
        return new String(password);
    }
public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
}
public void setAlternateEmail(String altEmail){
        this.alternateEmail =altEmail;
}
public void changePassword(String password){
        this.password =password;
}
public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
public String getPassword(){
        return password;
}
public String showInfo(){
        return "Display Name: "+ firstName +" "+ lastName +"\nCompany Email: "+
                email + "\nMailbox Capacity: "+ mailboxCapacity+"mb";
}
}
