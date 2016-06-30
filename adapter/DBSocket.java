package adapter;

//德国标准插座

public class DBSocket implements DBSocketInteface {

	@Override
	public void powerWithTwoRound() {
		System.out.println("使用两项圆头的插孔供电"); 
	}

}
