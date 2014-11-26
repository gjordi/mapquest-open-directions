package com.bytebybyte.mapquest.directions.service.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Maneuver {

	protected Integer attributes;
	protected Direction direction;
	protected String directionName;
	protected Double distance;
	protected String formattedTime;
	protected String iconUrl;
	protected Integer index;
	protected Integer[] linkIds;
	protected String[] maneuverNotes;
	protected String mapUrl;
	protected String narrative;
	protected Sign[] signs;
	protected LatLng startPoint;
	protected String[] streets;
	protected Integer time;
	protected String transportMode;
	protected Integer turnType;

	public Maneuver() {
	}

	public Integer getAttributes() {
		return attributes;
	}

	public void setAttributes(Integer attributes) {
		this.attributes = attributes;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public String getDirectionName() {
		return directionName;
	}

	public void setDirectionName(String directionName) {
		this.directionName = directionName;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public String getFormattedTime() {
		return formattedTime;
	}

	public void setFormattedTime(String formattedTime) {
		this.formattedTime = formattedTime;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public Integer[] getLinkIds() {
		return linkIds;
	}

	public void setLinkIds(Integer[] linkIds) {
		this.linkIds = linkIds;
	}

	public String[] getManeuverNotes() {
		return maneuverNotes;
	}

	public void setManeuverNotes(String[] maneuverNotes) {
		this.maneuverNotes = maneuverNotes;
	}

	public String getMapUrl() {
		return mapUrl;
	}

	public void setMapUrl(String mapUrl) {
		this.mapUrl = mapUrl;
	}

	public String getNarrative() {
		return narrative;
	}

	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}

	public Sign[] getSigns() {
		return signs;
	}

	public void setSigns(Sign[] signs) {
		this.signs = signs;
	}

	public LatLng getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(LatLng startPoint) {
		this.startPoint = startPoint;
	}

	public String[] getStreets() {
		return streets;
	}

	public void setStreets(String[] streets) {
		this.streets = streets;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public String getTransportMode() {
		return transportMode;
	}

	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}

	public Integer getTurnType() {
		return turnType;
	}

	public void setTurnType(Integer turnType) {
		this.turnType = turnType;
	}

}
