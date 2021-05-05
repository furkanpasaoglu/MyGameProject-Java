package entities.concretes;

import core.entities.Entity;

import java.util.Date;

public class User implements Entity {
    private int _id;
    private String _firstName;
    private String _lastName;
    private String _nationalIdentity;
    private Date _dateOfBirth;
    private String _userName;
    private String _password;

    public User(int _id, String _firstName, String _lastName, String _nationalIdentity, Date _dateOfBirth, String _userName, String _password) {
        this.set_id(_id);
        this.set_firstName(_firstName);
        this.set_lastName(_lastName);
        this.set_nationalIdentity(_nationalIdentity);
        this.set_dateOfBirth(_dateOfBirth);
        this.set_userName(_userName);
        this.set_password(_password);
    }


    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_firstName() {
        return _firstName;
    }

    public void set_firstName(String _firstName) {
        this._firstName = _firstName;
    }

    public String get_lastName() {
        return _lastName;
    }

    public void set_lastName(String _lastName) {
        this._lastName = _lastName;
    }

    public String get_nationalIdentity() {
        return _nationalIdentity;
    }

    public void set_nationalIdentity(String _nationalIdentity) {
        this._nationalIdentity = _nationalIdentity;
    }

    public Date get_dateOfBirth() {
        return _dateOfBirth;
    }

    public void set_dateOfBirth(Date _dateOfBirth) {
        this._dateOfBirth = _dateOfBirth;
    }

    public String get_userName() {
        return _userName;
    }

    public void set_userName(String _userName) {
        this._userName = _userName;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }
}
