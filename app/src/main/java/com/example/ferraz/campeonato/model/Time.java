package com.example.ferraz.campeonato.model;

import android.media.Image;

public class Time {
    private String nome;
    private Image escudo;
    private String[] escalacao;
    private Jogador jogador;

    public Time() {
    }

    public Time(Jogador jogador) {
        this.jogador = jogador;
    }

    public Time(String nome, Image escudo, String[] escalacao, Jogador jogador) throws Exception {
        this.nome = nome;
        this.escudo = escudo;
        this.escalacao = escalacao;
        try{
            this.setJogador(jogador);
        }catch (Exception e){
            throw new Exception("Não é possível criar um time com um jogador associado a outro time.");
        }


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Image getEscudo() {
        return escudo;
    }

    public void setEscudo(Image escudo) {
        this.escudo = escudo;
    }

    public String[] getEscalacao() {
        return escalacao;
    }

    public void setEscalacao(String[] escalacao) {
        this.escalacao = escalacao;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) throws Exception {
        if (this.jogador != null)
        {
            throw new Exception("Já existe jogador para este time!");
        }
        else if(jogador.hasTeam())
        {
            throw new Exception("Este jogador já está associado a outro time!");
        }
        else
        {
            this.jogador = jogador;
            jogador.setTeam(true);
        }
    }
}
