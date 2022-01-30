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