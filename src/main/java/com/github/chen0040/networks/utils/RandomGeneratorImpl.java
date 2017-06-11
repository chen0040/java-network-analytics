package com.github.chen0040.networks.utils;


import java.util.Random;


/**
 * Created by xschen on 11/6/2017.
 */
public class RandomGeneratorImpl implements RandomGenerator {
   private static final long serialVersionUID = -4326058479725714283L;
   private Random random = new Random();
   @Override public double nextDouble() {
      return random.nextDouble();
   }


   @Override public int nextInt(int upper) {
      return random.nextInt(upper);
   }
}
