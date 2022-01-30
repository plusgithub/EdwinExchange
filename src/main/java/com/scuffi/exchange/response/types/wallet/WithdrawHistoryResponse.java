package com.scuffi.exchange.response.types.wallet;

import com.scuffi.exchange.response.EdwinWithdrawal;
import com.scuffi.exchange.response.Response;
import com.scuffi.exchange.trades.EdwinTrade;

import java.net.http.HttpResponse;
import java.util.List;

public abstract class WithdrawHistoryResponse extends Response {

	public List<EdwinWithdrawal> withdrawals;

	public WithdrawHistoryResponse(HttpResponse<String> response) {
		super(response);
	}

	public List<EdwinWithdrawal> getWithdrawals() { return withdrawals; }
}
