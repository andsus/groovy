import java.util.concurrent.atomic.AtomicInteger

class BankAccount {
    private boolean _closed = false
    private AtomicInteger _balance
    // You cannot do any operations before you open the account.
    // An account opens with a balance of 0
    // You can reopen an account
    void open() {
        _balance = new AtomicInteger(0)
    }

    // you cannot do any operations after you close the account
    void close() {
        _closed = true
        _balance = 0
    }

    // this should increment the balance
    // you cannot deposit into a closed account
    // you cannot deposit a negative amount 
    void deposit(int amount) {
        if (amount < 0)
            throw new Exception("amount is negative")
        if (!_closed)
            _balance.addAndGet(amount)
    }

    // this should decrement the balance
    // you cannot withdraw into a closed account
    // you cannot withdraw a negative amount 
    void withdraw(int amount) {
        if (amount < 0 || (getBalance() - amount < 0))
            throw new Exception("amount is negative")
        if (!_closed)
            _balance.getAndUpdate {it - amount }
    }

    // returns the current balance
    int getBalance() {
        if (!_closed)
            _balance.get()
    }

}