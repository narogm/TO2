package pl.edu.agh.iisg.to.javafx.cw3.command;

import pl.edu.agh.iisg.to.javafx.cw3.model.Account;
import pl.edu.agh.iisg.to.javafx.cw3.model.Transaction;

public class RemoveTransactionCommand implements Command {

    private Transaction transactionToRemove;
    private Account account;

    public RemoveTransactionCommand(Transaction transactionToAdd, Account account) {
        this.transactionToRemove = transactionToAdd;
        this.account = account;
    }


    @Override
    public void execute() {
        account.removeTransaction(transactionToRemove);
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }

    @Override
    public String getName() {
        return "Removed transaction: " + transactionToRemove.toString();
    }
}
