package Week9;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListGraph extends AbstractGraph {
    private ArrayList<LinkedList<Integer>> adjacencyLists;

    public ListGraph(int nV, boolean direct){
        super(nV, direct);
        adjacencyLists = new ArrayList<>(nV);
        for (int i= 0;i < nV; i++) {
            adjacencyLists.add(new LinkedList<>());
        }
    }

    // In code below, s represents source of an edge and d represents destination of an edge
    // e.g. if (2, 3) is an edge, 2 is the source and 3 is the destination

    @Override
    public boolean isEdge(int s, int d) {
        // get LinkedList at index s of adjacencyLists
        //check if it contains dest
        return false; 
    }

    @Override
    public void addEdge(int s, int d) {
        //complete this method
        // if graph is undirected, insert two edges

        // otherwise, insert just one edge
        
        // first validate s and d to ensure code is robust
        
        //LinkedList<Integer> list =  adjacencyLists.get(s);
        //list.add(d);


        adjacencyLists.get(s).add(d);

        //complete this method

    }

    @Override
    public void removeEdge(int s, int d) {

    }
}
