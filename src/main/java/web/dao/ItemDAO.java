package web.dao;

import web.models.Car;

import java.util.List;

public interface ItemDAO<T> {
    public List<T> getItems();

}
