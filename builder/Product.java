package builder;

import java.util.ArrayList;

public class Product {
	ArrayList<String> parts = new ArrayList<String>();
	
	public void add(String part){
		parts.add(part);
	}
	
	public void show(){
		System.out.println("产品开始创建");
		for(String part:parts){
			System.out.println(part);
		}
	}
}
