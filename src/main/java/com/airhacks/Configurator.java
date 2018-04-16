/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks;

import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Alex
 */
@Provider
public class Configurator implements DynamicFeature{

    @Override
    public void configure(ResourceInfo ri, FeatureContext fc) {
        fc.register(new RequestLogger());
    }
    
}
