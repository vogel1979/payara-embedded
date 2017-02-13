package com.nestvogel.pocs.payara.embedded.payara;

import org.glassfish.embeddable.GlassFishException;
import org.springframework.cloud.Cloud;
import org.springframework.cloud.CloudFactory;
import org.springframework.cloud.service.ServiceInfo;

public class Startup {

	public static void main(String[] args) throws GlassFishException {

		//try {
			CloudFactory cloudFactory = new CloudFactory();
			
			Cloud cloud = cloudFactory.getCloud();
			
			
			for (ServiceInfo service : cloud.getServiceInfos()) {
				System.out.println(service);
			};
			
			
			
			
//			BootstrapProperties bootstrap = new BootstrapProperties();
//
//			GlassFishRuntime runtime = GlassFishRuntime.bootstrap();
//			GlassFishProperties glassfishProperties = new GlassFishProperties();
//			glassfishProperties.setPort("http-listener", 8083);
//			glassfishProperties.setPort("https-listener", 8184);
//			GlassFish glassfish = runtime.newGlassFish(glassfishProperties);
//			glassfish.start();
//
//			String poolProperties = "user=sa:password=test:url=jdbc\\:derby\\:memory\\:db;create\\=true";
//			CommandResult res = glassfish.getCommandRunner().run("create-jdbc-connection-pool", "--ping",
//					"--restype=java.sql.Driver", "--driverclassname", "org.apache.derby.jdbc.EmbeddedDriver",
//					"--property", poolProperties, "MyPool");
//
//			System.out.println(res);
//			glassfish.getCommandRunner().run("create-system-properties", "JMS_PROVIDER_PORT=7676:moinsen=hallo");
//
//			InputStream inputStream = Startup.class.getClassLoader().getResourceAsStream("payara-embedded-app.war");
//
//			glassfish.getDeployer().deploy(inputStream, "--contextroot", "/");
//		}
//
//		catch (GlassFishException ex) {
//			Logger.getLogger(Startup.class.getName()).log(Level.SEVERE, null, ex);
//		}

		// set-log-attributes --target=server-config
		// java.util.logging.FileHandler.pattern='%h/java%u.log'
		// set-log-attributes --target=server-config
		// java.util.logging.FileHandler.count='1'
		// set-log-attributes --target=server-config
		// java.util.logging.FileHandler.formatter='java.util.logging.XMLFormatter'
		// set-log-attributes --target=server-config
		// com.sun.enterprise.server.logging.GFFileHandler.rotationTimelimitInMinutes='0'
		// set-log-attributes --target=server-config
		// com.sun.enterprise.server.logging.GFFileHandler.excludeFields=''
		// set-log-attributes --target=server-config
		// com.sun.enterprise.server.logging.GFFileHandler.compressOnRotation='false'
		// set-log-attributes --target=server-config
		// com.sun.enterprise.server.logging.GFFileHandler.multiLineMode='true'
		// set-log-attributes --target=server-config
		// com.sun.enterprise.server.logging.GFFileHandler.retainErrorsStasticsForHours='0'
		// set-log-attributes --target=server-config
		// com.sun.enterprise.server.logging.GFFileHandler.rotationOnDateChange='false'
		// set-log-attributes --target=server-config
		// com.sun.enterprise.server.logging.GFFileHandler.formatter='com.sun.enterprise.server.logging.ODLLogFormatter'
		// set-log-attributes --target=server-config
		// com.sun.enterprise.server.logging.GFFileHandler.maxHistoryFiles='0'
		// set-log-attributes --target=server-config
		// handlerServices='com.sun.enterprise.server.logging.GFFileHandler,com.sun.enterprise.server.logging.SyslogHandler'
		// set-log-attributes --target=server-config
		// java.util.logging.FileHandler.limit='50000'
		// set-log-attributes --target=server-config
		// com.sun.enterprise.server.logging.GFFileHandler.file='${com.sun.aas.instanceRoot}/logs/server.log'
		// set-log-attributes --target=server-config
		// handlers='java.util.logging.ConsoleHandler'
		// set-log-attributes --target=server-config
		// java.util.logging.ConsoleHandler.formatter='com.sun.enterprise.server.logging.UniformLogFormatter'
		// set-log-attributes --target=server-config
		// com.sun.enterprise.server.logging.GFFileHandler.flushFrequency='1'
		// set-log-attributes --target=server-config
		// com.sun.enterprise.server.logging.GFFileHandler.logtoConsole='true'
		// set-log-attributes --target=server-config
		// com.sun.enterprise.server.logging.SyslogHandler.useSystemLogging='false'
		// set-log-attributes --target=server-config
		// log4j.logger.org.hibernate.validator.util.Version='warn'
		// set-log-attributes --target=server-config
		// com.sun.enterprise.server.logging.GFFileHandler.rotationLimitInBytes='2000000'
		// create-system-properties --target=server-config
		// JMS_PROVIDER_PORT=7676:moinsen=hallo

		// GlassFishRuntime runtime = GlassFishRuntime.bootstrap();
		//
		// GlassFishProperties glassFishProperties = new GlassFishProperties();
		// // glassFishProperties.setPort("http-listener", 9080);
		// String path = Startup.class.getResource("/domain").getPath();
		// glassFishProperties.setInstanceRoot(path);
		//
		// GlassFish glassFish = runtime.newGlassFish(glassFishProperties);
		// glassFish.start();

	}
}