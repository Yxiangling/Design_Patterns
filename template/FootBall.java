package template;

/**
 * Created by 110 on 2016/7/7.
 */
public class FootBall extends Game {
    @Override
    void end(){
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize(){
        System.out.println("Football Game Initialized!Start playing!");
    }

    @Override
    void start(){
        System.out.println("Football Game Started!");
    }
}
