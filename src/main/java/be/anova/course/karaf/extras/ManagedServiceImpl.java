package be.anova.course.karaf.extras;

import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;

import java.util.Dictionary;
import java.util.Enumeration;

/**
 * A very cool {@link org.osgi.service.cm.ManagedService} implementation
 */
public class ManagedServiceImpl implements ManagedService {

    @Override
    public void updated(Dictionary<String, ?> dictionary) throws ConfigurationException {
        System.out.println("We have a new configuration:");

        Enumeration keys = dictionary.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement().toString();
            System.out.println("- " + key + " -> " + dictionary.get(key));
        }
    }

}
