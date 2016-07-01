package builder;

public class Client {
    public static void main(String[] args){
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilderB();
        
        director.Construct(b1);
        Product p1 = b1.getProduct();
        p1.show();
        
        
        director.Construct(b2);
        Product p2 = b2.getProduct();
        p2.show();
    }
}
