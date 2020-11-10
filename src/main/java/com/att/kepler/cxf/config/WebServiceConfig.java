package com.att.kepler.cxf.config;


import javax.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import com.att.kepler.cxf.IncidentServiceImpl;
import com.att.kepler.cxf.service.IncidentServiceImpl;

@Configuration
public class WebServiceConfig {

    @Autowired
    private Bus bus;
    
    @Bean
    public Endpoint endpoint() {
    	//bus.setProperty("set-jaxb-validation-event-handler", "false");
        EndpointImpl endpoint = new EndpointImpl(bus, new IncidentServiceImpl());
    	endpoint.getFeatures().add(new LoggingFeature());
        endpoint.publish("/IncidentService");
        return endpoint;
    }
}
