/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.jakarta.nosql.entity;

import jakarta.nosql.mapping.Column;
import jakarta.nosql.mapping.Entity;
import jakarta.nosql.mapping.Id;

/**
 *
 * @author fcastillo
 */
@Entity
public class God {

  @Id
  private Long id;

  @Column
  private String name;

  @Column
  private String power;

  public God() {
  }

  public God(Long id, String name, String power) {
    this.id = id;
    this.name = name;
    this.power = power;
  }

}
