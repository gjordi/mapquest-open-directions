package com.bytebybyte.mapquest.directions.service.response;

import com.bytebybyte.mapquest.directions.service.IRouteResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RouteResponse implements IRouteResponse {

	protected Route route;
	protected Info info;

	public RouteResponse() {
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

}
