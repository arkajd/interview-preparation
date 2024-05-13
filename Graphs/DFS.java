package Graphs;

import java.util.List;
import java.util.Stack;

public class DFS {

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);

        depthFirstSearch(graph.graphNodes, 0);
    }

    private static void depthFirstSearch(List<List<Integer>> graphNodes, int rootNode){
        boolean[] visited = new boolean[graphNodes.size()];
        Stack<Integer> stack = new Stack<>();
        stack.push(rootNode);

        while(!stack.isEmpty()){
            Integer visitedNode = stack.pop();
            visited[visitedNode] = true;

            List<Integer> connectedNodes = graphNodes.get(visitedNode);

            for(Integer node : connectedNodes){
                if(visited[node]==false){
                    stack.push(node);
                    visited[node] = true;
                }
            }
            System.out.println(visitedNode);
        }
    }
    
}
