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
    public void updated(String s, Dictionary<String, ?> dictionary) throws ConfigurationException {
        System.out.println("We have a new configuration (" + s + "):");

        Enumeration keys = dictionary.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement().toString();
            System.out.println("- " + key + " -> " + dictionary.get(key));
        }
    }

    @Override
    public void deleted(String s) {
        System.out.println("Removing existing configuration: " + s);
    }
    
}
