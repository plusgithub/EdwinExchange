package com.scuffi.exchange.request;

import com.scuffi.exchange.trades.TradeType;

public class OrderRequest {

	private String symbol;
	private double quantity;
	private Side side;
	private final TradeType type;

	public OrderRequest(String symbol, double quantity, Side side, TradeType type) {
		this.symbol = symbol;
		this.quantity = quantity;
		this.side = side;
		this.type = type;
	}

	// Setters
	public void setSymbol(String symbol) { this.symbol = symbol; }
	public void setQuantity(double quantity) { this.quantity = quantity; }
	public void setSide(Side side) { this.side = side; }
	// Getters
	public String getSymbol() { return this.symbol; }
	public double getQuantity() { return this.quantity; }
	public Side getSide() { return this.side; }
	public TradeType getType() { return this.type; }
}
