package com.bytebybyte.mapquest.directions.service.request;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import com.bytebybyte.mapquest.directions.service.response.ShapeFormat;

public class RouteRequestBuilder {

	protected Map<String, String> parameters = new LinkedHashMap<String, String>();

	public RouteRequestBuilder() {
	}

	/**
	 * A unique key to authorize use of the directions service.
	 * 
	 * This parameter is required.
	 * 
	 * @param key
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder key(String key) {
		parameters.put("key", key);
		return this;
	}

	/**
	 * Use this parameter to set the strategy for resolving 
	 * ambiguous location names.
	 * 
	 * The Routing Service will simply use the first location 
	 * found for an address.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder ignoreAmbiguities() {
		parameters.put("ambiguities", "ignore");
		return this;
	}

	/**
	 * Use this parameter to set the strategy for resolving 
	 * ambiguous location names.
	 * 
	 *  The Routing Service will return a full list of the 
	 *  possible location matches in the collections attribute 
	 *  of the response.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder checkAmbiguities() {
		parameters.put("ambiguities", "check");
		return this;
	}

	/**
	 * Specifies the format of the request. 
	 * 
	 * If this parameter is  not supplied, the input format is 
	 * assumed to be JSON-formatted  text. 
	 * 
	 * The JSON-formatted input text must be supplied as either 
	 * the "json" parameter of an HTTP GET, or as the BODY 
	 * of an HTTP POST.
	 * 
	 * Note: Remember to URL-escape the text in this parameter!
	 * 
	 * @param json
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder json(String json) {
		parameters.put("inFormat", "json");
		parameters.put("json", json);
		return this;
	}

	/**
	 * Specifies the format of the request.
	 *  
	 * If this parameter is "xml", the XML-formatted input text must 
	 * be supplied as either the "xml" parameter of an HTTP GET, 
	 * or as the BODY of an HTTP POST.
	 * 
	 * Note: Remember to URL-escape the text in this parameter!
	 * 
	 * @param xml
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder xml(String xml) {
		parameters.put("inFormat", "xml");
		parameters.put("xml", xml);
		return this;
	}

	/**
	 * Specifies the format of the response. Must be one of the following, 
	 * if supplied: json, xml
	 * 
	 * Default = 'json'
	 * 
	 * @param format
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder outFormat(String format) {
		parameters.put("outFormat", format);
		return this;
	}

	/**
	 * A convenience method for setting the output format to json.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder outFormatJson() {
		return outFormat("json");
	}

	/**
	 * A convenience method for setting the output format to xml.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder outFormatXml() {
		return outFormat("xml");
	}

	/**
	 * A JavaScript function name. The JSON-formatted response will be wrapped 
	 * in a call to the supplied callback function name to provide JSONP 
	 * functionality. This functionality might be needed to do cross-site scripting. 
	 * See the Wikipedia.org entry for JSON for more details.
	 * 
	 * @param callback
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder callback(String callback) {
		parameters.put("callback", callback);
		return this;
	}

	/**
	 * When the input format is Key/Value pairs, the starting location of a Route Request. 
	 * Exactly one "from" parameter is allowed. This is used for locations only.
	 * 
	 * @param fromLocation
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder fromLocation(String from) {
		parameters.put("from", from);
		return this;
	}

	/**
	 * When the input format is Key/Value pairs, the ending location(s) of a Route Request. 
	 * More than one "to" parameter may be supplied. This is used for locations only.
	 * 
	 * @param toLocation
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder toLocation(String to) {
		parameters.put("to", to);
		return this;
	}

	/**
	 * Specifies the type of units to use when calculating distance. Acceptable values are:
	 * 
	 * m - Miles
	 * k - Kilometers
	 * 
	 * Default = 'm'
	 * 
	 * @param unit
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder unit(String unit) {
		parameters.put("unit", unit);
		return this;
	}

	/**
	 * A convenience method for setting the unit to miles.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder unitMiles() {
		return unit("m");
	}

	/**
	 * A convenience method for setting the unit to kilometers.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder unitKilometers() {
		return unit("k");
	}

	/**
	 * Specifies the type of route wanted. Acceptable values are:
	 * 
	 * fastest - Quickest drive time route.
	 * shortest - Shortest driving distance route.
	 * pedestrian - Walking route; Avoids limited access roads; Ignores turn restrictions.
	 * multimodal - Combination of walking and (if available) Public Transit.
	 * bicycle - Bike route; Avoids limited access roads; Avoids roads where bicycle access is false; Favors bike specific paths and lower maxspeed roads.
	 * 
	 * Default = 'fastest'
	 * 
	 * @param routeType
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder routeType(String routeType) {
		parameters.put("routeType", routeType);
		return this;
	}

	/**
	 * A convenience method for setting the route type to fastest.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder routeTypeFastest() {
		return routeType("fastest");
	}

	/**
	 * A convenience method for setting the route type to shortest.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder routeTypeShortest() {
		return routeType("shortest");
	}

	/**
	 * A convenience method for setting the route type to pedestrian.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder routeTypePedestrian() {
		return routeType("pedestrian");
	}

	/**
	 * A convenience method for setting the route type to multimodal.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder routeTypeMultiModal() {
		return routeType("multimodal");
	}

	/**
	 * A convenience method for setting the route type to bicycle.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder routeTypeBicycle() {
		return routeType("bicycle");
	}

	/**
	 * If this flag is set, no reverse geocoding will be done on input locations. 
	 * This is useful if, for instance, you are writing a mobile application and you know 
	 * the exact latitude/longitude of your input locations, and you don't want to risk 
	 * a reverse geocoding call which might change your latitude/longitude if an exact 
	 * match is not found.
	 * 
	 * false - Input latitude/longitude will be used without any modification.
	 * true - Even if exact latitude/longitude are given as input locations, a reverse geocode call will be performed to determine city/state/zipcode/etc.
	 * 
	 * Default = 'true'
	 */
	public RouteRequestBuilder doReverseGeocode(boolean reverseGeocode) {
		parameters.put("doReverseGeocode", String.valueOf(reverseGeocode));
		return this;
	}

	/**
	 * Specifies the type of narrative to generate.
	 * 
	 * none - No narrative is generated
	 * text - Standard text narrative
	 * html - Adds some HTML tags to the standard text
	 * microformat - Uses HTML span tags with class attributes to allow parts of the narrative to be easily styled via CSS. Explanation
	 * 
	 * Default = 'text'
	 */
	public RouteRequestBuilder narrativeType(String narrativeType) {
		parameters.put("narrativeType", narrativeType);
		return this;
	}

	/**
	 * A convenience method for setting the narrative to none.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder narrativeTypeNone() {
		return narrativeType("none");
	}

	/**
	 * A convenience method for setting the narrative to text.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder narrativeTypeText() {
		return narrativeType("text");
	}

	/**
	 * A convenience method for setting the narrative to html.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder narrativeTypeHtml() {
		return narrativeType("html");
	}

	/**
	 * A convenience method for setting the narrative to microformat.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder narrativeTypeMicroFormat() {
		return narrativeType("microformat");
	}

	/**
	 * Enhanced Narrative Option. This option will generate an enhanced narrative 
	 * for Route & Alternate Route Services. This will encompass Intersection Counts, 
	 * Previous Intersection, and Next Intersection/Gone Too Far advice.
	 * 
	 * false - No intersection counts, previous intersection, or Next Intersection/Gone Too Far advice will be displayed.
	 * true - Intersection counts, previous intersection, and Next Intersection/Gone Too Far advice can be displayed when available.
	 * 
	 * Default = 'false'
	 * 
	 * Note: In order to view the proper maneuver note styles, the narrativeType needs 
	 * to be set to 'microformat'. Microformat uses HTML span tags with class attributes 
	 * to allow parts of the narrative to be easily styled via CSS. Read more.
	 */
	public RouteRequestBuilder enhancedNarrative(boolean enhancedNarrative) {
		parameters.put("enhancedNarrative", String.valueOf(enhancedNarrative));
		return this;
	}

	/**
	 * The maximum number of Link IDs to return for each maneuver. If zero, no Link ID 
	 * data is returned.
	 * 
	 * Default = 0
	 */
	public RouteRequestBuilder maxLinkId(int maxLinkId) {
		parameters.put("maxLinkId", String.valueOf(maxLinkId));
		return this;
	}

	/**
	 * Examples of commonly used locale parameter values. Language to use in the 
	 * narrative. Input can be any supported ISO 639-1 code.
	 * 
	 * English(US) = en_US(default)
	 * English(Great Britain) = en_GB
	 * French(Canada) = fr_CA
	 * French(France) = fr_FR
	 * Germany(Germany) = de_DE
	 * Spanish(Spain) = es_ES
	 * Spanish(Mexico) = es_MX
	 * Russian(Russia) = ru_RU
	 * 
	 * Default = 'en_US'
	 * 
	 * @param locale
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder locale(String locale) {
		parameters.put("locale", locale);
		return this;
	}

	/**
	 * Attribute flags of roads to try to avoid. The available attribute flags 
	 * depend on the data set. This does not guarantee roads with these attributes 
	 * will be avoided if alternate route paths are too lengthy or not possible or 
	 * roads that contain these attributes are very short.
	 * 
	 * Available choices:
	 * Limited Access - Highways
	 * Toll Road
	 * Ferry
	 * Unpaved
	 * Seasonal Closure - Approximate. Seasonal roads may not be selected with 100% accuracy.
	 * Country Crossing
	 * 
	 * @param avoids
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder avoids(String avoids) {
		parameters.put("avoids", avoids);
		return this;
	}

	/**
	 * Link IDs of roads to absolutely avoid. May cause some routes to fail. Multiple Link IDs 
	 * should be comma-separated.
	 * 
	 * @param mustAvoidLinkIds
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder mustAvoidLinkIds(Collection<Integer> mustAvoidLinkIds) {

		if (mustAvoidLinkIds == null || mustAvoidLinkIds.isEmpty())
			return this;

		Iterator<Integer> iterator = mustAvoidLinkIds.iterator();

		StringBuilder builder = new StringBuilder();
		while (iterator.hasNext()) {
			builder.append(iterator.next());
			if (iterator.hasNext())
				builder.append(",");
		}

		parameters.put("mustAvoidLinkIds", builder.toString());
		return this;
	}

	/**
	 * Link IDs of roads to try to avoid during route calculation. Does not guarantee 
	 * these roads will be avoided if alternate route paths are too lengthy or not possible. 
	 * Multiple Link IDs should be comma-separated.
	 * 
	 * @param tryAvoidLinkIds 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder tryAvoidLinkIds(Collection<Integer> tryAvoidLinkIds) {

		if (tryAvoidLinkIds == null || tryAvoidLinkIds.isEmpty())
			return this;

		Iterator<Integer> iterator = tryAvoidLinkIds.iterator();

		StringBuilder builder = new StringBuilder();
		while (iterator.hasNext()) {
			builder.append(iterator.next());
			if (iterator.hasNext())
				builder.append(",");
		}

		parameters.put("tryAvoidLinkIds", builder.toString());
		return this;
	}

	/**
	 * State boundary display option.
	 * 
	 * true - State boundary crossings will be displayed in narrative.
	 * false - State boundary crossings will not be displayed in narrative.
	 * 
	 * @param stateBoundaryDisplay 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder stateBoundaryDisplay(boolean stateBoundaryDisplay) {
		parameters.put("stateBoundaryDisplay", String.valueOf(stateBoundaryDisplay));
		return this;
	}

	/**
	 * Country boundary display option
	 * 
	 * true - Country boundary crossings are displayed in narrative.
	 * false - Country boundary crossings are not displayed in narrative.
	 * 
	 * @param countryBoundaryDisplay 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder countryBoundaryDisplay(boolean countryBoundaryDisplay) {
		parameters.put("countryBoundaryDisplay", String.valueOf(countryBoundaryDisplay));
		return this;
	}

	/**
	 * The "End at" destination maneuver display option.
	 * 
	 * true - the "End at" destination maneuver is displayed in narrative.
	 * false - the "End at" destination maneuver is not displayed in narrative.
	 * 
	 * @param destinationManeuverDisplay 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder destinationManeuverDisplay(boolean destinationManeuverDisplay) {
		parameters.put("destinationManeuverDisplay", String.valueOf(destinationManeuverDisplay));
		return this;
	}

	/**
	 * This will return all shape (no generalization or clipping). This option overrides any 
	 * mapState or generalize options.
	 * 
	 * true - All shape points will be returned.
	 * false - Returned shape points depends on mapState or generalize options.
	 * 
	 * Default = false
	 * 
	 * @param fullShape 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder fullShape(boolean fullShape) {
		parameters.put("fullShape", String.valueOf(fullShape));
		return this;
	}

	/**
	 * This option applies to both input and output (raw, cmp, cmp6) and overrides 
	 * inShapeFormat and outShapeFormat.
	 * 
	 *  Shape format options.
	 *  none
	 *  raw - shape is represented as float pairs.
	 *  cmp - shape is represented as a compressed path string with 5 digits of precision.
	 *  cmp6 - Same as for cmp, but uses 6 digits of precision.
	 *  
	 *  See the Compressed Lat/Lng description page for more detail, including sample source 
	 *  code and an interactive encoder/decoder.
	 * 
	 * @param shapeFormat 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder shapeFormat(ShapeFormat shapeFormat) {
		parameters.put("shapeFormat", shapeFormat.name().toLowerCase());
		return this;
	}

	/**
	 * A convenience method for setting the shape format to none.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder shapeFormatNone() {
		return shapeFormat(ShapeFormat.NONE);
	}

	/**
	 * A convenience method for setting the shape format to raw.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder shapeFormatRaw() {
		return shapeFormat(ShapeFormat.RAW);
	}

	/**
	 * A convenience method for setting the shape format to cmp.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder shapeFormatCmp() {
		return shapeFormat(ShapeFormat.CMP);
	}

	/**
	 * A convenience method for setting the shape format to cmp6.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder shapeFormatCmp6() {
		return shapeFormat(ShapeFormat.CMP6);
	}

	/**
	 * Input shape format options.
	 * 
	 * raw - shape is represented as float pairs.
	 * cmp - shape is represented as a compressed path string with 5 digits of precision.
	 * cmp6 - Same as for cmp, but uses 6 digits of precision.
	 * 
	 * See the Compressed Lat/Lng description page for more detail, including 
	 * sample source code and an interactive encoder/decoder.
	 * 
	 * @param inShapeFormat 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder inShapeFormat(String inShapeFormat) {
		parameters.put("inShapeFormat", inShapeFormat);
		return this;
	}

	/**
	 * A convenience method for setting the input shape format to none.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder inShapeFormatNone() {
		return inShapeFormat("none");
	}

	/**
	 * A convenience method for setting the input shape format to raw.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder inShapeFormatRaw() {
		return inShapeFormat("raw");
	}

	/**
	 * A convenience method for setting the input shape format to cmp.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder inShapeFormatCmp() {
		return inShapeFormat("cmp");
	}

	/**
	 * A convenience method for setting the input shape format to cmp6.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder inShapeFormatCmp6() {
		return inShapeFormat("cmp6");
	}

	/**
	 * Output shape format options.
	 * 
	 * raw - shape is represented as float pairs.
	 * cmp - shape is represented as a compressed path string with 5 digits of precision.
	 * cmp6 - Same as for cmp, but uses 6 digits of precision.
	 * 
	 * See the Compressed Lat/Lng description page for more detail, including sample 
	 * source code and an interactive encoder/decoder.
	 * 
	 * @param outShapeFormat 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder outShapeFormat(String outShapeFormat) {
		parameters.put("outShapeFormat", outShapeFormat);
		return this;
	}

	/**
	 * A convenience method for setting the output shape format to none.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder outShapeFormatNone() {
		return outShapeFormat("none");
	}

	/**
	 * A convenience method for setting the output shape format to raw.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder outShapeFormatRaw() {
		return outShapeFormat("raw");
	}

	/**
	 * A convenience method for setting the output shape format to cmp.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder outShapeFormatCmp() {
		return outShapeFormat("cmp");
	}

	/**
	 * A convenience method for setting the output shape format to cmp6.
	 * 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder outShapeFormatCmp6() {
		return outShapeFormat("cmp6");
	}

	/**
	 * If there is no mapState and fullShape = false, then the specified 
	 * generalization factor will be used to generalize the shape.
	 * 
	 * If the generalize parameter is 0, then no shape simplification will 
	 * be done and all shape points will be returned.
	 * 
	 * If the generalize parameter is > 0, it will be used as the tolerance 
	 * distance (in meters) in the Douglas-Peucker Algorithm for line simplification.
	 * 
	 * Higher values of generalize will result in fewer points in the final route shape.
	 * 
	 * @param generalize 
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder generalize(int generalize) {
		parameters.put("generalize", String.valueOf(generalize));
		return this;
	}

	/**
	 * Sets the cycling road favoring factor. A value of < 1 favors cycling on 
	 * non-bike lane roads. Values are clamped to the range 0.1 to 100.0
	 * 
	 * Default = 1.0
	 * 
	 * @param cyclingRoadFactor
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder cyclingRoadFactor(double cyclingRoadFactor) {
		parameters.put("cyclingRoadFactor", String.valueOf(cyclingRoadFactor));
		return this;
	}

	/**
	 * Specifies the road grade avoidance strategies to be used for each leg. 
	 * This parameter is only for bicycle routes.
	 * 
	 * DEFAULT_STRATEGY - No road grade strategy will be used.
	 * AVOID_UP_HILL - Avoid up hill road grades.
	 * AVOID_DOWN_HILL - Avoid down hill road grades.
	 * AVOID_ALL_HILLS - Avoid all hill road grades.
	 * FAVOR_UP_HILL - Favor up hill road grades.
	 * FAVOR_DOWN_HILL - Favor down hill road grades.
	 * FAVOR_ALL_HILLS - Favor all hill road grades.
	 * 
	 * Default = 'DEFAULT_STRATEGY'
	 * 
	 * @param roadGradeStrategy
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder roadGradeStrategy(String roadGradeStrategy) {
		parameters.put("roadGradeStrategy", roadGradeStrategy);
		return this;
	}

	/**
	 * Driving style to be used when calculating fuel usage.
	 * 
	 * 1 or cautious - Assume a cautious driving style.
	 * 2 or normal - Assume a normal driving style. This is the default.
	 * 3 or aggressive - Assume an aggressive driving style.
	 * 
	 * @param drivingStyle
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder drivingStyle(int drivingStyle) {
		parameters.put("drivingStyle", String.valueOf(drivingStyle));
		return this;
	}

	/**
	 * Driving style to be used when calculating fuel usage.
	 * 
	 * 1 or cautious - Assume a cautious driving style.
	 * 2 or normal - Assume a normal driving style. This is the default.
	 * 3 or aggressive - Assume an aggressive driving style.
	 * 
	 * @param drivingStyle
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder drivingStyle(String drivingStyle) {
		parameters.put("drivingStyle", drivingStyle);
		return this;
	}

	/**
	 * This is the fuel efficiency of your vehicle, given as miles 
	 * per gallon. Valid range is 0 – 235 mpg. If a value is entered 
	 * that is less than the minimum range, then 0 will be used. If a 
	 * value is entered that is greater than the maximum range, 
	 * then 235 will be used.
	 * 
	 * @param highwayEfficiency
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder highwayEfficiency(double highwayEfficiency) {
		parameters.put("highwayEfficiency", String.valueOf(highwayEfficiency));
		return this;
	}

	/**
	 * Maneuver maps display option.
	 * 
	 * true - A small staticmap is displayed per maneuver with the route 
	 * 	shape of that maneuver. The route response will return a mapUrl. 
	 * 	See -mapUrl in the Route Response section for a detailed description.
	 * 
	 * false - A small staticmap is not displayed per maneuver.
	 * 
	 * Default = true
	 * 
	 * @param manMaps
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder manMaps(boolean manMaps) {
		parameters.put("manMaps", String.valueOf(manMaps));
		return this;
	}

	/**
	 * This is the speed (in miles per hour as default and it does adhere to 
	 * the unit specifier) allowed for pedestrian routeTypes (or walking portions 
	 * of a multimodal route). This is used for computing expected route times 
	 * for walking routes. It is also used when computing multimodal routes. 
	 * Since multimodal routes use date/time and schedule based departures and 
	 * arrivals from transit stops, the speed which one walks can alter the 
	 * suggested route.
	 *  
	 * The default is 2.5 miles per hour.
	 * 
	 * @param walkingSpeed
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder walkingSpeed(double walkingSpeed) {
		parameters.put("walkingSpeed", String.valueOf(walkingSpeed));
		return this;
	}

	/**
	 * A unique identifier used to refer to a session. An existing session ID 
	 * will be used if provided, otherwise a new one will be created. The route 
	 * stored in the session will be automatically updated if the session ID 
	 * is provided. Expires after 30 minutes.
	 * 
	 * This parameter is required for the Route Shape requests, but is optional 
	 * for other requests.
	 * 
	 * @param sessionId
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder sessionId(String sessionId) {
		parameters.put("sessionId", sessionId);
		return this;
	}

	/**
	 * A mapState object, to which route shape information (if returned) 
	 * will be mapped. Contains the basic information necessary to draw a map.
	 * 
	 * This parameter must contain the following information:
	 * 
	 * width (pixels)
	 * height (pixels)
	 * center (lat/lng of map center)
	 * scale (map scale)
	 * 
	 * Note: Only width & height are required for Route and OptimizedRoute. 
	 * All parameters are required for RouteShape. mapState with width and height 
	 * only: Specifying just mapWidth and mapHeight in the supplied mapState will 
	 * result in shape points being generalized with an optimal tolerance based 
	 * on the bestFit recommended zoom level. This option can be used to retrieve 
	 * a route with shape optimized for the best fit center and zoom level to fit 
	 * the route.
	 * 
	 * Full mapState: If a complete mapState is provide with center, width, height, 
	 * and scale, the route shape will be clipped and generalized to the provided 
	 * mapState. Be careful using this option as there is no guarantee the route 
	 * shape will even be contained within the mapState (resulting in no shape points 
	 * being returned). Another danger is "over-generalization" of the shape. This 
	 * option should only be used if the current map will not be changed due to 
	 * the new route.
	 * 
	 * To describe a mapState object using Key/Value pair input, supply the 
	 * following query parameters:
	 * 
	 * mapWidth
	 * mapHeight
	 * mapScale or mapZoom - The scale factor of the map. If mapZoom is provided, it will override the value of mapScale. See Zoom to Scale Mapping for information on scales versus zoom levels.
	 * mapLat
	 * mapLng
	 * 
	 * mapLat and mapLng represent the latitude and longitude of the center of the map.
	 * 
	 * For sample JSON or XML input, see the sample response values below.
	 * 
	 * @param mapState
	 * @return RouteRequestBuilder
	 */
	public RouteRequestBuilder mapState(int mapWidth, int mapHeight, int mapZoom, double mapLat, double mapLng) {
		parameters.put("mapWidth", String.valueOf(mapWidth));
		parameters.put("mapHeight", String.valueOf(mapHeight));
		parameters.put("mapZoom", String.valueOf(mapZoom));
		parameters.put("mapLat", String.valueOf(mapLat));
		parameters.put("mapLng", String.valueOf(mapLng));
		return this;
	}

	/**
	 * Build the request object.
	 * 
	 * @return RouteRequest
	 */
	public RouteRequest build() {
		return new RouteRequest(parameters);
	}

}
