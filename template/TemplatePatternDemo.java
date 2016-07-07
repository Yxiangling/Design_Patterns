package template;

/**
 * Created by 110 on 2016/7/7.
 */
public class TemplatePatternDemo {
    public static void main(String[] args){
        Game game = new BasketBall();
        game.play();
        System.out.println();
        game = new FootBall();
        game.play();
    }
}
