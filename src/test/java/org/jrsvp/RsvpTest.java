package org.jrsvp;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring-servlet.xml" })
public class RsvpTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	@Qualifier("hibernateConfiguration")
	Configuration configuration;

	@Test
	public void x() throws Exception {
		SchemaExport export = new SchemaExport(configuration);

		export.create(true, true);

	}
}
