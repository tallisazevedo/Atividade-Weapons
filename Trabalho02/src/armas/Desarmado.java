/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armas;

/**
 *
 * @author Wel
 */
public class Desarmado extends Arma{
    
    public Desarmado(int dano, double chance) {
        super(dano, chance);
        this.nome = "Desarmado, ";
    }
    
}
