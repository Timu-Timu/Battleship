package com.java2304.Battleship.domain;

import java.util.Date;

public class Game {
    Long id;
    Player firstPlayer;
    Player secondPlayer;
    Date date;

    public Game() {
    }

    public Game(Player firstPlayer, Player secondPlayer, Date date) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Player getFirstPlayer() {
        return firstPlayer;
    }

    public void setFirstPlayer(Player firstPlayer) {
        this.firstPlayer = firstPlayer;
    }

    public Player getSecondPlayer() {
        return secondPlayer;
    }

    public void setSecondPlayer(Player secondPlayer) {
        this.secondPlayer = secondPlayer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", firstPlayer=" + firstPlayer +
                ", secondPlayer=" + secondPlayer +
                ", date=" + date +
                '}';
    }
}
