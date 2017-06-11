package com.github.chen0040.networks.models;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


/**
 * Created by xschen on 11/6/2017.
 */
@Getter
@Setter
public class Edge implements Serializable {
   private static final long serialVersionUID = 4315329621780785689L;
   private int v;
   private int w;
   private double weight;

   public Edge(){

   }

   public Edge(int v, int w) {
      this.v = v;
      this.w = w;
   }

   public int either() {
      return v;
   }

   public int other(int x) {
      return x == this.v ? this.w : this.v;
   }


   @Override public boolean equals(Object o) {
      if (this == o)
         return true;
      if (o == null || getClass() != o.getClass())
         return false;

      Edge edge = (Edge) o;

      if (v != edge.v)
         return false;
      return w == edge.w;
   }


   @Override public int hashCode() {
      int result = v;
      result = 31 * result + w;
      return result;
   }


   @Override public String toString() {
      return "Edge{" + "v=" + v + ", w=" + w + '}';
   }
}
