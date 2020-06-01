package assignment02;

import java.util.Scanner;;

public class PriceListApp {
	public static void main(String args[]) {
		Scanner keyboard=new Scanner(System.in);
		PriceList pricelist=new PriceList();
		String company;
		int enter,amount,price,idx=0;
		boolean end=false;
		do{
			System.out.println("================Main Menu================");
			System.out.println("(1) Add a oil to price list");
			System.out.println("(2) View Region Information");
			System.out.println("(3) Print the entire price list");
			System.out.println("(4) Exit the program");
			System.out.println("=========================================");
			System.out.print("choose a menu : ");
			enter=keyboard.nextInt();
			switch(enter) {
			case 1:
				try {
					if(!pricelist.getRegionInfo(pricelist.getVertical()-1).equals("out of index"))throw new FullArrayException(); 
					for(int i=0;i<pricelist.getVertical();++i) {
						if(pricelist.getRegionInfo(i).equals("out of index")) {
							idx=i;
							break;
						}
					}
				}catch(FullArrayException e) {
					idx=pricelist.getVertical();
					amount=keyboard.nextInt();
					pricelist.extendList(amount);
					System.out.println("list is extended\n");
				}finally {
					System.out.print("company : ");
					company=keyboard.next();
					System.out.print("supply price : ");
					price=keyboard.nextInt();
					pricelist.setPriceList(idx,0,new Gasoline(company,price));
					System.out.println("gasoline added\n");
					
					System.out.print("company : ");
					company=keyboard.next();
					System.out.print("supply price : ");
					price=keyboard.nextInt();
					pricelist.setPriceList(idx,1,new Diesel(company,price));
					System.out.println("diesel added\n");
				}
				break;
			case 2:
				System.out.print("region number to view : ");
				idx=keyboard.nextInt();
				System.out.println(pricelist.getRegionInfo(idx-1));
				break;
			case 3:
				pricelist.printList();
				break;
			case 4:
				end=true;
				break;
			default:
				System.out.println("Insert 1 ~ 4");
			}
			
		}while(!end);
		System.out.println("Exit application");
	}
}
