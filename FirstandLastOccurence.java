public class FirstandLastCharacter {
	static int first=-1;
	static int last=-1;
	public static void chara(String str,int ind,char element) {
		if(ind==str.length()-1) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char currchar=str.charAt(ind);
		if(currchar == element) {
			if(first==-1) {
				first=ind;
			}
			else {
				last=ind;
			}
		}
		chara(str,ind+1,element);
		
		
	}
public static void main(String args[]) {
	String str="AAAAAABBBBBBCCCCCCDDDD";
	int ind=0;
	char element='A';
	chara(str,ind,element);

}
}

