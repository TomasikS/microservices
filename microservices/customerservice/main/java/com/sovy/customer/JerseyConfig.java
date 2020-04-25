package com.sovy.customer;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
 
@Component
public class JerseyConfig extends ResourceConfig 
{
    public JerseyConfig() 
    {
        register(CustomerResource.class);
        register(NullPointerExceptionMapper.class);
    }
}
