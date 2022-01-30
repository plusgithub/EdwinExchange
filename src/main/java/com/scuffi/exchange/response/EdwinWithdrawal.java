package com.scuffi.exchange.response;

import com.scuffi.exchange.trades.status.TradeStatus;

public class EdwinWithdrawal {

	private final String coin;
	private final String address;
	private final String network;
	private final Double amount;
	private final Integer time;
	private TradeStatus status;

	public EdwinWithdrawal(String coin, String address, String network, Double amount, Integer time, TradeStatus status) {
		this.coin = coin;
		this.address = address;
		this.network = network;
		this.amount = amount;
		this.time = time;
		this.status = status;
	}

	public String getCoin() { return coin; }
	public String getAddress() { return address; }
	public String getNetwork() { return network; }
	public double getAmount() { return amount; }
	public int getTime() { return time; }
	public TradeStatus getStatus() { return status; }
	public void setStatus(TradeStatus status) { this.status = status; }
}
