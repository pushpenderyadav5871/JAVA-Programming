import java.util.Scanner;
public class double ATMinterfacetask {
    private double balance;
    public BankAccount(double initialBalance){
        balance=initialBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance -=amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    }
    class ATM{
        private BankAccount bankaccount;
        public ATM(BankAccount account){
            bankaccount=account;
        }
        public void displayOptions(){
            System.out.println("Welcome to my Task ATM Interface ");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");        
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
    }
        public void performOption(int option){
            switch(option){
                case 1:
                withdraw();
                break;
                case 2:
                deposit();
                break;
                case 3:
                checkBalance();
                break;
                case 4:
                System.out.println("Thank you for using the ATM.");
                System.exit(0);
                break;
                default:
                System.out.println("Invalid option");
            }
        }
        private void withdraw() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount to withdraw:");
            double amount = sc.nextDouble();
            if(amount>0){
                if(amount <= bankaccount.getBalance()) {
                    bankaccount.withdraw(amount);
                    System.out.println("Withdrawlsuccessful");
                }
                else{
                    System.out.println("Insufficient Balance");
                }
            }
            else{
                System.out.println("Invalid amount");
            }
        }
        public void deposit(){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the amount you want to deposit :");
            double amount=sc.nextDouble();
            if(amount>0){
                bankaccount.deposit(amount);
                System.out.println("Deposit Successful");
            }
            else{
                System.out.println("Invalid amount");
            }
        }
        public void checkBalance(){
            System.out.println("Current Balance :" + bankaccount.getBalance());
        }
    }
        public class  ATMinter{
            public static void main(String[] args){
                BankAccount bankaccount = new BankAccount(3100.0);
                ATM atm = new ATM(bankaccount);
                Scanner sc = new Scanner(System.in);

                while(true){
                    atm.displayOptions();
                    System.out.println("Enter your choice:");
                    int option=sc.nextInt();
                    atm.performOption(option);

                }
            }
        }