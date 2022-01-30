package com.scuffi.exchange.trades;

import java.util.Map;

/**
 * Trades are almost like historical orders, they have already been filled and can no longer be cancelled or changed.
 */
public class EdwinTrade {

    private Double price;
    private Double qty;
    private Double time;
    private String symbol;
    private TradeType type;
    private final double orderId;

    public EdwinTrade(Map<String, Object> parameters) {
        this.symbol = (String) parameters.get("symbol");
        this.qty = (Double) parameters.get("quantity");
        this.time = (Double) parameters.get("time");
        this.price = (Double) parameters.get("price_then");
        this.type = TradeType.valueOf((String) parameters.get("trade_type"));
        this.orderId = (Double) parameters.get("orderid");
    }

    public String getSymbol() { return this.symbol; }
    public double getQuantity() { return qty; }
    public double getTradeTime() { return time; }
    public double getPriceThen() { return price; }
    public TradeType getTradeType() { return this.type; }
    public double getOrderId() { return this.orderId;}
}
