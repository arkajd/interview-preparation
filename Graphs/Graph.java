package Graphs;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    int noOfNodes;
    List<List<Integer>> graphNodes;

    public Graph(int noOfNodes){
        this.noOfNodes = noOfNodes;
        graphNodes = new ArrayList<>(noOfNodes);

        for(int i=0; i<noOfNodes; i++){
            graphNodes.add(new ArrayList<>());
        }
    }

    public void addEdge(Integer from, Integer to){
        graphNodes.get(from).add(to);
        graphNodes.get(to).add(from);
    }
    
}
