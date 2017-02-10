package com.nestvogel.pocs.payara.embedded.payara;

import java.io.InputStream;

import org.glassfish.embeddable.GlassFish;
import org.glassfish.embeddable.GlassFishException;
import org.glassfish.embeddable.GlassFishProperties;
import org.glassfish.embeddable.GlassFishRuntime;

public class Startup {

	public static void main(String[] args) throws GlassFishException {
		GlassFishRuntime runtime = GlassFishRuntime.bootstrap();

		GlassFishProperties glassFishProperties = new GlassFishProperties();
		// glassFishProperties.setPort("http-listener", 9080);
		String path = Startup.class.getResource("/domain").getPath();
		glassFishProperties.setInstanceRoot(path);

		GlassFish glassFish = runtime.newGlassFish(glassFishProperties);
		glassFish.start();

		InputStream inputStream = Startup.class.getClassLoader().getResourceAsStream("payara-embedded-app.war");

		glassFish.getDeployer().deploy(inputStream, "--contextroot", "/");
	}
}