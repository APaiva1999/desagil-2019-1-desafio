package br.pro.hashi.ensino.desagil.desafio.model;

import br.pro.hashi.ensino.desagil.desafio.model.Board;
import br.pro.hashi.ensino.desagil.desafio.model.Element;
import br.pro.hashi.ensino.desagil.desafio.model.Model;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Map;

public abstract class Player extends Element {
    protected final Board board;

    protected Player(int row, int col, Board board) {
        super(row, col);
        this.board = board;
    }

    protected void move(int rowShift, int colShift) {
        row += rowShift;
        col += colShift;
    }
}