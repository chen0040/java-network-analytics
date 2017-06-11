package com.github.chen0040.networks.generators;


import com.github.chen0040.networks.models.Network;
import com.github.chen0040.networks.utils.RandomGenerator;
import lombok.Getter;
import lombok.Setter;


/**
 * Created by xschen on 11/6/2017.
 * The Barabási–Albert (BA) model is an algorithm for generating random scale-free networks using a preferential attachment mechanism.
 * Several natural and human-made systems, including the Internet, the world wide web, citation networks, and some social networks are
 * thought to be approximately scale-free and certainly contain few nodes (called hubs) with unusually high degree as compared to the
 * other nodes of the network. The BA model tries to explain the existence of such nodes in real networks. The algorithm is named for
 * its inventors Albert-László Barabási and Réka Albert and is a special case of a more general model called Price's model
 */
@Getter
@Setter
public class BAModel {

   private RandomGenerator randomGenerator;
   private int m0 = 3;
   private int m = 3; // m should be <= m0

   public Network create(int networkSize){
      int[] degrees = new int[networkSize];
      int sum = 0;
      Network network = new Network(networkSize);

      for(int i = 0; i <= m0; ++i){
         degrees[i] = m0;
         sum += m0;

         for(int j = 0; j <= m0; ++j){
            if(i == j) continue;
            network.addEdge(i, j);
         }
      }

      for(int i = m0 +1; i < networkSize; ++i) {
         for(int j = 0; j < m; ++j) {
            int acc = 0;
            int r = randomGenerator.nextInt(sum);
            int select_index = i+1;
            for(int k = 0; k < degrees.length && k < i; ++k){
               if(r <= acc){
                  select_index = k;
                  break;
               }
               acc += degrees[k];
            }
            network.addEdge(i, select_index);
            degrees[select_index]++;
            sum++;
         }
      }

      return network;
   }
}
