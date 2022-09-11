public class LimitException extends Exception{
    Double remainingAmount;

    public LimitException(String message,Double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public LimitException(String message) {

    }

    public Double getRemainingAmount() { return remainingAmount; }
}
