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
    public void updated(Dictionary dictionary) throws ConfigurationException {
        // TODO: System.out.println() the new configuration
    }

}
