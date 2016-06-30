package state;

public class RepeatVoteState implements VoteState {
	@Override
	public void vote(String user,String voteItem, VoteManager voteManager){
		System.out.println("不要重复投票");
	}
}
