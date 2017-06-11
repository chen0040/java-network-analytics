package com.github.chen0040.networks.models;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Created by xschen on 11/6/2017.
 */
@Getter
@Setter
public class Network implements Serializable {
   private static final long serialVersionUID = 894294479012704621L;
   private final int vertexCount;
   private final List<Set<Edge>> adjList = new ArrayList<>();
   private final List<Node> nodeList = new ArrayList<>();

   public void addEdge(int v, int w){
      Edge e = new Edge(v, w);
      adjList.get(v).add(e);
      adjList.get(w).add(e);
   }

   public Network(int V) {
      this.vertexCount = V;
      for(int i=0; i < V; ++i) {
         nodeList.add(new Node(i));
         adjList.add(new HashSet<>());
      }
   }

   public Iterable<Edge> adj(int v) {
      return adjList.get(v);
   }
}
