package com.scuffi.exchange.trades.subset.limit;

import com.scuffi.exchange.trades.EdwinOrder;
import com.scuffi.exchange.trades.TradeType;

import java.util.Map;

public class LimitOrder extends EdwinOrder {

	private final Double limitPrice;

	public LimitOrder(Map<String, Object> params) {
		super(params);

		this.limitPrice = (Double) params.get("limit_price");
	}

	public double getAtPrice() { return limitPrice; }
}
