package state;

public class SpiteVoteState implements VoteState {
	@Override
	public void vote(String user,String voteItem, VoteManager voteManager){
		String str = voteManager.getMapVote().get(user);
		if(str != null){
			voteManager.getMapVote().remove(user);
		}
		System.out.println("恶意刷屏，取消投票");
	}
}
