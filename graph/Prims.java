package Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;


public class Prims {
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s,int d,int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }

        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,5,45));
        graph[1].add(new Edge(1,4,30));

        graph[2].add(new Edge(2,3,50));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,6,25));

        graph[3].add(new Edge(3,6,15));
        graph[3].add(new Edge(3,2,50));
        graph[3].add(new Edge(3,5,35));

        graph[4].add(new Edge(4,1,30));
        graph[4].add(new Edge(4,6,20));

        graph[5].add(new Edge(5,1,45));
        graph[5].add(new Edge(5,3,35));
        graph[5].add(new Edge(5,6,55));

        graph[6].add(new Edge(6,2,25));
        graph[6].add(new Edge(6,4,20));
        graph[6].add(new Edge(6,5,55));
        graph[6].add(new Edge(6,3,15));

    }
    public static void prims(ArrayList<Edge> graph[],int src){
        boolean[] vis=new boolean[graph.length+1];
        //vis[0]=true;
        int count=0;
        PriorityQueue<Dijkstra.Pair> pq=new PriorityQueue<>();
        pq.add(new Dijkstra.Pair(1,0));
        while(!pq.isEmpty()){
            Dijkstra.Pair curr=pq.poll();
            if (!vis[curr.node]){
                vis[curr.node]=true;
                count+= curr.dist;
                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e=graph[curr.node].get(i);
                    if(!vis[e.dest]){
                        pq.add(new Dijkstra.Pair(e.dest,e.wt));
                    }
                }
            }
        }
        System.out.println("minimum cost of spanning tree:"+count);
    }

    public static void main(String[] args) {
        int vertices=7;
        ArrayList<Edge> graph[]=new ArrayList[vertices];
        createGraph(graph);
        prims(graph,1);
    }
}
