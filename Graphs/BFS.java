package Graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 2);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);

        breadthFirstSearch(graph.graphNodes, 0);
    }

    private static void breadthFirstSearch(List<List<Integer>> graphNodes, int rootNode){
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[5];
        queue.add(rootNode);

        while(!queue.isEmpty()){
            Integer visitedNode = queue.poll();
            List<Integer> connectedNodes = graphNodes.get(visitedNode);
            visited[visitedNode] =  true;

            for(Integer node : connectedNodes){
                if(visited[node]==false){
                    queue.add(node);
                    visited[node] = true;
                }
            }
            System.out.println(visitedNode);
        }
    }
    
}


class Graph {

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