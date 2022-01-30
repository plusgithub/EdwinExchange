package com.scuffi.exchange.trades;

import com.scuffi.exchange.trades.subset.limit.LimitOrder;
import com.scuffi.exchange.trades.subset.limit.LimitTrade;
import com.scuffi.exchange.trades.subset.market.MarketOrder;
import com.scuffi.exchange.trades.subset.market.MarketTrade;
import com.scuffi.exchange.trades.subset.stoploss.StopLimitOrder;
import com.scuffi.exchange.trades.subset.stoploss.StopLimitTrade;
import com.scuffi.exchange.trades.subset.stoploss.StopOrder;
import com.scuffi.exchange.trades.subset.stoploss.StopTrade;
import com.scuffi.exchange.trades.subset.takeprofit.TakeLimitOrder;
import com.scuffi.exchange.trades.subset.takeprofit.TakeLimitTrade;
import com.scuffi.exchange.trades.subset.takeprofit.TakeOrder;
import com.scuffi.exchange.trades.subset.takeprofit.TakeTrade;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public enum TradeType {
	MARKET(MarketTrade.class, MarketOrder.class),
	LIMIT(LimitTrade.class, LimitOrder.class),
	STOP_LOSS(StopTrade.class, StopOrder.class),
	STOP_LOSS_LIMIT(StopLimitTrade.class, StopLimitOrder.class),
	TAKE_PROFIT(TakeTrade.class, TakeOrder.class),
	TAKE_PROFIT_LIMIT(TakeLimitTrade.class, TakeLimitOrder.class);

	private final Class<? extends EdwinTrade> tradeClass;
	private final Class<? extends EdwinOrder> orderClass;

	TradeType(Class<? extends EdwinTrade> tradeClass, Class<? extends EdwinOrder> orderClass) {
		this.tradeClass = tradeClass;
		this.orderClass = orderClass;
	}

	public Class<? extends EdwinTrade> getTradeClass() {
		return this.tradeClass;
	}

	public Class<? extends EdwinOrder> getOrderClass() {
		return this.orderClass;
	}

	public EdwinTrade newTradeClass(Map<String, Object> parameters) {
		try {
			return this.tradeClass.getDeclaredConstructor(Map.class).newInstance(parameters);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public EdwinOrder newOrderClass(Map<String, Object> parameters) {
		try {
			return this.orderClass.getDeclaredConstructor(Map.class).newInstance(parameters);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
