package com.bytebybyte.mapquest.directions.service.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sign {

	protected String text;
	protected String extraText;
	protected Direction direction;
	protected Integer type;
	protected String url;

	public Sign() {
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getExtraText() {
		return extraText;
	}

	public void setExtraText(String extraText) {
		this.extraText = extraText;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
