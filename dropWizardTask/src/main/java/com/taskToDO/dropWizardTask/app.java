package com.taskToDO.dropWizardTask;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class app extends Application<Configuration> {
	private static final Logger LOGGER = LoggerFactory.getLogger(app.class);
	 
    @Override
    public void initialize(Bootstrap<Configuration> b) {
    }
 
    @Override
    public void run(Configuration c, Environment e) throws Exception {
        LOGGER.info("Registering REST resources");
        e.jersey().register(new TodoController());
    }
    public static void main(String[] args) throws Exception {
    	LOGGER.info("Registring Servvvvvvvvvvvv");
        new app().run(args);
    }
}
