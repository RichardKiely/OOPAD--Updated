package Week9;

public class MatrixGraph extends AbstractGraph {
    //entries in matrix are 1.0 or 0.0
    //1.0 indicates an edge.
    //0.0 indicates no edge
    
    private double[][] matrix;
    
    public MatrixGraph(int nV, boolean direct){
        super(nV, direct);
        matrix = new double[nV][nV];
        for (int row = 0; row < nV; row++)
            for (int col = 0; col < nV; col++)
                    matrix[row][col] = 0.0;        
    }

    public boolean isEdge(int source, int dest) {
        //complete this method
    return true;
    }

    public void addEdge(int s, int d) {
        //complete this method
        // if graph is undirected, insert two edges
        // otherwise, insert just one edge
    }

    public void removeEdge(int s, int d) {
        //complete this method
        // as for insert method

    }
}
