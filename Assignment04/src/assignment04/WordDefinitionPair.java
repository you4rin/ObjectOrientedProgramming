package assignment04;

public class WordDefinitionPair {
	private String word;
	private String definition;
	
	public WordDefinitionPair(String word,String definition) {
		setWord(word);
		setDefinition(definition);
	}
	
	String getWord() {return word;}
	void setWord(String word) {this.word=word;}
	String getDefinition() {return definition;}
	void setDefinition(String definition) {this.definition=definition;}
}
