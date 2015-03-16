package be.anova.course.karaf.extras;

import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedServiceFactory;

import java.util.Dictionary;
import java.util.Enumeration;

/**
 * A very cool {@link org.osgi.service.cm.ManagedServiceFactory} implementation
 */
public class ManagedServiceFactoryImpl implements ManagedServiceFactory {

    @Override
    public String getName() {
        return "Managed service factory example";
    }

    @Override
    public void updated(String pid, Dictionary<String, ?> dictionary) throws ConfigurationException {
        // TODO: Print the updated configuration
    }

    @Override
    public void deleted(String pid) {
        // TODO: Print the id of the configuration that was deleted
    }
    
}
