package com.bytebybyte.mapquest.directions.service.request;

import java.util.Map;

import com.bytebybyte.mapquest.directions.service.IRouteRequest;

public class RouteRequest implements IRouteRequest {

	protected Map<String, String> parameters;

	protected RouteRequest() {
	}

	public RouteRequest(Map<String, String> parameters) {
		this.parameters = parameters;
	}

	@Override
	public Map<String, String> getParameters() {
		return parameters;
	}
}
