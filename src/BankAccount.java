public class BankAccount {
  Double amount;

    public BankAccount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }
     public void deposit(Double sum) {
         amount = amount+sum;
         System.out.println("На счету: " + amount);


     }

    public void withDraw(Double sum) throws LimitException {

     if ( sum > amount ){

             throw new LimitException("Сумма на снятие больше чем остаток денег:( " , amount);
     }else {
         amount=  amount - sum;
         System.out.println("Сумма снятия: " + sum);
         System.out.println("Остаток на счету: " + amount);
     }

    }
}
