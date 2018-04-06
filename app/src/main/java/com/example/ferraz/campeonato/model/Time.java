package com.example.ferraz.campeonato.model;

import java.util.ArrayList;

public class Time {
    private String nome;
    private ArrayList<Jogador> escalacao;
    private Player player;

    public Time(String nome)
    {
        this.nome = nome;
    }

    //falta implementar
    public int getPontuacao(){return 0;}



    public void setJogador(Player player) throws Exception {
        if (this.player != null)
        {
            throw new Exception("Já existe player para este time!");
        }
        else if(player.hasTeam())
        {
            throw new Exception("Este player já está associado a outro time!");
        }
        else
        {
            this.player = player;
        }
    }
}
