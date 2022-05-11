package exercise;

public class CharArray {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'a';
		
		for(int i = 0; i<alphabets.length; i++,ch++) {
			alphabets[i] = ch; //아스키 값으로 각 요소에 저장
		}
		
		for(int i = 0; i<alphabets.length; i++) {
			//System.out.println(alphabets[i] + "," + (int)alphabets[i]);
		} 
		
		char[] Alphabets = new char[26];
		System.arraycopy(alphabets, 0, Alphabets, 0, 26);
		
		for(int i = 0; i<Alphabets.length; i++) {
			 Alphabets[i] -=32;
			 System.out.println(Alphabets[i] + " " + (int)Alphabets[i]);
		}
	}

}
