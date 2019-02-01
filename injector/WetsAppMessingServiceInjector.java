package com.mytectra.dependencyinjection.injector;

import com.mytectra.dependencyinjection.consumer.MessageServiceConsumer;
import com.mytectra.dependencyinjection.consumer.MyMessageServiceConsumer;
import com.mytectra.dependencyinjection.serviceprovider.FaceBookMessingServiceImp;
import com.mytectra.dependencyinjection.serviceprovider.WetsAppMessingServiceImp;

public class WetsAppMessingServiceInjector implements MessageServiceInjector{

	@Override
	public MessageServiceConsumer getMessage1() {
		
		MyMessageServiceConsumer myMessageServiceConsumer = new MyMessageServiceConsumer (new WetsAppMessingServiceImp());
		return myMessageServiceConsumer;
	}

}
