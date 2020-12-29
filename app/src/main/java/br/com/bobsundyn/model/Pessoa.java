package br.com.bobsundyn.model;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Pessoa {

    public String nome, endereco, cpf;
    public int idade;
    public double peso, altura;

    public Pessoa(){
        nome = "Sem nome";
        endereco = "Não cadastrado";
        cpf = "000.000.000-00";
    }

    public Pessoa(String nome) {
        this.nome = nome;
        endereco = "Não cadastrado";
        cpf = "000.000.000-00";
    }

    

    public Pessoa(String nome, String endereco, String cpf, int idade, double peso, double altura){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularImc() {
        double imc = peso / (altura * altura);
        return imc;
    }

    public String classificarImc() {
        String classificacao;
        if (calcularImc() < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (calcularImc() < 25) {
            classificacao = "Peso normal";
        } else if (calcularImc() < 30) {
            classificacao = "Sobrepeso";
        } else if (calcularImc() < 35) {
            classificacao = "Obesidade grau 1";
        } else if (calcularImc() < 40) {
            classificacao = "Obesidade grau 2";
        } else {
            classificacao = "Obesidade grau 3";
        }
        return classificacao;
    }

    public void falar(String texto, AppCompatActivity activity) {
        Toast.makeText(activity, nome + " diz:\n- " + texto, Toast.LENGTH_SHORT).show();
    }

}
