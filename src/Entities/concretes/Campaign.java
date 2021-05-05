package entities.concretes;

import core.entities.Entity;

public class Campaign implements Entity {
    private int _id;
    private String _campaignName;
    private double _discount;

    public Campaign(int _id, String _campaignName, double _discount) {
        this.set_id(_id);
        this.set_campaignName(_campaignName);
        this.set_discount(_discount);
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_campaignName() {
        return _campaignName;
    }

    public void set_campaignName(String _campaignName) {
        this._campaignName = _campaignName;
    }

    public double get_discount() {
        return _discount;
    }

    public void set_discount(double _discount) {
        this._discount = _discount;
    }
}
