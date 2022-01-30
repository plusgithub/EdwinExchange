package com.scuffi.exchange.response;

import com.scuffi.exchange.response.types.ServerTimeResponse;

import java.lang.reflect.InvocationTargetException;
import java.net.http.HttpResponse;

public enum ResponseType {
	PING(Response.class),
	SERVER_TIME(ServerTimeResponse.class);

	private final Class<? extends Response> responseClass;

	ResponseType(Class<? extends Response> responseClass) {
		this.responseClass = responseClass;
	}

	private Response create(HttpResponse<String> httpResponse) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		return this.responseClass.getDeclaredConstructor(HttpResponse.class).newInstance(httpResponse).getClass().cast(responseClass);
	}
}
