package visitor;

/**
 * Created by 110 on 2016/7/6.
 */
public class VisitPatternDemo {
    public static void main(String[] args){
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
