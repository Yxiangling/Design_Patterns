package template;

/**
 * Created by 110 on 2016/7/7.
 */
public class BasketBall extends Game{

    @Override
    void end(){
        System.out.println("BasketBall Game Finished!");
    }

    @Override
    void initialize(){
        System.out.println("BasketBall Game Initialized!Start playing!");
    }

    @Override
    void start(){
        System.out.println("BasketBall Game Started!");
    }
}
