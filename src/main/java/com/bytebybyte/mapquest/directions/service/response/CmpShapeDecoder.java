package com.bytebybyte.mapquest.directions.service.response;

import java.util.ArrayList;
import java.util.List;

public class CmpShapeDecoder {

	public static LatLng[] decode(String encoded, int precision) {
		List<LatLng> latLngs = new ArrayList<LatLng>();

		double p = Math.pow(10, -precision);

		int len = encoded.length(), index = 0, lat = 0, lng = 0;

		while (index < len) {
			int b = 0;
			int shift = 0;
			int result = 0;

			do {
				b = encoded.charAt(index++) - 63;
				result |= (b & 0x1f) << shift;
				shift += 5;
			} while (b >= 0x20);

			int dlat = (((result & 1) == 1) ? ~(result >> 1) : (result >> 1));
			lat += dlat;
			shift = 0;
			result = 0;
			do {
				b = encoded.charAt(index++) - 63;
				result |= (b & 0x1f) << shift;
				shift += 5;
			} while (b >= 0x20);
			int dlng = (((result & 1) == 1) ? ~(result >> 1) : (result >> 1));
			lng += dlng;

			latLngs.add(new LatLng(lat * p, lng * p));
		}

		return latLngs.toArray(new LatLng[latLngs.size()]);
	}

}
