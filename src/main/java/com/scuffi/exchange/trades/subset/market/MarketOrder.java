package com.scuffi.exchange.trades.subset.market;

import com.scuffi.exchange.trades.EdwinOrder;

import java.util.Map;

public class MarketOrder extends EdwinOrder {
	public MarketOrder(Map<String, Object> parameters) {
		super(parameters);
	}
}
