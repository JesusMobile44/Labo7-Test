package Collection;

/**
 * Created by BelSi1731422 on 2018-03-22.
 */
public interface List<T> {
    public void add(T contenu);
    public void add(int index,T contenu);
    public void set(int index, T contenu);
    public T get(int index);
    public int size();
    public void clear();
    public void remove(int index);
}
