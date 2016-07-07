package prototype;

/**
 * Created by 110 on 2016/7/7.
 */
public class PrototypePatternTest {
    public static void main(String[] args){
        ConcretePrototype cp = new ConcretePrototype();
        for(int i=0; i<10; i++){
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
            clonecp.show();
        }
    }
}
