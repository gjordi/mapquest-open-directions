package com.bytebybyte.mapquest.directions.service.standard;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bytebybyte.mapquest.directions.service.IRouteResponse;
import com.bytebybyte.mapquest.directions.service.request.RouteRequest;
import com.bytebybyte.mapquest.directions.service.request.RouteRequestBuilder;
import com.bytebybyte.mapquest.directions.service.response.Copyright;
import com.bytebybyte.mapquest.directions.service.response.Info;
import com.bytebybyte.mapquest.directions.service.response.LatLng;
import com.bytebybyte.mapquest.directions.service.response.Route;
import com.bytebybyte.mapquest.directions.service.response.Shape;
import com.bytebybyte.mapquest.directions.service.response.ShapeFormat;

public class StandardDirectionsServiceTestCase {

	/**
	 * NOTE: The api key presented in the map quest api key manager is url
	 * encoded, it needs to be decoded here.
	 */
	protected static final String KEY = "Fmjtd|luur2hu1n5,2s=o5-9wawhy";

	protected Logger logger = LoggerFactory.getLogger(StandardDirectionsServiceTestCase.class);
	protected StandardDirectionsService service;

	@Before
	public void setUp() throws Exception {
		service = new StandardDirectionsService();
	}

	@Test
	public void testRoute_CalgaryAddressToCalgaryAddress() throws Exception {
		// setup
		RouteRequestBuilder builder = new RouteRequestBuilder();
		RouteRequest request = builder.key(KEY).fromLocation("423 11 Ave NE Calgary Alberta Canada")
				.toLocation("1060 Lake Christina Way SE Calgary Alberta Canada").routeTypeShortest().doReverseGeocode(false).narrativeTypeNone()
				.shapeFormatCmp6().generalize(0).build();

		// execute
		IRouteResponse response = service.route(request);

		// verify
		Assert.assertNotNull(response);
		Assert.assertNotNull(response.getRoute());
		Assert.assertNotNull(response.getInfo());

		Route route = response.getRoute();
		Assert.assertNull(route.getBestFit());
		Assert.assertNotNull(route.getBoundingBox());
		Assert.assertNull(route.getComputedWayPoints());
		Assert.assertNotNull(route.getDistance());
		Assert.assertNotNull(route.getFormattedTime());
		Assert.assertNotNull(route.getFuelUsed());
		Assert.assertNotNull(route.getHasCountryCross());
		Assert.assertNotNull(route.getHasFerry());
		Assert.assertNotNull(route.getHasHighway());
		Assert.assertNotNull(route.getHasSeasonalClosure());
		Assert.assertNotNull(route.getHasTollRoad());
		Assert.assertNotNull(route.getHasUnpaved());
		Assert.assertNotNull(route.getLegs());
		Assert.assertNotNull(route.getLocations());
		Assert.assertNotNull(route.getLocationSequence());
		Assert.assertNull(route.getMapState());
		Assert.assertNotNull(route.getOptions());
		Assert.assertNotNull(route.getRealTime());
		Assert.assertNotNull(route.getRouteError());
		Assert.assertNotNull(route.getSessionId());
		Assert.assertNotNull(route.getShape());
		Assert.assertNotNull(route.getTime());

		Info info = response.getInfo();
		Assert.assertNotNull(info.getCopyright());
		Assert.assertNotNull(info.getMessages());
		Assert.assertNotNull(info.getStatusCode());
		Assert.assertEquals(0, info.getMessages().length);
		Assert.assertEquals(new Integer(0), info.getStatusCode());

		Copyright copyright = info.getCopyright();
		Assert.assertNotNull(copyright.getText());
		Assert.assertNotNull(copyright.getImageUrl());
		Assert.assertNotNull(copyright.getImageAltText());
	}

	@Test
	public void testRoute_BostonAddressToBostonAddress() throws Exception {
		// setup
		RouteRequestBuilder builder = new RouteRequestBuilder();
		RouteRequest request = builder.key(KEY).fromLocation("400 Heath St Brookline MA 02467 USA").toLocation("125 Western Ave Allston MA 02134 USA")
				.routeTypeShortest().doReverseGeocode(false).narrativeTypeNone().shapeFormatCmp6().generalize(0).build();

		// execute
		IRouteResponse response = service.route(request);

		// verify
		Assert.assertNotNull(response);
		Assert.assertNotNull(response.getRoute());
		Assert.assertNotNull(response.getInfo());

		Route route = response.getRoute();

		Assert.assertNotNull(route.getShape());
		Shape shape = route.getShape();
		Assert.assertNotNull(shape.getPoints(ShapeFormat.CMP6));
		LatLng[] points = shape.getPoints(ShapeFormat.CMP6);
		Assert.assertEquals(218, points.length);

		Info info = response.getInfo();
		Assert.assertNotNull(info.getCopyright());
		Assert.assertNotNull(info.getMessages());
		Assert.assertNotNull(info.getStatusCode());
		Assert.assertEquals(0, info.getMessages().length);
		Assert.assertEquals(new Integer(0), info.getStatusCode());

		Copyright copyright = info.getCopyright();
		Assert.assertNotNull(copyright.getText());
		Assert.assertNotNull(copyright.getImageUrl());
		Assert.assertNotNull(copyright.getImageAltText());
	}

}
