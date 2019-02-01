package com.mytectra.dependencyinjection.injector;

import com.mytectra.dependencyinjection.consumer.MessageServiceConsumer;
import com.mytectra.dependencyinjection.consumer.MyMessageServiceConsumer;
import com.mytectra.dependencyinjection.serviceprovider.FaceBookMessingServiceImp;

public class FaceBookMessageServiceInjector implements MessageServiceInjector {
	

	

	@Override
	public MessageServiceConsumer getMessage1() {
		
		MyMessageServiceConsumer myMessageServiceConsumer = new MyMessageServiceConsumer (new FaceBookMessingServiceImp());
		myMessageServiceConsumer.getMessage();
		return myMessageServiceConsumer;
	}

}
