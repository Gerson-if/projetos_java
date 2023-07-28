
package herança1;
public class Professor extends Pessoa {
    private String sala;
    private String Especialidade;
    private float salario;
    
    public void receberAumento(){
        System.out.println("recebendo aumento");
    
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String Especialidade) {
        this.Especialidade = Especialidade;
    }



    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
