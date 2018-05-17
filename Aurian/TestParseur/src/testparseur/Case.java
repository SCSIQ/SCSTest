/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testparseur;

/**
 *
 * @author aurian
 */
public abstract class Case {
    
    private int line;
    private int column;
    private Carte carte;
    
    public Case(int line, int column, Carte carte) {
        this.line = line;
        this.column = column;
        this.carte = carte;
    }
    
    public abstract TypeCase getType();
    
    public int getLine() {
        return line;
    }
    
    public int getColumn() {
        return column;
    }
    
    public void setLine(int line) {
        this.line = line;
    }
    
    public void setColumn(int column) {
        this.column = column;
    }
    
    public Case getRight() {
        return carte.getCase(line, column+1);
    }
    public Case getLeft() {
        return carte.getCase(line, column-1);
    }
    public Case getUpper() {
        return carte.getCase(line+1, column);
    }
    public Case getDown() {
        return carte.getCase(line-1, column);
    }
    
}
