package iterator;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 110 on 2016/7/7.
 */
public class ConcreteAggregate implements Aggregate{
    private List list = new ArrayList();
    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(list);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }
}
