package com.example.hp.test;

/**
 * Created by HP on 3/2/2018.
 */

public class UserDetails {
    public String name;
    public String no;
    public String pass;

    public UserDetails(String name, String no,String pass) {
        this.name = name;
        this.no = no;
        this.pass = pass;
    }



    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
