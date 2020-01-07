package com.spring.context.config;/**
 * @description:
 * @author: Lenovo
 * @date: 2019-10-23 9:30
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Auther chenhao
 * @Date 2019/10/23
 */
@Configuration
public class Swagger2 implements WebMvcConfigurer{

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.spring.context.controller"))
                .paths(PathSelectors.any())
                .build();
        }

        private ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                    .title("MongoDB   api")
                    .description("api")
                    .termsOfServiceUrl("http://localhost:8080/swagger2.html")
                    .version("1.0")
                    .build();
        }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations(
                "classpath:/static/");
        registry.addResourceHandler("swagger-ui.html").addResourceLocations(
                "classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations(
                "classpath:/META-INF/resources/webjars/");

    }
}
