package com.bytebybyte.mapquest.directions.service.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BoundingBox {

	protected LatLng ul;
	protected LatLng lr;

	public BoundingBox() {
	}

	public LatLng getUl() {
		return ul;
	}

	public void setUl(LatLng ul) {
		this.ul = ul;
	}

	public LatLng getLr() {
		return lr;
	}

	public void setLr(LatLng lr) {
		this.lr = lr;
	}

}
