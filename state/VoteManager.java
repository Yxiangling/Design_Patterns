package state;

import java.util.HashMap;
import java.util.Map;

public class VoteManager {
	private VoteState state = null;
	//记录用户的投票结果
	private Map<String,String> mapVote = new HashMap<String,String>();
	//记录用户的投票次数
	private  Map<String,Integer> mapVoteCount = new HashMap<String,Integer>();
	
	public Map<String,String> getMapVote(){
		return mapVote;
	}
	
	public void vote(String user,String VoteItem){
		//为该用户增加投票次数
		//从记录中取出用户已有的投票次数
		
		Integer oldVoteCount = mapVoteCount.get(user);
		
		if(oldVoteCount == null){
			oldVoteCount = 0;
		}
		
		oldVoteCount += 1;
		mapVoteCount.put(user, oldVoteCount);
	
		//判断用户投票类型，判断处于哪个状态
		//到底是正常投票、重复投票、恶意投票还是黑名单
		
		if(oldVoteCount == 1){
			state =  new NormalVoteState();
		}
		else if(oldVoteCount >1 && oldVoteCount <5){
			state = new RepeatVoteState();
		}
		else if(oldVoteCount >= 5 &&oldVoteCount <8){
			state = new SpiteVoteState();
		}
		else if(oldVoteCount > 8){
			state = new BlackVoteState();
		}
		//转调用状态对象进行相关操作
		state.vote(user, VoteItem, this);
	}
	
	
	
}
