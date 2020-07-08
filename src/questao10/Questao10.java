package questao10;

import javax.swing.JOptionPane;

public class Questao10 {
    public static void main(String[] args) {
        //Desenvolver um algoritmo que efetue a soma de 
        //todos os números ímpares que são múltiplos de três e 
        //que se encontram no conjunto dos números de 1 até 500.
        int acumuladorimpar, numero;
        acumuladorimpar = 0;
        numero = 0;
        //dados, processamento e saida
        while (numero==1 || numero<=500){
               numero = Integer.parseInt(JOptionPane.showInputDialog("Inserir numero de 1 a 500:\nOu digite 502 para sair. "));
               if (numero % 3 == 0){acumuladorimpar+=numero;
               JOptionPane.showMessageDialog(null, "Soma impares: "+acumuladorimpar);
               }
            if (numero > 502){}
        }
    }
}  
