package com.github.chen0040.networks.models;


import lombok.Getter;
import lombok.Setter;


/**
 * Created by xschen on 11/6/2017.
 */
@Setter
@Getter
public class Node {
   private final int id;

   public Node(int id) {
      this.id = id;
   }
}
