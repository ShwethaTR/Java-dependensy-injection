package com.mytectra.dependencyinjection.injector;

public class TestInjector {
	
	public static void main(String args[]) {
		
		FaceBookMessageServiceInjector faceBookMessageServiceInjector = new FaceBookMessageServiceInjector();
		faceBookMessageServiceInjector.getMessage1();
		
//		WetsAppMessingServiceInjector wetsAppMessingServiceInjector = new WetsAppMessingServiceInjector();
//		wetsAppMessingServiceInjector.getMessage();
	}

}
