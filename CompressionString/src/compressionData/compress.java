package compressionData;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;


class compressString implements InterfaceCompress{
	int TempListSize=0;
	int freq=1;
	char colon = ':';
	char coma = ',';
	StringBuilder compressStr= new StringBuilder();
	
	public void compress(String str){
	
		for(int i=0;i<(str.length()-1);i++){
			if(str.charAt(i) == str.charAt(i+1)){
				freq++;
				
			}else{
				compressStr.append(str.charAt(i));
				compressStr.append(colon);
				compressStr.append(freq);
				compressStr.append(coma);
				freq=1;
			}
		}
		
		if(str.charAt(str.length()-2) != str.charAt(str.length()-1)){
			compressStr.append(str.charAt(str.length()-1));
			compressStr.append(colon);
			compressStr.append('1');
		}
	}
	
	public void display(){
		System.out.print(compressStr.toString());
	}
	
	public void unCompress(){
		
	}
}

class simpleCompression implements InterfaceCompress{
	List<Character> termsArr = new ArrayList<Character>() ;
	List<Integer> freqArr = new ArrayList<Integer>();
	int strLenth=0;
	int TempListSize=0;
	
	public void compress(String str){
		strLenth = str.length();
		for(int i=0;i<(str.length()-1);i++){		
			if(str.charAt(i)==str.charAt(i+1)){
				
				if(termsArr.isEmpty()){
					termsArr.add(str.charAt(i));
					freqArr.add(1);
				}
				
				termsArr.set(TempListSize,str.charAt(i));
				freqArr.set(TempListSize, (freqArr.get(TempListSize)+1));
			}else{
				TempListSize++;
				termsArr.add(str.charAt(i+1));
				freqArr.add(1);
			}
		}
	}
	
	public void display(){
		for(int i=0;i<termsArr.size();i++){
			System.out.println(termsArr.get(i)+" -> "+freqArr.get(i));
		}
	}
	
	public void unCompress(){
		for(int i=0;i<termsArr.size();i++){
			for(int j=0;j<freqArr.get(i);j++){
				System.out.print(termsArr.get(i));	
			}
			
		}
		
	}
}

public class compress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceCompress comp = new compressString();
		InterfaceCompress simpleUsingArr = new simpleCompression();
		simpleUsingArr.compress("1112323334445");
		simpleUsingArr.display();
		simpleUsingArr.unCompress();
		
		System.out.println("\nUsing diferent way ");
		comp.compress("1112323334445");
		comp.display();
		
	}

}
