package com.bytebybyte.mapquest.directions.service;

import com.bytebybyte.mapquest.directions.service.response.Info;
import com.bytebybyte.mapquest.directions.service.response.Route;

public interface IRouteResponse {

	Route getRoute();

	Info getInfo();
}
