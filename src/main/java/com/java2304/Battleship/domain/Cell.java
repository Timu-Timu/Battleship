package com.java2304.Battleship.domain;

public class Cell {
    private Long id;
    private int x;
    private int y;
    private CellStatus status;
    private CellDeck deck;
    private Game game;


    public Cell() {
    }

    public Cell(Long id, int x, int y, CellStatus status, CellDeck deck, Game game) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.status = status;
        this.deck = deck;
        this.game = game;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public CellStatus getStatus() {
        return status;
    }

    public void setStatus(CellStatus status) {
        this.status = status;
    }

    public CellDeck getDeck() {
        return deck;
    }

    public void setDeck(CellDeck deck) {
        this.deck = deck;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }


    @Override
    public String toString() {
        return "Cell{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                ", status=" + status +
                ", deck=" + deck +
                ", game=" + game +
                '}';
    }

}
