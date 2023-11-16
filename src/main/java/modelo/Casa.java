/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Casa {
    public String cor;
    public boolean porta1;
    public boolean porta2;

    public Casa(String cor) {
        this.cor = cor;
    }

    public void pintar(String c) {
        this.cor = c;
    }

    public void colocarPorta1(boolean aberta) {
        this.porta1 = aberta;
    }

    public void colocarPorta2(boolean aberta) {
        this.porta2 = aberta;
    }

    public int quantPortasAbertas() {
        int quantAbertas = 0;
        if (porta1) {
            quantAbertas++;
        }
        if (porta2) {
            quantAbertas++;
        }
        return quantAbertas;
    }

}
