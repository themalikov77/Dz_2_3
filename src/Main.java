import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount(0.0);
        bankAccount.deposit(20000.0);
        while (true){
            try {
                bankAccount.withDraw(6000.0);
            }catch (LimitException e){
                bankAccount.withDraw(e.getRemainingAmount());
                break;
            }
            }

        }








        }





