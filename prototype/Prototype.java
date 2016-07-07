package prototype;

/**
 * Created by 110 on 2016/7/7.
 */
public class Prototype implements  Cloneable {
    public Prototype clone(){
        Prototype prototype = null;
        try{
            prototype  =(Prototype)super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        return prototype;
    }
}
