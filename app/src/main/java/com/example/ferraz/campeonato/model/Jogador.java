package com.example.ferraz.campeonato.model;


import android.media.Image;

public class Jogador {
    private String nome;
    private Image foto;
    private int pontuacao;
    private boolean Team;

    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
        this.Team = false;
    }

    public Jogador() {
        this.pontuacao = 0;
        this.Team = false;
    }

    public boolean hasTeam() {
        return Team;
    }

    public void setTeam(boolean team) {
        Team = team;
    }

}
