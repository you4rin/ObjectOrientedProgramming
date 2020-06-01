package assignment02;

public class PriceList {
	private Oil[][] pricelist;
	private int vertical;
	
	public PriceList() {
		vertical=2;
		pricelist=new Oil[2][2];
	}
	public int getVertical() {return vertical;}
	public void setPriceList(int i,int j,Oil oil) {pricelist[i][j]=oil;}
	public void extendList(int amount) {
		amount+=getVertical();
		Oil[][] temp=new Oil[amount][2];
		for(int i=0;i<vertical;++i) {
			temp[i][0]=pricelist[i][0];
			temp[i][1]=pricelist[i][1];
		}
		pricelist=temp;
		vertical=amount;
	}
	public String getRegionInfo(int i) {
		if(i>=vertical||i<0||pricelist[i][0]==null)return "out of index";
		return pricelist[i][0].toString()+"\n"+pricelist[i][1].toString();
	}
	public void printList() {
		System.out.println("                Gasoline        Diesel");
		System.out.println("=================================================");
		for(int i=0;i<vertical;++i) {
			if(pricelist[i][0]==null)break;
			System.out.printf("Region #%d%15.2f%15.2f\n\n",i+1,pricelist[i][0].getOilPrice(),pricelist[i][1].getOilPrice());
		}
	}
}
