package server;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import server.service.home.InterceptorDelete;

@Configuration
public class SpringConfig extends WebMvcConfigurerAdapter {
    // configures goes here

    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new InterceptorDelete()).addPathPatterns("/home/*");
    }
}
