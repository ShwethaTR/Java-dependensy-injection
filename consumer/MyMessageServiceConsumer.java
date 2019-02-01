package com.mytectra.dependencyinjection.consumer;

import com.mytectra.dependencyinjection.serviceprovider.MessingService;

public class MyMessageServiceConsumer implements MessageServiceConsumer {
	
	MessingService messingService;
	
	public MyMessageServiceConsumer(MessingService messingService){
		
		
		this.messingService = messingService;	
	
	}
	
	public void getMessage() {
		this.messingService.sendMessage();
	}

}
