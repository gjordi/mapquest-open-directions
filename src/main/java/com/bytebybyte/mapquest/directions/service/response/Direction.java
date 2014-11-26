package com.bytebybyte.mapquest.directions.service.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Direction {

	NONE(0), NORTH(1), NORTHWEST(2), NORTHEAST(3), SOUTH(4), SOUTHEAST(5), SOUTHWEST(6), WEST(7), EAST(8);

	private int direction;

	private Direction(int direction) {
		this.direction = direction;
	}

	@JsonValue
	public int getDirection() {
		return direction;
	}

	@JsonCreator
	public static Direction newInstance(Integer direction) {
		if (direction == null)
			return Direction.NONE;
		switch (direction.intValue()) {
		case 1:
			return Direction.NORTH;
		case 2:
			return Direction.NORTHWEST;
		case 3:
			return Direction.NORTHEAST;
		case 4:
			return Direction.SOUTH;
		case 5:
			return Direction.SOUTHEAST;
		case 6:
			return Direction.SOUTHWEST;
		case 7:
			return Direction.WEST;
		case 8:
			return Direction.EAST;
		default:
			return Direction.NONE;
		}
	}
}
