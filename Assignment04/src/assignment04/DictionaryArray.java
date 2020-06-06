package assignment04;

import java.util.ArrayList;
import java.util.Iterator;

public class DictionaryArray implements Dictionary {
	private ArrayList<WordDefinitionPair> DicList;
	
	public DictionaryArray() {
		DicList=new ArrayList<WordDefinitionPair>();
	}
	
	public ArrayList<WordDefinitionPair> getDicList(){
		return new ArrayList<WordDefinitionPair>(DicList);
	}
	
	public boolean isEmpty() {return DicList.isEmpty();}
	public void insertEntry(String word, String definition) throws AlreadyExistsInDicException{
		for(Iterator<WordDefinitionPair>myIterator=DicList.iterator();myIterator.hasNext();) {
			if(myIterator.next().getWord().contentEquals(word))throw new AlreadyExistsInDicException();
		}
		DicList.add(new WordDefinitionPair(word,definition));
	}
	
	public void getDefinition(String word) throws EmptyException, NotInDicException{
		if(DicList.isEmpty())throw new EmptyException();
		for(int i=0;i<DicList.size();++i) {
			if(DicList.get(i).getWord().equals(word)) {
				System.out.println(word+" mean : "+DicList.get(i).getDefinition());
				return;
			}
		}
		throw new NotInDicException();
	}
	
	public void removeWord(String word) throws EmptyException, NotInDicException{
		if(DicList.isEmpty())throw new EmptyException();
		for(int i=0;i<DicList.size();++i) {
			if(DicList.get(i).getWord().equals(word)) {
				DicList.remove(i);
				return;
			}
		}
		throw new NotInDicException();
	}
	
	public void printWords() throws EmptyException{
		if(DicList.isEmpty())throw new EmptyException();
		for(int i=0;i<DicList.size();++i)System.out.println((i+1)+". "+DicList.get(i).getWord());
	}
	
	public void printAll() throws EmptyException{
		if(DicList.isEmpty())throw new EmptyException();
		for(int i=0;i<DicList.size();++i) {
			System.out.println("******************************************");
			System.out.println("Word : "+DicList.get(i).getWord());
			System.out.println("Definition : "+DicList.get(i).getDefinition());
		}
	}
}
