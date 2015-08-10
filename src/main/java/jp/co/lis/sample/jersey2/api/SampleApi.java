package jp.co.lis.sample.jersey2.api;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jp.co.lis.sample.jersey2.bean.SampleBean;

@Path("/sample")
public class SampleApi {

	@Path("/sayHello")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hello World!";
	}


	@Inject
	protected HttpServletRequest request;

	@Path("/printSessionId")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String printSessionId() {
		return request.getSession().getId();
	}


	@Inject
	protected SampleBean sampleBean;

	@Path("/setBeanValue")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String setBeanValue() {
		sampleBean.setValue(request.getSession().getId());
		return "ok";
	}

	@Path("/getBeanValue")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getBeanValue() {
		return sampleBean.getValue();
	}
}
