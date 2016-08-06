/**
 * ============================================================================
 * Project: gateway-app
 * Created: 2016-08-04 20:54:40
 * Class:   cworks.gateway.PreFilter
 *
 * Baked with love
 * ============================================================================
 */
package cworks.gateway;

import javax.servlet.http.HttpServletRequest;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.ZuulFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ----------------------------------------------------------------------------
 * Tell me a little something about this PreFilter
 * @author you
 * ----------------------------------------------------------------------------
 */
public class PreFilter extends ZuulFilter {

    private static final Logger LOG = LoggerFactory.getLogger(PreFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        LOG.info(String.format("%s request to %s",
            request.getMethod(),
            request.getRequestURL().toString()));

        return null;
    }
}
