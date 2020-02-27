package pl.edu.agh.iisg.to.javafx.cw1.model;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Account {

	private String name;
	
	private BigInteger balance;
	
	private ObservableList<Transaction> transactions;

	public Account(String name) {
		this.name = name;
		this.balance = BigInteger.ZERO;
		this.transactions = FXCollections.observableList(new ArrayList<>());//new ArrayList<>();
	}

	public final String getName() {
		return name;
	}
	
	
	public final BigInteger getBalance() {
		return balance;
	}
	
	public final ObservableList<Transaction> getTransactions() {
		return transactions;
	}
	
	public final void addTransaction(Transaction transaction) {
		this.transactions.add(transaction);
	}
		
}
