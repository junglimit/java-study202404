package day07.encap.practice;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    private int balance;

    BankAccount(String accountNumber,String accountName ,int balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }




    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int plusMoney) {
        if(plusMoney < 0) {
            System.out.println("0원 이상의 값을 입금 해주세요.");
            return;
        } else {
            balance += plusMoney;
        }
    }

    public void withdraw(int minusMoney) {
        if(minusMoney > balance || minusMoney > 0){
            System.out.println("출금하려는 금액이 현재 잔액보다 큽니다.");
            return;
        } else {
            balance -= minusMoney;
        }
    }
}
