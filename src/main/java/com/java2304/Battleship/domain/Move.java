package com.java2304.Battleship.domain;

import com.java2304.Battleship.enums.MoveResult;

import java.util.Date;

public class Move {
    private Long id;
    private Player player;
    private int x;
    private int y;
    private MoveResult result;
    private Game game;
    private Date date;

    public Move() {
    }

    public Move(Player player, int x, int y, MoveResult result, Game game, Date date) {
        this.player = player;
        this.x = x;
        this.y = y;
        this.result = result;
        this.game = game;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Move{" +
                "id=" + id +
                ", player=" + player +
                ", x=" + x +
                ", y=" + y +
                ", result=" + result +
                ", game=" + game +
                ", date=" + date +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public MoveResult getResult() {
        return result;
    }

    public void setResult(MoveResult result) {
        this.result = result;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
