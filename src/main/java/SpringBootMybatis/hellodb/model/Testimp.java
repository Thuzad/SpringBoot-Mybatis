package SpringBootMybatis.hellodb.model;

public class Testimp {

	int id;
	int freq;
	String word;

	@Override
	public String toString(){
		return "testimp [id = " + id  + ", freq = " + freq + ", word = " + word + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFreq() {
		return freq;
	}

	public void setFreq(int freq) {
		this.freq = freq;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

}
