package Graph;

public class adjacencyMatrix {
    int vertex;
    int matrix[][];

    public adjacencyMatrix(int vertex){
        this.vertex=vertex;
        matrix= new int[vertex][vertex];
    }

    public void addEdge(int source,int destination){
        matrix[source][destination]=1;
        matrix[destination][source]=1;
    }

    public void printMatrix(){
        for (int i = 1; i < vertex; i++) {
            for (int j = 1; j < vertex; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 1; i < vertex; i++) {
            System.out.print("Vertex " + i + " is connected to:");
            for (int j = 1; j <vertex ; j++) {
                if(matrix[i][j]==1){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        adjacencyMatrix obj = new adjacencyMatrix(6);
        obj.addEdge(1,2);
        obj.addEdge(2,3);
        obj.addEdge(3,4);
        obj.addEdge(4,5);
        obj.addEdge(5,1);
        obj.printMatrix();
    }
}
