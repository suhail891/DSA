public class Graph_Implementaion_BFS_DFS_Traversal{
  static class  Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
  // graph representaion in memory
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));


        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));


        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));
    }
  //breath first search
    public static void BFS(ArrayList<Edge> graph[], int star){
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[graph.length];
        q.add(star);
        visited[star]=true;//marked as visited
        while(!q.isEmpty()){
            int curr=q.poll();
            System.out.print(curr+" ");
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e=graph[curr].get(i);//access the neighbour of current vertex
                if (!visited[e.dest]){
                    q.add(e.dest);
                    visited[e.dest]=true;
                }
            }
        }
    }
  //depth first search 
    public static void DFS(ArrayList<Edge> graph[], int curr,boolean visited[]){
        System.out.print(curr+" ");
        visited[curr]=true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e=graph[curr].get(i);
            if(!visited[e.dest]){
                DFS(graph,e.dest,visited);// calling in case vertex is not already visited
            }
        }
    }
    public static void main(String[] args) {
        int vertices=7;
        ArrayList<Edge> graph[] = new ArrayList[vertices];
        createGraph(graph);
        System.out.println("Breath first search traversal of graph");
        BFS(graph, 0);
        System.out.println("\n depth first search traversal of graph");
        boolean[] visited=new boolean[vertices];
        DFS(graph,0,visited);
    }
}
