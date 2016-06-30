package builder;

public class ConcreteBuilder1 extends Builder{
	private Product product = new Product();	
	
	public Product getProduct(){
		return product;
	}

	@Override
	public void BuildPartA() {
		product.add("部件A");		
	}

	@Override
	public void BuildPartB() {
		product.add("部件B");		
	}
}
