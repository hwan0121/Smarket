package net.lele.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer{
    
    @Override 
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
       /* '/res/**'로 호출하는 자원은 '/static/res/' 폴더 아래에서 찾는다. */ 
         registry.addResourceHandler("/res/**").addResourceLocations("classpath:/static/res/").setCachePeriod(60 * 60 * 24 * 365); 
       /* '/images/**'로 호출하는 자원은 '/static/images/' 폴더 아래에서 찾는다. */ 
         registry.addResourceHandler("/images/**").addResourceLocations("classpath:/static/images/").setCachePeriod(60 * 60 * 24 * 365); 

    }
}
