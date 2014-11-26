package com.bytebybyte.mapquest.directions.service.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Options {

	protected Double[] arteryWeights;
	protected Boolean avoidTimedConditions;
	protected Integer[] avoidTripIds;
	protected Boolean countryBoundaryDisplay;
	protected Integer cyclingRoadFactor;
	protected Boolean destinationManeuverDisplay;
	protected Integer drivingStyle;
	protected Boolean enhancedNarrative;
	protected Integer filterZoneFactor;
	protected Integer generalize;
	protected Integer highwayEfficiency;
	protected String locale;
	protected Integer maneuverPenalty;
	protected Boolean manmaps;
	protected Integer maxLinkId;
	protected Integer maxWalkingDistance;
	protected Integer[] mustAvoidLinkIds;
	protected String narrativeType;
	protected Boolean returnLinkDirections;
	protected Integer routeNumber;
	protected String routeType;
	protected String shapeFormat;
	protected Boolean sideOfStreetDisplay;
	protected Boolean stateBoundaryDisplay;
	protected Integer timeType;
	protected Integer transferPenalty;
	protected Integer[] tryAvoidLinkIds;
	protected String unit;
	protected Integer urbanAvoidFactor;
	protected Boolean useTraffic;
	protected Integer walkingSpeed;

	public Options() {
	}

	public Double[] getArteryWeights() {
		return arteryWeights;
	}

	public void setArteryWeights(Double[] arteryWeights) {
		this.arteryWeights = arteryWeights;
	}

	public Boolean getAvoidTimedConditions() {
		return avoidTimedConditions;
	}

	public void setAvoidTimedConditions(Boolean avoidTimedConditions) {
		this.avoidTimedConditions = avoidTimedConditions;
	}

	public Integer[] getAvoidTripIds() {
		return avoidTripIds;
	}

	public void setAvoidTripIds(Integer[] avoidTripIds) {
		this.avoidTripIds = avoidTripIds;
	}

	public Boolean getCountryBoundaryDisplay() {
		return countryBoundaryDisplay;
	}

	public void setCountryBoundaryDisplay(Boolean countryBoundaryDisplay) {
		this.countryBoundaryDisplay = countryBoundaryDisplay;
	}

	public Integer getCyclingRoadFactor() {
		return cyclingRoadFactor;
	}

	public void setCyclingRoadFactor(Integer cyclingRoadFactor) {
		this.cyclingRoadFactor = cyclingRoadFactor;
	}

	public Boolean getDestinationManeuverDisplay() {
		return destinationManeuverDisplay;
	}

	public void setDestinationManeuverDisplay(Boolean destinationManeuverDisplay) {
		this.destinationManeuverDisplay = destinationManeuverDisplay;
	}

	public Integer getDrivingStyle() {
		return drivingStyle;
	}

	public void setDrivingStyle(Integer drivingStyle) {
		this.drivingStyle = drivingStyle;
	}

	public Boolean getEnhancedNarrative() {
		return enhancedNarrative;
	}

	public void setEnhancedNarrative(Boolean enhancedNarrative) {
		this.enhancedNarrative = enhancedNarrative;
	}

	public Integer getFilterZoneFactor() {
		return filterZoneFactor;
	}

	public void setFilterZoneFactor(Integer filterZoneFactor) {
		this.filterZoneFactor = filterZoneFactor;
	}

	public Integer getGeneralize() {
		return generalize;
	}

	public void setGeneralize(Integer generalize) {
		this.generalize = generalize;
	}

	public Integer getHighwayEfficiency() {
		return highwayEfficiency;
	}

	public void setHighwayEfficiency(Integer highwayEfficiency) {
		this.highwayEfficiency = highwayEfficiency;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public Integer getManeuverPenalty() {
		return maneuverPenalty;
	}

	public void setManeuverPenalty(Integer maneuverPenalty) {
		this.maneuverPenalty = maneuverPenalty;
	}

	public Boolean getManmaps() {
		return manmaps;
	}

	public void setManmaps(Boolean manmaps) {
		this.manmaps = manmaps;
	}

	public Integer getMaxLinkId() {
		return maxLinkId;
	}

	public void setMaxLinkId(Integer maxLinkId) {
		this.maxLinkId = maxLinkId;
	}

	public Integer getMaxWalkingDistance() {
		return maxWalkingDistance;
	}

	public void setMaxWalkingDistance(Integer maxWalkingDistance) {
		this.maxWalkingDistance = maxWalkingDistance;
	}

	public Integer[] getMustAvoidLinkIds() {
		return mustAvoidLinkIds;
	}

	public void setMustAvoidLinkIds(Integer[] mustAvoidLinkIds) {
		this.mustAvoidLinkIds = mustAvoidLinkIds;
	}

	public String getNarrativeType() {
		return narrativeType;
	}

	public void setNarrativeType(String narrativeType) {
		this.narrativeType = narrativeType;
	}

	public Boolean getReturnLinkDirections() {
		return returnLinkDirections;
	}

	public void setReturnLinkDirections(Boolean returnLinkDirections) {
		this.returnLinkDirections = returnLinkDirections;
	}

	public Integer getRouteNumber() {
		return routeNumber;
	}

	public void setRouteNumber(Integer routeNumber) {
		this.routeNumber = routeNumber;
	}

	public String getRouteType() {
		return routeType;
	}

	public void setRouteType(String routeType) {
		this.routeType = routeType;
	}

	public String getShapeFormat() {
		return shapeFormat;
	}

	public void setShapeFormat(String shapeFormat) {
		this.shapeFormat = shapeFormat;
	}

	public Boolean getSideOfStreetDisplay() {
		return sideOfStreetDisplay;
	}

	public void setSideOfStreetDisplay(Boolean sideOfStreetDisplay) {
		this.sideOfStreetDisplay = sideOfStreetDisplay;
	}

	public Boolean getStateBoundaryDisplay() {
		return stateBoundaryDisplay;
	}

	public void setStateBoundaryDisplay(Boolean stateBoundaryDisplay) {
		this.stateBoundaryDisplay = stateBoundaryDisplay;
	}

	public Integer getTimeType() {
		return timeType;
	}

	public void setTimeType(Integer timeType) {
		this.timeType = timeType;
	}

	public Integer getTransferPenalty() {
		return transferPenalty;
	}

	public void setTransferPenalty(Integer transferPenalty) {
		this.transferPenalty = transferPenalty;
	}

	public Integer[] getTryAvoidLinkIds() {
		return tryAvoidLinkIds;
	}

	public void setTryAvoidLinkIds(Integer[] tryAvoidLinkIds) {
		this.tryAvoidLinkIds = tryAvoidLinkIds;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Integer getUrbanAvoidFactor() {
		return urbanAvoidFactor;
	}

	public void setUrbanAvoidFactor(Integer urbanAvoidFactor) {
		this.urbanAvoidFactor = urbanAvoidFactor;
	}

	public Boolean getUseTraffic() {
		return useTraffic;
	}

	public void setUseTraffic(Boolean useTraffic) {
		this.useTraffic = useTraffic;
	}

	public Integer getWalkingSpeed() {
		return walkingSpeed;
	}

	public void setWalkingSpeed(Integer walkingSpeed) {
		this.walkingSpeed = walkingSpeed;
	}

}
