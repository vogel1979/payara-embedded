package com.nestvogel.pocs.payara.embedded.cloud;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.springframework.cloud.cloudfoundry.CloudFoundryServiceInfoCreator;
import org.springframework.cloud.cloudfoundry.Tags;

public class MyServiceInfoCreator extends CloudFoundryServiceInfoCreator<MyServiceInfo> {

	public MyServiceInfoCreator() {
	    super(new Tags(), "myAPP");
	  }

	@Override
	public MyServiceInfo createServiceInfo(Map<String, Object> serviceData) {
		Map<String, Object> credentials = (Map<String, Object>) serviceData.get("credentials");
		String id = (String) serviceData.get("name");

			System.out.println(credentials.get("url"));
			System.out.println(credentials);
//			URI uri = new URI((String) credentials.get("url"));
//			System.out.println(uri);
//			String scheme = uri.getScheme();
//			int port = uri.getPort();
//			String host = uri.getHost();
//			String path = uri.getPath();
//			String query = uri.getQuery();
//			String fragment = uri.getFragment();
//			String url = new URI(scheme, "", host, port, path, query, fragment).toString();
			return new MyServiceInfo("1", "2");

	}

	@Override
	public boolean accept(Map<String, Object> serviceData) {
		System.out.println("Accept? " + serviceData.get("name"));
		String name = (String) serviceData.get("name");
		return "cloudpoc-service-two".equals(name);
	}
}
