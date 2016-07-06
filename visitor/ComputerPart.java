package visitor;

/**
 * Created by 110 on 2016/7/6.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor compurterPartVisitor);
}
