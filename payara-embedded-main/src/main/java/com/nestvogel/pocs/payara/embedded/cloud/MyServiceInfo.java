package com.nestvogel.pocs.payara.embedded.cloud;

import org.springframework.cloud.service.BaseServiceInfo;

public class MyServiceInfo extends BaseServiceInfo {

	private String url;

	public MyServiceInfo(String id, String url) {
		super(id);
		this.url = url;
	}

	@ServiceProperty
	public String getUrl() {
		return url;
	}
}
