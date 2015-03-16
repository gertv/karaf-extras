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
    
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        //TODO: register the managed service and managed service factory implementations
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        //TODO: unregister the services again
    }
}
