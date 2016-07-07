package iterator;

/**
 * Created by 110 on 2016/7/7.
 */
public interface Aggregate {
    public void add(Object obj);
    public void remove(Object obj);
    public Iterator iterator();
}
