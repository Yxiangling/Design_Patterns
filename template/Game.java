package template;

/**
 * Created by 110 on 2016/7/7.
 */
public abstract class Game {
    abstract void initialize();
    abstract void start();
    abstract void end();

    public final void play(){
        initialize();
        start();
        end();
    }
}
