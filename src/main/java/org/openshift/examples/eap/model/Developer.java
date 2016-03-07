package org.openshift.examples.eap.model;

import java.io.Serializable;

/**
 * Created by faisalmasood on 4/03/2016.
 */
public class Developer implements Serializable {

    private  final long id;
    private  final String name;

    public Developer(final long id, final String name){
        this.name = name;
        this.id = id;
    }

    public long getId() {
        return id;
    }



    public String getName() {
        return name;
    }

}
