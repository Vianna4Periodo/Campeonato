package com.example.ferraz.campeonato.model;


import android.media.Image;

public class Player {
    private String nome;

    private Time time;

    public Player(String nome, Time time) {
        this.nome = nome;
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean hasTeam(){
        return getTime() != null;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
