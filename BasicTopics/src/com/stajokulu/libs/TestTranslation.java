package com.stajokulu.libs;

import java.util.Arrays;

import com.google.api.services.translate.Translate;
import com.google.api.services.translate.model.TranslationsListResponse;
import com.google.api.services.translate.model.TranslationsResource;


public class TestTranslation {

	public static void main(String[] args) {
	      try {           
	            // See comments on 
	            //   https://developers.google.com/resources/api-libraries/documentation/translate/v2/java/latest/
	            // on options to set
	            Translate t = new Translate.Builder(
	                    com.google.api.client.googleapis.javanet.GoogleNetHttpTransport.newTrustedTransport()
	                    , com.google.api.client.json.gson.GsonFactory.getDefaultInstance(), null)                                   
	                    //Need to update this to your App-Name
	                    .setApplicationName("Staj Okulu Sample")                    
	                    .build();           
	            Translate.Translations.List list = t.new Translations().list(
	                    Arrays.asList(
	                            //Pass in list of strings to be translated
	                            "مرحبا",
	                            "Is it possible to learn java in two days ?"), 
	                        //Target language   
	                        "TR");  
	            //Set your API-Key from https://console.developers.google.com/
	            list.setKey("AIzaSyAnKzVnbdTOKe6bImh0TkRsEp2mpTXs90o");
	            TranslationsListResponse response = list.execute();
	            for(TranslationsResource tr : response.getTranslations()) {
	                System.out.println(tr.getTranslatedText());
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
	
}
