package com.expertsystem.lab.utils;


import com.memetix.mst.language.Language;
import com.memetix.mst.translate.Translate;


public class MSTranslatorClient {
	
	protected static final String CLIENT_ID = "pied-piper";
	protected static final String CLIENT_SECRET = "Richard Hendriks";	
	
	protected Language inputLanguage;
	protected Language outputLanguage;
	
	protected String inputText;
	protected String outputText;
	
	
	public MSTranslatorClient() {
		 Translate.setClientId(CLIENT_ID);
		 Translate.setClientSecret(CLIENT_SECRET);
		 inputText = new String();
		 outputText = new String();
	}

	public Language getInputLanguage() {
		return inputLanguage;
	}

	public void setInputLanguage(Language inputLanguage) {
		this.inputLanguage = inputLanguage;
	}

	public Language getOutputLanguage() {
		return outputLanguage;
	}
	
	public void setOutputLanguage(Language outputLanguage) {
		this.outputLanguage = outputLanguage;
	}

	public String getInputText() {
		return inputText;
	}

	public void setInputText(String inputText) {
		this.inputText = inputText;
	}

	public String getOutputText() {
		return outputText;
	}

	public void setOutputText(String outputText) {
		this.outputText = outputText;
	}

	public void translate() throws Exception {
		outputText = Translate.execute(inputText, inputLanguage, outputLanguage );
	}
	
	
	public static void main(String[] args) throws Exception {
		
		MSTranslatorClient msClient = new MSTranslatorClient();
		msClient.setInputLanguage(Language.ITALIAN);
		msClient.setOutputLanguage(Language.SPANISH);
		
		msClient.setInputText("Dissidenti in armonia in peace and love peace persone insieme e fondato per la memoria perpetua");
		
		msClient.translate();
		
		System.out.println(msClient.getOutputText());
	}







}
