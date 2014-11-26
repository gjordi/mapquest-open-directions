package com.bytebybyte.mapquest.directions.service.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Leg {

	protected Integer index;
	protected Integer origIndex;
	protected String origNarrative;
	protected Integer destIndex;
	protected String destNarrative;

	protected Double distance;
	protected Integer time;
	protected String formattedTime;

	protected Boolean hasCountryCross;
	protected Boolean hasFerry;
	protected Boolean hasHighway;
	protected Boolean hasSeasonalClosure;
	protected Boolean hasTollRoad;
	protected Boolean hasUnpaved;

	protected Maneuver[] maneuvers;

	public Leg() {
	}

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public Integer getOrigIndex() {
		return origIndex;
	}

	public void setOrigIndex(Integer origIndex) {
		this.origIndex = origIndex;
	}

	public String getOrigNarrative() {
		return origNarrative;
	}

	public void setOrigNarrative(String origNarrative) {
		this.origNarrative = origNarrative;
	}

	public Integer getDestIndex() {
		return destIndex;
	}

	public void setDestIndex(Integer destIndex) {
		this.destIndex = destIndex;
	}

	public String getDestNarrative() {
		return destNarrative;
	}

	public void setDestNarrative(String destNarrative) {
		this.destNarrative = destNarrative;
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

	public Boolean getHasCountryCross() {
		return hasCountryCross;
	}

	public void setHasCountryCross(Boolean hasCountryCross) {
		this.hasCountryCross = hasCountryCross;
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

	public Boolean getHasTollRoad() {
		return hasTollRoad;
	}

	public void setHasTollRoad(Boolean hasTollRoad) {
		this.hasTollRoad = hasTollRoad;
	}

	public Boolean getHasUnpaved() {
		return hasUnpaved;
	}

	public void setHasUnpaved(Boolean hasUnpaved) {
		this.hasUnpaved = hasUnpaved;
	}

	public Maneuver[] getManeuvers() {
		return maneuvers;
	}

	public void setManeuvers(Maneuver[] maneuvers) {
		this.maneuvers = maneuvers;
	}

}
