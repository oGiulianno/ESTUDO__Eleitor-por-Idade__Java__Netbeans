/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Giu
 */
public class Eleitor {
        
    //Atributos
    private String nome;
    private int ano_nascimento = 0;
    
    //Metodos

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ano_nascimento
     */
    public int getAno_nascimento() {
        return ano_nascimento;
    }

    /**
     * @param ano_nascimento the ano_nascimento to set
     */
    public void setAno_nascimento(int ano_nascimento) throws Exception {
        if ( ano_nascimento <1900 ) throw new Exception("Ano de Nascimento não pode ser < 1990");
        this.ano_nascimento = ano_nascimento;
    }
    
    //Calculos
    public int calcularIdade() {
    int ano_atual = 2020;
    int valor = (ano_atual - ano_nascimento);
    return valor;
    }
    
    public String calcularTipo() {
        int idade = this.calcularIdade();
        if (idade < 16){
            return "Não eleitor";
        }
        else if (idade <= 16 || idade < 18){
            return "Eleitor Facultativo";
        }
        else if (idade >= 18 || idade < 65){
            return "Eleitor Obrigatorio";
        }
        else if (idade > 65){
            return "Eleitor Facultativo";
        }
        return calcularTipo();
    }
    
    
    
}
