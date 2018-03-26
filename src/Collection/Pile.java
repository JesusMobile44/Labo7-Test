package Collection;

import Collection.LinkedList;

/**
 * Created by BelSi1731422 on 2018-03-22.
 */
public class Pile<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void push(T contenu){
        list.add(contenu);
    }
    public T pop(){
        T last = list.get(list.size()-1);
        list.remove(list.size()-1);
        return last;
    }
    public T peek(){
        return list.get(list.size()-1);
    }
    public void clear(){
        list.clear();
    }
    public int size(){
        return list.size();
    }
}
