package com.bytebybyte.mapquest.directions.service.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Route {

	protected BestFit bestFit;
	protected BoundingBox boundingBox;
	protected MapState mapState;

	protected Double distance;
	protected Integer time;
	protected String formattedTime;
	protected Integer realTime;
	protected Double fuelUsed;

	protected Integer[] locationSequence;
	protected Location[] locations;

	protected Shape shape;
	protected Leg[] legs;
	protected Double[] computedWayPoints;

	protected Boolean hasTollRoad;
	protected Boolean hasFerry;
	protected Boolean hasHighway;
	protected Boolean hasSeasonalClosure;
	protected Boolean hasUnpaved;
	protected Boolean hasCountryCross;

	protected String sessionId;
	protected RouteError routeError;
	protected Options options;

	public Route() {
	}

	public BestFit getBestFit() {
		return bestFit;
	}

	public void setBestFit(BestFit bestFit) {
		this.bestFit = bestFit;
	}

	public BoundingBox getBoundingBox() {
		return boundingBox;
	}

	public void setBoundingBox(BoundingBox boundingBox) {
		this.boundingBox = boundingBox;
	}

	public MapState getMapState() {
		return mapState;
	}

	public void setMapState(MapState mapState) {
		this.mapState = mapState;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public String getFormattedTime() {
		return formattedTime;
	}

	public void setFormattedTime(String formattedTime) {
		this.formattedTime = formattedTime;
	}

	public Integer getRealTime() {
		return realTime;
	}

	public void setRealTime(Integer realTime) {
		this.realTime = realTime;
	}

	public Double getFuelUsed() {
		return fuelUsed;
	}

	public void setFuelUsed(Double fuelUsed) {
		this.fuelUsed = fuelUsed;
	}

	public Integer[] getLocationSequence() {
		return locationSequence;
	}

	public void setLocationSequence(Integer[] locationSequence) {
		this.locationSequence = locationSequence;
	}

	public Location[] getLocations() {
		return locations;
	}

	public void setLocations(Location[] locations) {
		this.locations = locations;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public Leg[] getLegs() {
		return legs;
	}

	public void setLegs(Leg[] legs) {
		this.legs = legs;
	}

	public Double[] getComputedWayPoints() {
		return computedWayPoints;
	}

	public void setComputedWayPoints(Double[] computedWayPoints) {
		this.computedWayPoints = computedWayPoints;
	}

	public Boolean getHasTollRoad() {
		return hasTollRoad;
	}

	public void setHasTollRoad(Boolean hasTollRoad) {
		this.hasTollRoad = hasTollRoad;
	}

	public Boolean getHasFerry() {
		return hasFerry;
	}

	public void setHasFerry(Boolean hasFerry) {
		this.hasFerry = hasFerry;
	}

	public Boolean getHasHighway() {
		return hasHighway;
	}

	public void setHasHighway(Boolean hasHighway) {
		this.hasHighway = hasHighway;
	}

	public Boolean getHasSeasonalClosure() {
		return hasSeasonalClosure;
	}

	public void setHasSeasonalClosure(Boolean hasSeasonalClosure) {
		this.hasSeasonalClosure = hasSeasonalClosure;
	}

	public Boolean getHasUnpaved() {
		return hasUnpaved;
	}

	public void setHasUnpaved(Boolean hasUnpaved) {
		this.hasUnpaved = hasUnpaved;
	}

	public Boolean getHasCountryCross() {
		return hasCountryCross;
	}

	public void setHasCountryCross(Boolean hasCountryCross) {
		this.hasCountryCross = hasCountryCross;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public RouteError getRouteError() {
		return routeError;
	}

	public void setRouteError(RouteError routeError) {
		this.routeError = routeError;
	}

	public Options getOptions() {
		return options;
	}

	public void setOptions(Options options) {
		this.options = options;
	}

}
