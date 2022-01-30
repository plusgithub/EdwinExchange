package com.scuffi.exchange.trades.subset.takeprofit;

import com.scuffi.exchange.trades.EdwinOrder;

import java.util.Map;

public class TakeOrder extends EdwinOrder {

	private Double takePrice;

	public TakeOrder(Map<String, Object> parameters) {
		super(parameters);

		this.takePrice = (Double) parameters.getOrDefault("take_price", 0D);
	}

	public double getTakePrice() { return this.takePrice; }
}
