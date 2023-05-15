public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.doDeposit(20000);
        System.out.println("Сумма на счете:" + bankAccount1.getAmount());


        while (true) {
            try {
                bankAccount1.withDraw(6000);
                System.out.println("Снято 6000 сом");
            } catch (IllegalLimitException e) {
                try {
                    bankAccount1.withDraw((int) e.getRemainingAmount());
                } catch (IllegalLimitException ex) {
                    ex.printStackTrace();
                }
            }
            System.out.println(bankAccount1.getAmount());
            if (bankAccount1.getAmount() == 0) {
                break;
            }

        }
    }
}
