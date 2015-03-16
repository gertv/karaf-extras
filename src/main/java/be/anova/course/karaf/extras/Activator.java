package be.anova.course.karaf.extras;

import org.osgi.framework.*;
import org.osgi.service.cm.ManagedService;
import org.osgi.service.cm.ManagedServiceFactory;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Bundle activator to register:
 * - a ManagedService implementation
 * - a ManagedServiceFactory implementation
 */
public class Activator implements BundleActivator {

    private ServiceRegistration<ManagedService> registration1;
    private ServiceRegistration<ManagedServiceFactory> registration2;

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        Dictionary<String, String> props = new Hashtable<String, String>();
        props.put(Constants.SERVICE_PID, "be.anova.course.karaf");

        registration1 = bundleContext.registerService(ManagedService.class,
                                                     new ManagedServiceImpl(),
                                                     props);

        registration2 = bundleContext.registerService(ManagedServiceFactory.class,
                                                      new ManagedServiceFactoryImpl(),
                                                      props);
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        registration1.unregister();
        registration2.unregister();
    }
}
