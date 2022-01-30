package com.scuffi.exchange;

import com.scuffi.exchange.response.types.connection.PingResponse;
import com.scuffi.exchange.response.types.connection.ServerTimeResponse;
import com.scuffi.exchange.response.types.wallet.*;
import com.scuffi.exchange.response.types.trading.QueryOpenOrdersResponse;
import com.scuffi.exchange.response.types.trading.QueryOrderResponse;
import com.scuffi.exchange.response.types.trading.QueryTradesResponse;

public abstract class Exchange {

    public String APIKey;
    public String APISecret;
    public String exchangeName;

    public Exchange(String exchangeName) {
        this.APISecret = null;
        this.APIKey = null;
        this.exchangeName = exchangeName;
    }

    //TODO: Look at fast withdraw switch on binance

    /**
     * Set the API key, used for connection and queries
     * @param key The api key as a string
     */
    public void setKey(String key) {
        this.APIKey = key;
    }

    /**
     * Set the API secret, used for connection and queries
     * @param secret The secret as a string
     */
    public void setSecret(String secret) {
        this.APISecret = secret;
    }

    /**
     * Gets the API key that has been declared
     * @return String API key
     */
    public String getKey() {
        return APIKey;
    }

    /**
     * Gets the API secret that has been declared
     * @return String API secret
     */
    public String getSecret() {
        return APISecret;
    }

    /**
     * Check if this instance has a key associated with it
     * @return boolean if class has key
     */
    public boolean hasKey() {
        return APIKey != null;
    }

    /**
     * Check if this instance has a secret associated with it
     * @return boolean if class has secret
     */
    public boolean hasSecret() {
        return APIKey != null;
    }

    /**
     * Ping the exchange API server and return if connected correctly
     * @return Boolean value if server is responding
     */
    public abstract PingResponse ping();

    /**
     * Get the time on the exchange connected server
     * @return Long of the server time
     */
    public abstract ServerTimeResponse getServerTime();

    /**
     * Get the account balance of a specific coin/token
     * @param coin The abbreviation of a coin/token name
     * @return The balance in USD
     */
    public abstract CoinBalanceResponse getCoinBalance(String coin);

    /**
     * Get the total balance of the account affiliated with this exchange link
     * @return The balance in USD
     */
    public abstract AccountBalanceResponse getAccountBalance();

    /**
     * Get all the balances of owned currencies on a users account
     * @return A map dictating coin>price, coin>price, etc
     */
    public abstract BalancesResponse getBalances();

    /**
     * Get the buy and sell fees for this account
     * @return A fee response object
     */
    public abstract FeeResponse getFees();


    /**
     * List of trades from currency from this user to this exchange
     * @param coin The coin to lookup trades for
     * @return QueryTrades object containing a list of EdwinTrades
     */
    public abstract QueryTradesResponse getTrades(String coin);

    /**
     * Get list of all trades this user has to this exchange
     * @return QueryTrades object containing a list of EdwinTrades
     */
    public abstract QueryTradesResponse getTrades();

    /**
     * Place a market order, buy immediately, cannot verify price of purchase will be the same at confirmation time
     * @param coin The coin abbreviation, e.g. BTC
     * @param amount The amount of the coin to purchase
     */
    public abstract void placeMarketOrder(String coin, Double amount);

    /**
     * Place a limit order, will only purchase when atPrice is equal or higher than current price
     * @param coin The coin abbreviation, e.g. BTC
     * @param amount The amount of the coin to purchase
     * @param atPrice The price point the order should purchase at
     */
    public abstract void placeLimitOrder(String coin, Double amount, Double atPrice);

    /**
     * Get the current unfulfilled/open orders for this exchange
     * @return List of open trades
     */
    public abstract QueryOpenOrdersResponse getOpenOrders();

    /**
     * Get the status of an order
     * @param coin The ordered coin
     * @param orderId The id of the order
     * @return An EdwinOrder
     */
    public abstract QueryOrderResponse getOrderStatus(String coin, Integer orderId);

    /**
     * Withdraw currencies to a wallet
     * @param coin The coin to withdraw
     * @param wallet The wallet to withdraw to
     * @param amount The amount of the currency to withdraw
     */
    public abstract void withdraw(String coin, String wallet, Double amount);

    /**
     * Get the address to deposit currencies into
     * @param coin The coin whose address we're looking for
     * @return The address
     */
    public abstract DepositAddressResponse getDepositAddress(String coin);

    /**
     * Get history of withdrawals on this account
     * @return List of trades
     */
    public abstract WithdrawHistoryResponse getWithdrawHistory();

    /**
     * Get history of withdrawals on this account for a specific coin
     * @param coin The coin we're looking up
     * @return List of trades
     */
    public abstract WithdrawHistoryResponse getWithdrawHistory(String coin);

    /**
     * Get history of deposits made onto this account
     * @return List of trades
     */
    public abstract DepositHistoryResponse getDepositHistory();

    /**
     * Get history of deposits made onto this account for a specific coin
     * @param coin The coin we're looking up
     * @return List of trades
     */
    public abstract DepositHistoryResponse getDepositHistory(String coin);
}
