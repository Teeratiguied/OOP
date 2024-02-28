import java.util.ArrayList;
public class Customer {
    /*private Account[] acct;
    private String firstName;
    private String lastName;
    private int numOfAccount;
    
    public Customer(){
        this("", "", null);
        acct = new Account[5];
    }
    
    public Customer(String firstName, String lastName){
        this(firstName, lastName, null);
        acct = new Account[5];
    }
    
    public Customer(String firstName, String lastName, Account acct){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = new Account[5];
        if (acct != null) {
            this.acct[0] = acct;
            this.numOfAccount = 1;
        } else {
            this.numOfAccount = 0;
        }
    }
    
    public Account getAccount(int index){
        if (index >= 0 && index < numOfAccount) {
            return acct[index];
        } else {
            System.out.println("Invalid account index.");
            return null;
        }
    }
    
    public void addAccount(Account acct){
        if (numOfAccount < 5) {
            this.acct[numOfAccount] = acct;
            numOfAccount++;
        } else {
            System.out.println("Cannot add more accounts. Customer reached maximum limit.");
        }
    }
    
    public int getNumOfAccount(){
        return numOfAccount;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
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
        if (numOfAccount == 0){
            return this.firstName+" "+this.lastName+" doesn't have account";
        }
        else{
            return "The "+this.firstName+" account has "+numOfAccount+" account(s).";
        }
    }*/
    
    // 3 //
    private ArrayList<Account> acct;
    private String firstName;
    private String lastName;

    public Customer() {
        this("", "");
        acct = new ArrayList<>();
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList<>();
    }

    public Account getAccount(int index) {
        if (index >= 0 && index < acct.size()) {
            return acct.get(index);
        } else {
            System.out.println("Invalid account index.");
            return null;
        }
    }

    public void addAccount(Account acct) {
        if (this.acct.size() < 5) {
            this.acct.add(acct);
        } else {
            System.out.println("Cannot add more accounts. Customer reached maximum limit.");
        }
    }

    public int getNumOfAccount() {
        return acct.size();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean equals(Customer c) {
        if (c == null) {
            return false;
        } else {
            return this.lastName.equals(c.getLastName()) && this.firstName.equals(c.getFirstName());
        }
    }

    @Override
    public String toString() {
        if (acct.isEmpty()) {
            return this.firstName + " " + this.lastName + " doesn't have account";
        } else {
            return "The " + this.firstName + " account has " + acct.size() + " account(s).";
        }
    }
}
