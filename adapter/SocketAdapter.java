package adapter;

public class SocketAdapter implements DBSocketInteface {//实现旧接口

	//组合新的接口
	private CBSocketInteface cbSocket;
	
	public SocketAdapter(CBSocketInteface cbSocket){
		this.cbSocket = cbSocket;
	}
	
    /** 
     * 将对就接口的调用适配到新接口 
     */  
	@Override
	public void powerWithTwoRound() {
		cbSocket.powerWithThreeFlat();
	}
}
