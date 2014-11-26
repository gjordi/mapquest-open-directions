package com.bytebybyte.mapquest.directions.service.standard;

import java.net.URI;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.bytebybyte.mapquest.directions.service.IDirectionsService;
import com.bytebybyte.mapquest.directions.service.IRouteRequest;
import com.bytebybyte.mapquest.directions.service.IRouteResponse;
import com.bytebybyte.mapquest.directions.service.response.RouteResponse;

public class StandardDirectionsService implements IDirectionsService {

	protected static final Logger logger = LoggerFactory.getLogger(StandardDirectionsService.class);

	protected static final String ROUTE_URL = "http://open.mapquestapi.com/directions/v2/route";

	protected RestTemplate restTemplate;

	public StandardDirectionsService() {
		this(new RestTemplate());
	}

	public StandardDirectionsService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public IRouteResponse route(IRouteRequest request) {

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(ROUTE_URL);

		for (Map.Entry<String, String> entry : request.getParameters().entrySet())
			builder.queryParam(entry.getKey(), entry.getValue());

		URI uri = builder.build().toUri();

		return restTemplate.getForObject(uri, RouteResponse.class);
	}

}
