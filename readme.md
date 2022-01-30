# How to set up a new Exchange with this library

## Responses

##### Info
All these classes are extends from response, this means you can use the inbuilt methods of getBody() and getJson()
from the response which will then need to be adapted in the custom constructors you build.

##### How to
Start by instantiating all of these response classes, these classes are abstract and will require
custom logic as per the exchange API. Please ensure that inbuilt data is set, any extra functions will 
probably not be used unless explicitly stated.

Please build all custom logic inside the constructor as this is the only method that will be called when a response
needs to be translated.

##### Classes
<ol>
    <li>PingResponse</li>
    <li>ServerTimeResponse</li>
    <li>QueryOpenOrdersResponse</li>
    <li>QueryOrderResponse</li>
    <li>QueryTradesResponse</li>
    <li>AccountBalanceResponse</li>
    <li>BalancesResponse</li>
    <li>CoinBalanceResponse</li>
    <li>DepositAddressResponse</li>
    <li>DepositHistoryResponse</li>
    <li>FeeResponse</li>
    <li>WithdrawHistoryResponse</li>
</ol>

## Exchange

##### Info
We're then going to want to actually create our exchange, for this you'll want to create YourExchange.class extend
Exchange.class. This will then allow you to implement custom logic into each request method, remember, the methods should
return the custom responses you created earlier, rather than the default ones included. This allows you to
have full control over the data sent and how it's adapted on the way back, whilst keeping all exchanges and responses
able to be formed into structured data sources.

## OrderRequest

##### Info
Order requests are used to request either a buy or sell order. This is dictated by the 'Side' enum which we can then pass
into our classes as either 'BUY' or 'SELL'. You can instantiate the correct order type, e.g. TakeOrderRequest.class for
a take profit order, and apply the needed information. This object can then be passed through into the placeOrder function
and this function in YourExchange.class should handle it depending on the type it's using. These objects are also reusable
as they only store data, so we can keep them and use them later on if we needed to trade at intervals with the exact same
information.

##### Classes
<ol>
    <li>LimitOrderRequest</li>
    <li>MarketOrderRequest</li>
    <li>StopLimitOrderRequest</li>
    <li>StopOrderRequest</li>
    <li>TakeLimitOrderRequest</li>
    <li>TakeOrderRequest</li>
</ol>