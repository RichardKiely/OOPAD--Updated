package Week9;

public abstract class AbstractGraph implements Graph {
    private int numVertices;
    private boolean directed;
       
    public AbstractGraph(int nV, boolean direct){
        numVertices = nV;
        directed = direct;      
    }

    public int getNumVertices() {
        return numVertices;
    }

    public boolean isDirected() {
        return directed;
    }  

    public void breadthFirstTraversal(int start){
	//Output the vertices in breadth first order
    }
    
    public void depthFirstTraversal(int start){
        //Output the vertices in depth first order
    }      
}
