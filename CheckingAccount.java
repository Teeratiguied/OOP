public class CheckingAccount extends Account{
    private double credit;
    
    public CheckingAccount(){
        super(0, "");
        this.credit = 0;
    }
    public  CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public double getCredit(){
        return credit;
    }
    public void setCredit(double credit){
        if (credit > 0){
            this.credit = credit;
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    @Override
    public String toString(){
        return "The "+this.name+" account has "+this.balance+" baht and "+this.credit+" credits.";    
    }
    @Override
    public void withdraw(double a) {
        if (a > 0) {
            if (this.balance - a >= 0) {
                this.balance -= a;
                System.out.println(a + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
            } else if (this.balance + this.credit - a >= 0) {
                double remainingCredit = this.credit - (a - this.balance);
                this.balance = 0;
                this.credit = remainingCredit;
                System.out.println(a + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
            } else {
                System.out.println("Not enough money!");
            }
        }
    }

    public void withdraw(String a) {
        double amount = Double.parseDouble(a);
        withdraw(amount);
    }
}
