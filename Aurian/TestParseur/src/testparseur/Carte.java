/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testparseur;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author aurian
 */
public class Carte {
    
    private HashMap<String,Case> hashListeCases;
    private ArrayList<Case> listeCases;
    private Case start;
    private Case exit;
    private Graph graphe_simple;
    
    public Carte() {
        listeCases = new ArrayList<Case>();
        hashListeCases = new HashMap<>();
        graphe_simple = null;
    }
    
    public void setCase(Case _case) {
        String s = _case.getLine()+"/"+_case.getColumn();
        this.hashListeCases.put(s,_case);
        this.listeCases.add(_case);
    }
    
    public Case getStart() {
        return start;
    }

    public Case getExit() {
        return exit;
    }

    public void setStart(Case start) {
        this.start = start;
    }

    public void setExit(Case exit) {
        this.exit = exit;
    }
    
    public Case getCase(int line,int column) {
        String s = line+"/"+column;
        return this.hashListeCases.get(s);
    }
    
    @Override
    public String toString() {
        String s = "";
        for(Case c : listeCases) {
            s += "Case de coo : "+c.getLine()+"/"+c.getColumn()+"\n";
            //c.toString();
        }
        return s;
    }
    
    public void genererGrapheSimple() {
        graphe_simple =  new Graph(this);
        for(Case c : listeCases) {
            graphe_simple.addVertex(c);
        }
        findNeighboursGraphSimple();
    }
    
    private void findNeighboursGraphSimple() {
        for(Case c : listeCases) {
            Case neighbourRight = c.getRight();
            genererNeighboursGraphSimple(neighbourRight, c);
            Case neighbourLeft = c.getLeft();
            genererNeighboursGraphSimple(neighbourLeft, c);
            Case neighbourUpper = c.getUpper();
            genererNeighboursGraphSimple(neighbourUpper, c);
            Case neighbourDown = c.getDown();
            genererNeighboursGraphSimple(neighbourDown, c);            
        }
    }
    
    private void genererNeighboursGraphSimple(Case neighbour,Case current) {
        if (neighbour != null) {
                graphe_simple.getVertex(current).addNeighbour(graphe_simple.getVertex(neighbour));
                graphe_simple.setLabel(current, neighbour, 1);
            }
    }
    
    public String stringMatrix() {
        String m = "Matrix :\n";
        for(Case c1 : listeCases) {
            for(Case c2 : listeCases) {
                if(graphe_simple.getLabel(c1, c2) != null) {
                    m += graphe_simple.getLabel(c1, c2)+" ";
                }
                else {
                    m += "0 ";
                }
            }
            m += "\n";
        }
        return m;
    }
    
}
