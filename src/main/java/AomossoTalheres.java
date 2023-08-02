import javax.swing.*;

public interface AomossoTalheres {
    boolean sair = false;
    String nome = JOptionPane.showInputDialog("Qual o nome da comida?");
    int quant = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade?"));
    double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor?"));
    int decisaoAomosso = Integer.parseInt(JOptionPane.showInputDialog("Qual a opção de aomossada?\n"+"1-Nova aomossada\n"+"2- Alterar valor da aomossada\n"+"3- Apagar aomosada\n"+"4- Ver aomossada"+"5- Sair da aomossada"));
}
