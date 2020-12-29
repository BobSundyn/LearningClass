package br.com.bobsundyn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import br.com.bobsundyn.model.Pessoa;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pessoa professor = new Pessoa("Carlos", "São Leopoldo", "123.456.789-01", 33, 95.02, 1.83);

        Toast.makeText(this, "Nome: " + professor.nome, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Idade: " + professor.idade , Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Peso: " + professor.peso, Toast.LENGTH_SHORT).show();

        professor.nome = "Carlos";
        professor.idade = 33;
        professor.endereco = "São Leopoldo";
        professor.altura = 1.83;
        professor.peso = 92.4;
        professor.cpf = "123.456.789-10";

        Pessoa aluno = new Pessoa();
        aluno.nome = "Robert";
        aluno.idade = 26;
        aluno.endereco = "Porto Alegre";
        aluno.altura = 1.73;
        aluno.peso = 95.0;
        aluno.cpf = "987.654.321-01";

        professor.falar("Sejam bem vindos a nossa aula!", this);
        aluno.falar("Naniiii!!", this);

        Toast.makeText(this, "O professor é o " + professor.nome, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "O aluno destaque é o " + aluno.nome, Toast.LENGTH_SHORT).show();

        if (aluno.idade >= 18) {
            Toast.makeText(this, "Aluno é maior de idade!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Aluno é menor de idade!", Toast.LENGTH_SHORT).show();
        }

        Toast.makeText(this, "IMC do professor é " + professor.calcularImc(), Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Classificação do professor: " + professor.classificarImc(), Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "IMC do aluno é " + aluno.calcularImc(), Toast.LENGTH_SHORT).show();
    }
}