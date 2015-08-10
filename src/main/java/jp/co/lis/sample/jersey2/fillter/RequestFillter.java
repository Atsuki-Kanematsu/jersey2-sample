package jp.co.lis.sample.jersey2.fillter;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

@Provider
public class RequestFillter implements ContainerRequestFilter {

	@Inject
	protected HttpServletRequest request;

	@Override
	public void filter(ContainerRequestContext reqContext) throws IOException {
		MultivaluedMap<String, String> map = reqContext.getHeaders();
		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}

	}

}
