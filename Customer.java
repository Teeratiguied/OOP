package lab11;
public class Customer {
   private CheckingAccount acct;
   private String firstName;
   private String lastName;
   
   public Customer(){
       this("", "", null);
   }
   public Customer(String firstName, String lastName){
       this(firstName, lastName, null);
   }
   public Customer(String firstName, String lastName, CheckingAccount acct){
       this.firstName = firstName;
       this.lastName = lastName;
       this.acct = acct;
       
   }
   public CheckingAccount getAcct(){
       return acct;
   }
   public String getFirstName(){
       return firstName;
   }
   public String getLastName(){
       return lastName;
   }
   public void setAcct(CheckingAccount acct){
       this.acct = acct;
   }
   public void setFirstName(String firstName){
       this.firstName = firstName;
   }
   public void setLastName(String lastName){
       this.lastName = lastName;
   }
   public boolean equals(Customer c){
       if (c == null){
           return false;
       }
       else {
           return this.lastName.equals(c.getLastName()) && this.firstName.equals(c.getFirstName());
       }
   }
   @Override
   public String toString(){
       if (acct == null){
           return this.firstName+" "+this.lastName+" doesn't have account";
       }
       else{
           return "The "+this.firstName+" account has "+acct.getBalance()+" baht and "+acct.getCredit()+" credits.";
       }
   }
}
