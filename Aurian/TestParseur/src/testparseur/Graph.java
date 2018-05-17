/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testparseur;

import java.util.HashMap;
import java.util.Map;
import javafx.util.Pair;

/**
 *
 * @author aurian
 */
public class Graph {
    
    private final Carte map;
    private final HashMap<Case,Vertex> vertices;
    private final HashMap<Pair<Vertex,Vertex>,Integer> labels;
    
    public Graph(Carte m) {
        map = m;
        vertices = new HashMap<>();
        labels = new HashMap<>();
    }    
    
    public void addVertex(Case _case) {
        vertices.put(_case,new Vertex(this));
    }
    
    public void addEdge(Case case1, Case case2) {
        vertices.get(case1).addNeighbour(vertices.get(case2));      
    }
    
    public Vertex getVertex(Case _case) {
        return vertices.get(_case);
    }
    
    public Integer getLabel(Case case1,Case case2) {
        return labels.get(new Pair(vertices.get(case1),vertices.get(case2)));
    }
    
    public void setLabel(Case case1,Case case2,Integer label) {
        labels.put(new Pair(vertices.get(case1),vertices.get(case2)),label);
    }
    
}
