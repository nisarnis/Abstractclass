package org.lang;

public class LanguageDetails {
	public void tamilLanguage() {
		System.out.println("TamilLanguage Speaks Chennai,Trichy,Erode...");
	}
	
	public void englishlanguage() {
		System.out.println("Common Language");
	}
	public void hindiLanguage() {
		System.out.println("Hindi Speaks Delhi,rajasthan....");
	}
	public static void main(String[] args) {
		LanguageDetails i=new LanguageDetails();
		i.tamilLanguage();
		i.englishlanguage();
		i.hindiLanguage();
		
	StateDetails go=new StateDetails();
	go.southindia();
	go.northIndia();
	
	
	
	}
	
	

}
