public class AccountController2 {

    private BankReader reader; // input-view
    private BankWriter primary_writer; // output-view
    private BankWriter secondary_writer;
    private BankAccount primary_account; //model
    private BankAccount secondary_account;
    private BankAccount account; // remembers active account
    private BankWriter writer; // remembers active account

    public AccountController2(BankReader reader, BankWriter primary_writer, BankAccount primary_account, BankWriter secondary_writer, BankAccount secondary_account) {
    }


    /* AccountController 객체 초기
     * @param r - input-view 객체
     * @param w - output-view 객체
     * @param a - model 객체 */
    public void AccountController(BankReader r, BankWriter w1, BankAccount a1,
                                  BankWriter w2, BankAccount a2) {
        reader = r;
        primary_writer = w1;
        secondary_writer = w2;
        primary_account = a1;
        secondary_account = a2;
        // 기본은 주계좌
        account = primary_account;
        writer = primary_writer;
    }
    /* resetAccount - 계좌 변경
     * @param new_account - 변경할 계좌
     * @param new_writer - 변결할 출력기*/
    private void resetAccount(BankAccount new_account, BankWriter new_writer) {
        writer.showTransaction("비활성");
        account = new_account;
        writer = new_writer;
        writer.showTransaction("활성");
    }

    /* processTransactions - Q 요청을 할 때까지 고객의 요청을 처리 */
    public void processTransactions() {
        char command = reader.readCommand("#1 P, #2 S, 입금 D금액, 출금 W금액, 송금 >금액, 받기 <금액 종료 Q);");
        if (command == 'Q') {
            writer.showTransaction("서비스를 마칩니다.");
            return;
        }
        else if (command == 'D') {
            int amount = reader.readAmount();
            if (account.deposit(amount))
                writer.showTransaction(amount, "입금");
            else
                writer.showTransaction("입금 실패");
        }
        else if (command == 'W') {
            int amount = reader.readAmount();
            if (account.withdraw(amount))
                writer.showTransaction(amount, "출금");
            else
                writer.showTransaction("출금 실패");
        }
        else if (command == 'P')
            resetAccount(primary_account, primary_writer);
        else if (command == 'S')
            resetAccount(secondary_account, secondary_writer);
        else
            writer.showTransaction("요청 오류");
        this.processTransactions();
    }
}

