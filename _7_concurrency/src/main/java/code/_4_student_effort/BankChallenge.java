package code._4_student_effort;

public class BankChallenge {
    public static void main(String[] args) throws InterruptedException {
        BankAccount dadAccount = new BankAccount("Dad", 150000);
        BankAccount myAccount = new BankAccount("Me", 7000);
        System.out.println(dadAccount);
        System.out.println(myAccount);

        TransactionThread firstTransaction = new TransactionThread("fistTransaction", dadAccount, myAccount, 1000);
        TransactionThread secondTransaction = new TransactionThread("secondTransaction", dadAccount, myAccount, 500);

        firstTransaction.start();
        secondTransaction.start();

        firstTransaction.join();
        secondTransaction.join();

        System.out.println(dadAccount);
        System.out.println(myAccount);
    }

}
