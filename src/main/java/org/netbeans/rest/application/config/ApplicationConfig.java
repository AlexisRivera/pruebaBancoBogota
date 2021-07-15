
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;
import model.servicio.*;

/**
 *
 * @author daniel
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }
    
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(model.servicio.EstadoServicio.class);
resources.add(model.servicio.InscritoServicio.class);
resources.add(model.servicio.MedioPagosServicio.class);
resources.add(model.servicio.MiembroServicio.class);
resources.add(model.servicio.TargetaServicio.class);
resources.add(model.servicio.pagosServicio.class);
resources.add(model.servicio.sexoServicio.class);
    }
    
}

