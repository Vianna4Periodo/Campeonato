package com.example.ferraz.campeonato.model;

public class Jogo {
    private Time timeA;
    private Time timeB;
    private int placarTimeA;
    private int placarTimeB;

    public Jogo(Time timeA, Time timeB, int placarTimeA, int placarTimeB) {
        this.timeA = timeA;
        this.timeB = timeB;
        this.placarTimeA = placarTimeA;
        this.placarTimeB = placarTimeB;
    }

    public Jogo(Time timeA, Time timeB) {
        this.timeA = timeA;
        this.timeB = timeB;
    }

    public Jogo() {
    }

    public Time getTimeA() {
        return timeA;
    }

    public void setTimeA(Time timeA) {
        this.timeA = timeA;
    }

    public Time getTimeB() {
        return timeB;
    }

    public void setTimeB(Time timeB) {
        this.timeB = timeB;
    }

    public int getPlacarTimeA() {
        return placarTimeA;
    }

    public void setPlacarTimeA(int placarTimeA) {
        this.placarTimeA = placarTimeA;
    }

    public int getPlacarTimeB() {
        return placarTimeB;
    }

    public void setPlacarTimeB(int placarTimeB) {
        this.placarTimeB = placarTimeB;
    }


}
