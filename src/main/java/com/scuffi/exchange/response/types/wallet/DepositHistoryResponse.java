package com.scuffi.exchange.response.types.wallet;

import com.scuffi.exchange.response.EdwinDeposit;
import com.scuffi.exchange.response.Response;
import com.scuffi.exchange.trades.EdwinOrder;
import com.scuffi.exchange.trades.EdwinTrade;

import java.net.http.HttpResponse;
import java.util.List;

public abstract class DepositHistoryResponse extends Response {

	public List<EdwinDeposit> deposits;

	public DepositHistoryResponse(HttpResponse<String> response) {
		super(response);
	}

	public List<EdwinDeposit> getDeposits() { return deposits; }
}
