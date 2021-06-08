package administratorservicepublisher;

import org.osgi.framework.BundleActivator; 
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class AdministratorServiceActivator implements BundleActivator {

	ServiceRegistration administratorServiceRegistation;
	
	public void start(BundleContext context) throws Exception {
		

		System.out.println("-------- Publisher - Administrator Service (by, IT19098838) - Successflly Started  --------");
		System.out.println("----*******************************************************************************----");
		
		System.out.println("");
		
		AdministratorServicePublish administratorpublisherService = new AdministratorServicepublishImpl();
		administratorServiceRegistation = context.registerService(AdministratorServicePublish.class.getName(), administratorpublisherService, null);
	
		
	}
	
	public void stop(BundleContext context) throws Exception {
		
		administratorServiceRegistation.unregister();
		System.out.println("----******************************************----");
		System.out.println("----******************************************----");
		System.out.println("");
		System.out.println("----THANK YOU FOR BANKING METHORDS ADMINISTRATOR SERVICE STOPPED----");
		System.out.println("");
	}

}
