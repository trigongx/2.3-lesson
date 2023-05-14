public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.doDeposit(20000);
        System.out.println("Сумма на счете:" + bankAccount1.getAmount());

        try{
            while (true){
                bankAccount1.withDraw(6000);
                System.out.println("Снято 6000 сом. Остаток на счете:" + bankAccount1.getAmount());
            }
        } catch (IllegalLimitException e){
            System.out.println("Снято " + e.getRemainingAmount() +
                    " сом, из-за превышения лимита.Остаток на счете:" +
                    (bankAccount1.getAmount()-e.getRemainingAmount()));
        }
    }
}
