import java.util.ArrayList;
import java.util.Objects;

public class AomossoIngredientes implements AomossoUtensilhos{
   String nome;
   int quant;
   double valor;
   ArrayList<AomossoIngredientes> comidas = new ArrayList<>();
   public AomossoIngredientes(String nome, int quant, double valor){
       this.nome = nome;
       this.quant = quant;
       this.valor = valor;
   }
   public AomossoIngredientes(){
       this("",0,0.0);
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AomossoIngredientes that = (AomossoIngredientes) o;
        return quant == that.quant && Double.compare(that.valor, valor) == 0 && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, quant, valor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void alteraPreco(String nome, double novoValor){
       for(AomossoIngredientes f  : comidas){
           if(f.getNome().equals(nome)){
               f.setValor(novoValor);
           }
       }
    }
    public void apagaComida(String nome){
        for(AomossoIngredientes f  : comidas){
            if(f.getNome().equals(nome)){
                comidas.remove(f);
            }
        }
    }
    public ArrayList<AomossoIngredientes> getComidas(){
       return this.comidas;
    }
    @Override
    public String toString(){
       return ("Comida de nome: "+this.nome+"De quantidade: "+this.quant+"De valor"+this.valor);
    }
}
