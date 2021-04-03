package UserDefinedException;

public class BankDemo {
    public static void main(String args[]) {
        CheckingAccount account=new CheckingAccount(123);
        System.out.println("Depositing Rs 500");
        account.deposit(500);


        try {
            account.withdraw(100);

            account.withdraw(600);
        }
        catch (InsufficientFundsException e)
        {
            System.out.println("Sorry but you are short $"+account.getBalance());
            e.printStackTrace();
        }

    }
}
