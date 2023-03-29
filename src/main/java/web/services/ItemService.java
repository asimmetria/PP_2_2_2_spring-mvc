package web.services;

import java.util.List;

public interface ItemService<T> {
    public int getAmount();
    public List<T> getCountItems(int count);
}
