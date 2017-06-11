package com.github.chen0040.networks.utils;


import java.io.Serializable;


/**
 * Created by xschen on 11/6/2017.
 */
public interface RandomGenerator extends Serializable {
   double nextDouble();
   int nextInt(int upper);
}
