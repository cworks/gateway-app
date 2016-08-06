/**
 * ============================================================================
 * Project: gateway-app
 * Created: 2016-08-04 20:33:33
 * Class:   cworks.gateway.Gateway
 *
 * Baked with love
 * ============================================================================
 */
package cworks.gateway;

import org.junit.Test;
import org.junit.Assert;

public class TestGateway {

	@Test
	public void testAppName() throws Exception {
        Assert.assertEquals("TestGateway", this.getClass().getSimpleName());
	}

}
