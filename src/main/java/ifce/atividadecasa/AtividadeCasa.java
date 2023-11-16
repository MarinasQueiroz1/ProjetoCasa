/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ifce.atividadecasa;
import modelo.Casa;

/**
 *
 * @author Usuario
 */
public class AtividadeCasa {

    public static void main(String[] args) {
        Casa minhaCasa = new Casa("Azul");

        minhaCasa.pintar("Verde");

        minhaCasa.colocarPorta1(true);
        minhaCasa.colocarPorta2(false);

        System.out.println("Número de portas abertas: " + minhaCasa.quantPortasAbertas());
    }
}
    
