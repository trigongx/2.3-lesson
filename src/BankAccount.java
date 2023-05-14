public class BankAccount{
    private double amount;


    public double getAmount() {
        return amount;
    }

    public void doDeposit(double sum) {
        amount += sum;
    }

    public void withDraw(int sum) throws IllegalLimitException {
        if (sum > amount){
            throw new IllegalLimitException("Не хватает средств. Ваш баланс:",amount);
        }
            amount -= sum;

    }
}
