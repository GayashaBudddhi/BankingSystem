package servicepublisher;

import org.osgi.framework.BundleActivator;  
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServiceActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistation;

	
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("-------- Publisher - Initial Accont Service (by, IT19061580) - Successflly Started --------");
		System.out.println("----*******************************************************************************----");
		System.out.println("");
		ServicePublish publisherService = new ServicePublishImpl();
		publishServiceRegistation = context.registerService(ServicePublish.class.getName(), publisherService, null);
	
	}

	public void stop(BundleContext context) throws Exception {
		publishServiceRegistation.unregister();
		System.out.println("----******************************************----");
		System.out.println("----******************************************----");
		System.out.println("");
		System.out.println("----THANK YOU FOR BANKING METHORDS ACCONT SERVICE STOPPED----");
		System.out.println("");
	}

}
