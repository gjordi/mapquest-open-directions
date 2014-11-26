package com.bytebybyte.mapquest.directions.service.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BestFit {

	protected Integer width;
	protected Integer height;
	protected Integer scale;
	protected Integer newScale;
	protected LatLng newCenter;
	protected Integer margin;
	protected Integer newLevel;

	public BestFit() {
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getScale() {
		return scale;
	}

	public void setScale(Integer scale) {
		this.scale = scale;
	}

	public Integer getNewScale() {
		return newScale;
	}

	public void setNewScale(Integer newScale) {
		this.newScale = newScale;
	}

	public LatLng getNewCenter() {
		return newCenter;
	}

	public void setNewCenter(LatLng newCenter) {
		this.newCenter = newCenter;
	}

	public Integer getMargin() {
		return margin;
	}

	public void setMargin(Integer margin) {
		this.margin = margin;
	}

	public Integer getNewLevel() {
		return newLevel;
	}

	public void setNewLevel(Integer newLevel) {
		this.newLevel = newLevel;
	}

}
