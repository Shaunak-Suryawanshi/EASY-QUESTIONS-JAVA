//ENCAPSULATION

public  class BankAccount{

    private double balance;

    //constructor

    public BankAccount(double initialBalance){
        if(initialBalance >= 0){
            this.balance = initialBalance;
        }
        else{
            this.balance = 0;
        }
    }

    public void deposit(double amount){

        if(amount > 0){
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        }

        else{
            System.out.println("Deposit amount must be positive.");
        }
    }

    //withdrawal method

    public void withdraw(double amount){

        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdraw" + amount);
        }

        else{
            System.out.println("Invalid withdrawal amount. Current balance");
        }
    }

    //getter

    public double getBalance(){
        return balance;
    }



     public static void main(String[] args) {
        
        BankAccount account = new BankAccount(1000);
        System.out.println("Initial balance: " + account.getBalance());

        account.deposit(500);
        account.withdraw(200);
        account.withdraw(1500); // Invalid withdrawal

        System.out.println("Final balance: " + account.getBalance());
    }

}


