package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 110 on 2016/7/7.
 */
public class ConcreteIterator implements Iterator{
    private List list = new ArrayList();
    private int cursor = 0;

    public ConcreteIterator(List list){
        this.list = list;
    }

    @Override
    public boolean hasNext(){
        if(cursor == list.size()){
            return false;
        }

        return true;
    }

    @Override
    public Object next(){
        Object obj = null;
        if(this.hasNext()){
            obj = this.list.get(cursor++);
        }
        return obj;
    }
}
