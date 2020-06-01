package assignment03;

public class Candidate implements Comparable {

	private String name;
	private int numVotes = 0;
	private Vote[] votes;
	
	public Candidate(String name,int maxVotes) {
		this.name=name;
		votes=new Vote[maxVotes];
	}
	
	public String toString() {
		return "Name: "+name+"\nTotal Votes: "+numVotes;
	}
	
	public int toRegionString(int regionNum) {
		int regionVotes=0;
		for(int i=0;i<numVotes;++i)if(votes[i].regionNum==regionNum)++regionVotes;
		return regionVotes;
	}
	
	public void callAddVotes(int regionNum) {
		Vote temp=new Vote(regionNum);
		temp.addVote(regionNum);
	}
	
	@Override
	public int compareTo(Object obj) {
		return numVotes-((Candidate)obj).numVotes;
	}
	
	private class Vote {

		private int regionNum;
		
		public Vote(int regionNum) {
			this.regionNum=regionNum;
		}
		
		public synchronized void addVote(int regionNum) {
			votes[numVotes++]=new Vote(regionNum);
		}
	}
}
