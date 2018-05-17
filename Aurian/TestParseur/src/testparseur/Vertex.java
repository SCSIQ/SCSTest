/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testparseur;

import java.util.ArrayList;

/**
 *
 * @author aurian
 */
public class Vertex {
    
    private final ArrayList<Vertex> neighbours;
    private final Graph graph;
    
    public Vertex(Graph g) {
        neighbours = new ArrayList();
        graph = g;
    }
    
    public ArrayList<Vertex> getNeighbours() {
        return neighbours;
    }
    

    public void addNeighbour(Vertex v) {
        neighbours.add(v);
    }
    
}
