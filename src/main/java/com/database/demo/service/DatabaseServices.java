package com.database.demo.service;

public interface DatabaseServices {
    public <T> void add(T obj);
    public Object get(int id);
    public void delete(int id);

}
