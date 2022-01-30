package com.scuffi.exchange.trades.subset.limit;

import com.scuffi.exchange.trades.EdwinTrade;

import java.util.Map;

public class LimitTrade extends EdwinTrade {


	private final Double limitPrice;

	public LimitTrade(Map<String, Object> params) {
		super(params);

		this.limitPrice = (Double) params.getOrDefault("limit_price", 0D);
	}

	public double getAtPrice() { return this.limitPrice; }
}
