package com.bytebybyte.mapquest.directions.service.standard;

import org.junit.Assert;
import org.junit.Test;

import com.bytebybyte.mapquest.directions.service.response.CmpShapeDecoder;
import com.bytebybyte.mapquest.directions.service.response.LatLng;

public class CmpShapeDecoderTestCase {

	@Test
	public void testDecode_OneEntry_CMP6() throws Exception {
		// setup
		String encoded = "ohrtvAvfra_D";

		// execute
		LatLng[] decoded = CmpShapeDecoder.decode(encoded, 6);

		// verify
		Assert.assertNotNull(decoded);
		Assert.assertEquals(1, decoded.length);
		Assert.assertNotNull(decoded[0]);
		Assert.assertNotNull(decoded[0].getLat());
		Assert.assertNotNull(decoded[0].getLng());
		Assert.assertEquals(45.967000d, decoded[0].getLat().doubleValue(), 0.000001d);
		Assert.assertEquals(-83.928700d, decoded[0].getLng().doubleValue(), 0.000001d);
	}

	@Test
	public void testDecode_TwoEntries_CMP6() throws Exception {
		// setup
		String encoded = "_kfwaA|lud_D~js|_AildB";

		// execute
		LatLng[] decoded = CmpShapeDecoder.decode(encoded, 6);

		// verify
		Assert.assertNotNull(decoded);
		Assert.assertEquals(2, decoded.length);
		Assert.assertNotNull(decoded[0]);
		Assert.assertNotNull(decoded[0].getLat());
		Assert.assertNotNull(decoded[0].getLng());
		Assert.assertEquals(35.000000d, decoded[0].getLat().doubleValue(), 0.000001d);
		Assert.assertEquals(-83.979487d, decoded[0].getLng().doubleValue(), 0.000001d);
		Assert.assertNotNull(decoded[1]);
		Assert.assertNotNull(decoded[1].getLat());
		Assert.assertNotNull(decoded[1].getLng());
		Assert.assertEquals(0.960000d, decoded[1].getLat().doubleValue(), 0.000001d);
		Assert.assertEquals(-83.927562d, decoded[1].getLng().doubleValue(), 0.000001d);
	}

	@Test
	public void testDecode_ManyEntries_CMP6() throws Exception {
		// setup
		String encoded = "ohrtvAvfra_DoqifPoP~nuce@tvbB~fjaR}`xz@~fjaRfksw@~z|wYsV_eqsaAserj}C?~p~q{C~x|u@?_y|u@?~x|u@?G@";

		// execute
		LatLng[] decoded = CmpShapeDecoder.decode(encoded, 6);

		// verify
		Assert.assertNotNull(decoded);
		Assert.assertEquals(12, decoded.length);
		Assert.assertNotNull(decoded[0]);
		Assert.assertNotNull(decoded[0].getLat());
		Assert.assertNotNull(decoded[0].getLng());
		Assert.assertEquals(45.967000d, decoded[0].getLat().doubleValue(), 0.000001d);
		Assert.assertEquals(-83.928700d, decoded[0].getLng().doubleValue(), 0.000001d);
		Assert.assertNotNull(decoded[1]);
		Assert.assertNotNull(decoded[1].getLat());
		Assert.assertNotNull(decoded[1].getLng());
		Assert.assertEquals(55.000000d, decoded[1].getLat().doubleValue(), 0.000001d);
		Assert.assertEquals(-83.928420d, decoded[1].getLng().doubleValue(), 0.000001d);
		Assert.assertNotNull(decoded[2]);
		Assert.assertNotNull(decoded[2].getLat());
		Assert.assertNotNull(decoded[2].getLng());
		Assert.assertEquals(35.000000d, decoded[2].getLat().doubleValue(), 0.000001d);
		Assert.assertEquals(-83.979487d, decoded[2].getLng().doubleValue(), 0.000001d);
		Assert.assertNotNull(decoded[3]);
		Assert.assertNotNull(decoded[3].getLat());
		Assert.assertNotNull(decoded[3].getLng());
		Assert.assertEquals(25.000000d, decoded[3].getLat().doubleValue(), 0.000001d);
		Assert.assertEquals(-83.000000d, decoded[3].getLng().doubleValue(), 0.000001d);
		Assert.assertNotNull(decoded[4]);
		Assert.assertNotNull(decoded[4].getLat());
		Assert.assertNotNull(decoded[4].getLng());
		Assert.assertEquals(15.000000d, decoded[4].getLat().doubleValue(), 0.000001d);
		Assert.assertEquals(-83.927940d, decoded[4].getLng().doubleValue(), 0.000001d);
		Assert.assertNotNull(decoded[5]);
		Assert.assertNotNull(decoded[5].getLat());
		Assert.assertNotNull(decoded[5].getLng());
		Assert.assertEquals(0.960000d, decoded[5].getLat().doubleValue(), 0.000001d);
		Assert.assertEquals(-83.927562d, decoded[5].getLng().doubleValue(), 0.000001d);
		Assert.assertNotNull(decoded[6]);
		Assert.assertNotNull(decoded[6].getLat());
		Assert.assertNotNull(decoded[6].getLng());
		Assert.assertEquals(35.900000d, decoded[6].getLat().doubleValue(), 0.000001d);
		Assert.assertEquals(-0.900000d, decoded[6].getLng().doubleValue(), 0.000001d);
		Assert.assertNotNull(decoded[7]);
		Assert.assertNotNull(decoded[7].getLat());
		Assert.assertNotNull(decoded[7].getLng());
		Assert.assertEquals(35.900000d, decoded[7].getLat().doubleValue(), 0.000001d);
		Assert.assertEquals(-83.000000d, decoded[7].getLng().doubleValue(), 0.000001d);
	}
}
