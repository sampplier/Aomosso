import javax.swing.*;

public class Aomosso implements AomossoTalheres {
    public static void main(String[] args){
        boolean sair = false;
        AomossoIngredientes sistema = new AomossoIngredientes();
        JOptionPane.showMessageDialog(null, "Bom dia, já tá podendo aomossar?");
        JOptionPane.showMessageDialog(null,"Monte seu prato colega");
        while(!sair){
            int decisaoAomosso = Integer.parseInt(JOptionPane.showInputDialog("Qual a opção de aomossada?\n"+"1-Nova aomossada\n"+"2- Alterar valor da aomossada\n"+"3- Apagar aomosada\n"+"4- Ver aomossada"+"5- Sair da aomossada"));
            switch (decisaoAomosso) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Qual o nome da comida?");
                    int quant = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade?"));
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor?"));
                    AomossoIngredientes a = new AomossoIngredientes(nome, quant, valor);
                    sistema.getComidas().add(a);
                    JOptionPane.showMessageDialog(null, "Aomossado com sucesso");
                    break;
                case 2:
                    nome = JOptionPane.showInputDialog("Qual o nome da comida?");
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o novo valor?"));
                    sistema.alteraPreco(nome, valor);
                    JOptionPane.showMessageDialog(null, "Aomossado com sucesso");
                    break;
                case 3:
                    nome = JOptionPane.showInputDialog("Qual o nome da comida?");
                    sistema.apagaComida(nome);
                    JOptionPane.showMessageDialog(null, "Aomossado com sucesso");
                    break;
                case 4:
                    nome = JOptionPane.showInputDialog("Qual o nome da comida?");
                    for(AomossoIngredientes f : sistema.getComidas()){
                        if(f.getNome().equals(nome)){
                            JOptionPane.showMessageDialog(null, f.toString());
                        }
                    }
                    break;
                case 5:
                    sair = true;
                    break;
            }
        }
    }
}
