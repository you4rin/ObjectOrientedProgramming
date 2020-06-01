package assignment03;

public class Region extends Thread{

	private String regionName;			// The name of the region
	private int regionNum;			// The number of the region
	private int population;			// The population of the region
	private Candidate[] candidates;	// An array of the candidates of the election
	
	public Region(String regionName,int regionNum,int population,Candidate[] candidates) {
		this.regionName=regionName;
		this.regionNum=regionNum;
		this.population=population;
		this.candidates=new Candidate[candidates.length];
		for(int i=0;i<candidates.length;++i)this.candidates[i]=candidates[i];
	}
	
	public String getRegionName() {
		return regionName;
	}
	
	public int getRegionNum() {
		return regionNum;
	}
	
	public void generateVotes() {
		for(int i=0;i<population;++i) {
			int toVote=(int)(Math.random()*candidates.length);
			candidates[toVote].callAddVotes(regionNum);
		}
	}
	
	public void run() {
		generateVotes();
	}
}
