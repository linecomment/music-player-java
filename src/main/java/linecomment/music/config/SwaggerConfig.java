package linecomment.music.config;

import org.springframework.context.annotation.Configuration;

/**
 * @author linecomment
 * @date 2023/5/27 14:06:36
 */
@Configuration
public class SwaggerConfig {




    /**
     * 配置了swagger的Docket的bean实例
     * 此方法可配置多个，复制后改个方法名即可，用于分组
     * @return
     */
    //@Bean
    //public Docket docket(Environment environment){
    //    //设置要显示的swagger环境
    //    Profiles profiles = Profiles.of("dev","test");
    //    //通过environment.acceptsProfiles判断是否处在自己设定的环境当中
    //    boolean flag = environment.acceptsProfiles(profiles);
    //    return new Docket(DocumentationType.SWAGGER_2)
    //            .groupName("河南循中网络科技有限公司")
    //            .apiInfo(apiInfo())
    //            .enable(flag)//enable是否启动Swagger，如果为false，则Swagger不能在浏览器中访问
    //            .select()
    //            //RequestHandlerSelectors.basePackage("包名")  单包扫描
    //            //RequestHandlerSelectors.basePackage("包名").or(RequestHandlerSelectors.basePackage("包名"))  多包扫描
    //            .apis(RequestHandlerSelectors.basePackage("linecomment.music.controller"))
    //            //加了ApiOperation注解的类，才生成接口文档
    //            .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
    //            .build();
    //}
    //
    ///**
    // * 配置swagger信息=apiInfo
    // * @return
    // */
    //private ApiInfo apiInfo(){
    //    Contact contact = new Contact("项目组成员", "", "xunzhongkeji2022@163.com");
    //    return new ApiInfo(
    //            "swaggerAPI文档",
    //            "在高处有如临深渊的谨慎，在低谷有仰望星空的勇气。",
    //            "v1.0",
    //            "",
    //            contact,
    //            "Apache Tomcat/9.0.64",
    //            "https://tomcat.apache.org/tomcat-9.0-doc/building.html",
    //            new ArrayList<>());
    //}
}


