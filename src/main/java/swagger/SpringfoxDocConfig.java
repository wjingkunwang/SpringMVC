package swagger;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * http://yukinami.github.io/2015/07/07/%E4%BD%BF%E7%94%A8springfox%E7%94%9F%E6%88%90springmvc%E9%A1%B9%E7%9B%AE%E7%9A%84swagger%E7%9A%84%E6%96%87%E6%A1%A3/
 */
@EnableSwagger2 //Enable swagger 2.0 spec
public class SpringfoxDocConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .host("localhost:8080/test")
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Api Documents")
                .contact(new Contact("Shildon", "", "shildondu@gmail.com"))
                .build();
    }
}