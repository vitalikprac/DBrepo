package org.obrii.mit.dp2021.luninleonid.leonidlunin;

import org.obrii.mit.dp2021.luninleonid.leonidlunin.RestConsumerApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RestConsumerApplication.class);
	}

}
