package Graph;
import java.util.*;
import LinkedList.ProblemLL;


public class MyGraph {
    Map<Integer, LinkedList<Integer>> obj;
    public MyGraph(){
        obj = new HashMap<>();
    }


    public void addEdge(int v1,int v2,boolean isbidirectional){
        LinkedList<Integer> v1neighbour = obj.getOrDefault(v1,new LinkedList<>());
        v1neighbour.add(v2);
        obj.put(v1,v1neighbour);
        if(isbidirectional){
            LinkedList<Integer> v2neighbour = obj.getOrDefault(v2,new LinkedList<>());
            v2neighbour.add(v1);
            obj.put(v2,v2neighbour);
        }
    }
    public void bfsTraversal(int source) {
        Queue<Integer> bfs = new LinkedList<>();
        bfs.add(source);
        Set<Integer> vis = new HashSet<>();
        vis.add(source);
        while (!bfs.isEmpty()) {
            int front = bfs.poll();
            System.out.println(front);
            LinkedList<Integer> neighbourList = obj.get(front);

            for (int res:neighbourList) {
                if(!vis.contains(res)){
                    bfs.add(res);
                    vis.add(res);
                }
            }

        }
    }


    public static void main(String[] args) {
        MyGraph g = new MyGraph();
        Set<Integer> vis = new HashSet<>();
        g.addEdge(0,1,true);
        g.addEdge(0,3,true);
        g.addEdge(0,8,true);
        g.addEdge(1,7,true);
        g.addEdge(2,3,true);
        g.addEdge(2,5,true);
        g.addEdge(2,7,true);
        g.addEdge(3,4,true);
        g.addEdge(4,8,true);
        g.addEdge(5,6,true);



        System.out.println(g.obj);
        g.DFS(0,vis);

//        g.bfsTraversal(5);
//        g.SSSP(3);
    }
//    public void addEdge(int v1,int v2,boolean isbidirectional){
//        ProblemLL v1neighbour = obj.getOrDefault(v1,new ProblemLL());
//        v1neighbour.insertNode(v2);
//        obj.put(v1,v1neighbour);
//        if(isbidirectional){
//            ProblemLL v2neighbour = obj.getOrDefault(v2,new ProblemLL());
//            v2neighbour.insertNode(v1);
//            obj.put(v2,v2neighbour);
//        }
//    }
    public void SSSP(int source){
        Queue<Integer> bfs = new LinkedList<>();
        bfs.add(source);
        Map<Integer,Integer> dis = new HashMap<>();
        for (int res : obj.keySet()) {
            dis.put(res,Integer.MAX_VALUE);
        }
        dis.put(source,0);
        while(!bfs.isEmpty()){
            int front = bfs.poll();
            LinkedList<Integer> neighbourList = obj.get(front);
            for (int neighbour : neighbourList) {
                if(dis.get(neighbour)==Integer.MAX_VALUE){
                    bfs.add(neighbour);
                    int distance = dis.get(front)+1;
                    dis.put(neighbour,distance);
                    System.out.println(front);
                }
            }
        }
    }
    public void DFS(int source,Set<Integer> vis){
        vis.add(source);
        List<Integer> neighbourList = obj.get(source);
        for (int neighbour : neighbourList) {
            if(!vis.contains(neighbour)){
                DFS(neighbour,vis);
            }
        }
        System.out.println(source);
    }

}


