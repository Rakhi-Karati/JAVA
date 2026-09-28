class Account 
{
    int balance = 1000;

    void deposit(int amount) 
    {

        balance = balance + amount;
    }

    public static void main(String[] args) 
    {

        Account a = new Account();

        a.deposit(500);

        System.out.println("Updated Balance: " + a.balance);
    }
}