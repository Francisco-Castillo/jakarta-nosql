/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.jakarta.nosql.config;

import jakarta.nosql.keyvalue.BucketManager;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 *
 * @author fcastillo
 */
@ApplicationScoped
public class BucketManagerProducer {

  @Inject
  @ConfigProperty(name = "keyvalue")
  private BucketManager manager;

  @Produces
  public BucketManager getManager() {
    return manager;
  }

  public void destroy(@Disposes BucketManager manager){
    manager.close();
  }
}
