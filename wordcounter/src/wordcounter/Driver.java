package wordcounter;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
	Scanner k=new Scanner(System.in);
	System.out.println("Paragraf�n�z� giriniz.");
	String paragraf=k.nextLine();
	paragraf=paragraf.trim();
	int sayac=0;
	if(paragraf.length()==0) {
		sayac=0;
	}
	else {
	//ilk kelimeyi dahil etmeyec�i i�in onu +1 olarak biz ekliyoruz
	sayac++;	
	for(int i=0; i < paragraf.length(); i++) {
		if(paragraf.charAt(i)== ' ' && 
				paragraf.charAt(i+1)!=' ') {
			sayac++;
			
		}
		
	}
	}
	System.out.println("Kelime say�s�: "+sayac);
	k.close();

	}


}
