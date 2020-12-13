package pavelkim.homework11;

public class NotEnoughMoneyException extends RuntimeException {

    public NotEnoughMoneyException(String detail){
        System.out.println(detail);
    }
}
