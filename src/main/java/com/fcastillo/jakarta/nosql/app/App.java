/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.jakarta.nosql.app;

import com.fcastillo.jakarta.nosql.entity.God;
import jakarta.nosql.mapping.keyvalue.KeyValueTemplate;
import java.util.Optional;
import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

/**
 *
 * @author fcastillo
 */
public class App {

  public static void main(String[] args) {
    try (SeContainer container = SeContainerInitializer.newInstance().initialize()) {
      God diana = new God(1L, "Diana", "Hunt");

      KeyValueTemplate template = container.select(KeyValueTemplate.class).get();
      template.put(diana);

      final Optional<God> god = template.get(1L, God.class);

      System.out.println("Query: " + god);
      
      template.delete(1L);
      System.out.println("Query: " + template.get(1L,God.class));
    }
    System.exit(0);
  }
}
