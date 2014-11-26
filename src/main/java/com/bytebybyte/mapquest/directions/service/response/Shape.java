package com.bytebybyte.mapquest.directions.service.response;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonNode;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Shape {

	protected JsonNode shapePoints;
	protected Integer[] legIndexes;
	protected Integer[] maneuverIndexes;

	public Shape() {
	}

	public JsonNode getShapePoints() {
		return shapePoints;
	}

	public void setShapePoints(JsonNode shapePoints) {
		this.shapePoints = shapePoints;
	}

	public Integer[] getLegIndexes() {
		return legIndexes;
	}

	public void setLegIndexes(Integer[] legIndexes) {
		this.legIndexes = legIndexes;
	}

	public Integer[] getManeuverIndexes() {
		return maneuverIndexes;
	}

	public void setManeuverIndexes(Integer[] maneuverIndexes) {
		this.maneuverIndexes = maneuverIndexes;
	}

	public LatLng[] getPoints(ShapeFormat format) {
		if (shapePoints == null)
			return new LatLng[0];
		if (format.equals(ShapeFormat.RAW))
			return getPointsFromArray();
		if (format.equals(ShapeFormat.CMP))
			return CmpShapeDecoder.decode(shapePoints.asText(), 5);
		if (format.equals(ShapeFormat.CMP6))
			return CmpShapeDecoder.decode(shapePoints.asText(), 6);
		return new LatLng[0];
	}

	protected LatLng[] getPointsFromArray() {
		List<LatLng> latLngs = new ArrayList<LatLng>();

		Iterator<JsonNode> iterator = shapePoints.iterator();
		while (iterator.hasNext()) {
			JsonNode lat = iterator.next();
			JsonNode lng = iterator.next();

			latLngs.add(new LatLng(lat.asDouble(), lng.asDouble()));
		}

		return latLngs.toArray(new LatLng[latLngs.size()]);
	}
}
