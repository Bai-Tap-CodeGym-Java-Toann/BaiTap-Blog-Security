package lana.configuration.Initializer;

import lana.configuration.*;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
                InjectedServiceBeans.class,
                SpringDataJPAConfig.class,
                WebSecurityConfig.class

        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                ApplicationConfiguration.class,
                ThymeLeafConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}
