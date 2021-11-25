package Week9;

public class Main {
    public static void main(String[] args) {


        Graph listGraph = new ListGraph(5, true);

        listGraph.addEdge(0,3);
        listGraph.addEdge(0,2);
        listGraph.addEdge(0,1);
        listGraph.addEdge(1,2);
        listGraph.addEdge(2,4);


        Graph matrixGraph = new MatrixGraph(5, false);

        matrixGraph.addEdge(0,3);
        matrixGraph.addEdge(3,0);
        matrixGraph.addEdge(0,2);
        matrixGraph.addEdge(2,0);
        matrixGraph.addEdge(1,2);
        matrixGraph.addEdge(2,1);
        matrixGraph.addEdge(2,4);
        matrixGraph.addEdge(4,2);







    }
}
