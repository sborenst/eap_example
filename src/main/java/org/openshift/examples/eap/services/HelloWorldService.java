package org.openshift.examples.eap.services;

import org.openshift.examples.eap.model.Developer;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by faisalmasood on 4/03/2016.
 */
@RequestScoped
@Path("/showdevelopers")
public class HelloWorldService  {

    @GET()
    @Produces(MediaType.APPLICATION_JSON)
    public List<Developer> getAllDevelopers(){
        return allDevelopers;
    }

    @PostConstruct
    public void populateDevelopers(){
        allDevelopers = new ArrayList<>(2);
        allDevelopers.add(new Developer(1L, "Ken Thompson"));
        allDevelopers.add(new Developer(2L, "Dennis Ritchie"));

    }

    private List<Developer> allDevelopers;
}
