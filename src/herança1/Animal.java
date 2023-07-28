
package herança1;
public class Animal {
    private String nome;
    private String cor;
    private float Peso;
    private float tamanho;
    private boolean AguaDoce;
    
    public boolean nadar( boolean nadar){
    
      return nadar;
    }
    public void comer(){
    }
    
    
    
    public void setNome(String nome){
       this.nome = nome;
       
    }
    public String getNome(){
    
     return this.nome;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPeso() {
        return this.Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public float getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isAguaDoce() {
        return this.AguaDoce;
    }

    public void setAguaDoce(boolean AguaDoce) {
        this.AguaDoce = AguaDoce;
    }
    
    
}
