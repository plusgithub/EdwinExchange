package com.scuffi.exchange.response;

import com.scuffi.exchange.trades.status.TradeStatus;

/**
 * Instantiate a new EdwinDeposit for each deposit with the correct data.
 */
public class EdwinDeposit {

	private final String coin;
	private final String network;
	private final Double amount;
	private final Double time;
	private TradeStatus status;

	public EdwinDeposit(String coin, String network, Double amount, Double time, TradeStatus status) {
		this.coin = coin;
		this.network = network;
		this.amount = amount;
		this.time = time;
		this.status = status;
	}

	public String getCoin() { return coin; }
	public String getNetwork() { return network; }
	public double getAmount() { return amount; }
	public double getTime() { return time; }
	public TradeStatus getStatus() { return status; }
	public void setStatus(TradeStatus status) { this.status = status; }
}
