package com.scuffi.exchange.request;

import javax.swing.*;

public class WithdrawRequest {

	private String symbol;
	private String address;
	private double amount;
	private String network;

	public WithdrawRequest(String symbol, double amount, String address) {
		this.symbol = symbol;
		this.address = address;
		this.amount = amount;
		this.network = null;
	}

	public WithdrawRequest(String symbol, double amount, String address, String network) {
		this.symbol = symbol;
		this.address = address;
		this.amount = amount;
		this.network = network;
	}

	// Getters
	public String getSymbol() { return this.symbol; }
	public String getAddress() { return this.address; }
	public double getAmount() { return this.amount; }
	public String getNetwork() { return this.network; }

	// Hassers
	public boolean hasNetwork() { return this.network != null; }

	// Setters
	public void setSymbol(String symbol) { this.symbol = symbol; }
	public void setAddress(String address) { this.address = address; }
	public void setAmount(double amount) { this.amount = amount; }
	public void setNetwork(String network) { this.network = network; }
}
