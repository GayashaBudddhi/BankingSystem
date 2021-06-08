package customermoneyservicepublisher;

import org.osgi.framework.BundleActivator; 
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class MoneyServiceActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistation;
	
	public void start(BundleContext context) throws Exception {
		
		
		System.out.println("-------- Publisher - Money Service (by, IT19057248) - Successflly Started -----------------");
		System.out.println("----*******************************************************************************----");
		
		System.out.println("");
		
		MonyServicePublish moneypublisherService = new MonyServicePublishImpl();
		publishServiceRegistation = context.registerService(MonyServicePublish.class.getName(), moneypublisherService, null);
	
		
	}

	public void stop(BundleContext context) throws Exception {
		
		publishServiceRegistation.unregister();
		System.out.println("----******************************************----");
		System.out.println("----******************************************----");
		System.out.println("");
		System.out.println("----THANK YOU FOR MONEY SERVICE STOPPED----");
		System.out.println("");
	}

}
