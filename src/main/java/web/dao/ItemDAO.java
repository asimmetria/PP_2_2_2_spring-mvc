package web.dao;

import java.util.List;

public interface ItemDAO<T> {
    public List<T> getItems();
}
