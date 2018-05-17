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
public class CaseMur extends Case {

    public CaseMur(int line, int column, Carte carte) {
        super(line, column, carte);
    }

    @Override
    public TypeCase getType() {
        return TypeCase.Mur;
    }
    
}
