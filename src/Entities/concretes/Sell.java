package entities.concretes;

import core.entities.Entity;

public class Sell implements Entity {
    private int _id;
    private String _gameName;
    private double _gamePrice;

    public Sell(int _id, String _gameName, double _gamePrice) {
        this.set_id(_id);
        this.set_gameName(_gameName);
        this.set_gamePrice(_gamePrice);
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_gameName() {
        return _gameName;
    }

    public void set_gameName(String _gameName) {
        this._gameName = _gameName;
    }

    public double get_gamePrice() {
        return _gamePrice;
    }

    public void set_gamePrice(double _gamePrice) {
        this._gamePrice = _gamePrice;
    }
}
