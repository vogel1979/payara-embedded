package com.nestvogel.payara.emcom.nestvogel.pocs.payara.embedded.app;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Stateless
@Path("rest")
public class Resource {

	@EJB
	private SampleBean bean;

	@GET
	public String hallo() {
		return bean.getText();
	}
}