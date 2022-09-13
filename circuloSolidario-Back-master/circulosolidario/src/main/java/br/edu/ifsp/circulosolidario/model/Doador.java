package br.edu.ifsp.circulosolidario.model;

public class Doador {
    private String nome, email, senha;
    private int id;
    private static int idCounter = 0;

    public Doador() {
        this.id = ++Doador.idCounter;
    }

    public Doador(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.id = ++Doador.idCounter;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

}
