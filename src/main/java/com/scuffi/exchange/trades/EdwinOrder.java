package com.scuffi.exchange.trades;

import java.util.Map;

/**
 * Orders are attempted crypto trades, whether this means a trade that has not been filled or an order that is being processed.
 */
public class EdwinOrder {

	private Double price;
	private Double qty;
	private Double time;
	private String symbol;
	private TradeType type;
	private final double orderId; // Maybe change this to a string as different exchanges could handle orderId differently
	private boolean filled;

	public EdwinOrder(Map<String, Object> parameters) {
		this.price = (Double) parameters.get("price");
		this.qty = (Double) parameters.get("quantity");
		this.time = (Double) parameters.get("time");
		this.symbol = (String) parameters.get("symbol");
		this.type = TradeType.valueOf((String) parameters.get("trade_type"));
		this.orderId = (Double) parameters.get("orderid");
		this.filled = (boolean) parameters.get("filled");
	}

	public String getSymbol() { return this.symbol; }
	public double getQuantity() { return qty; }
	public double getTradeTime() { return time; }
	public double getPriceThen() { return price; }
	public TradeType getTradeType() { return this.type; }
	public double getOrderId() { return this.orderId; }
}
