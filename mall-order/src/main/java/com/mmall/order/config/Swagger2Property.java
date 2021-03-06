package com.mmall.order.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Swagger2配置类
 * @author JPG
 */
@Component
@Data
@ConfigurationProperties("cjyc.swagger")
public class Swagger2Property {
    private Boolean enabled;
    private String groupName;
    private Boolean useDefaultResponseMessages = false;
    private Boolean forCodeGeneration = true;
    private String basePackage;
    private Boolean usePathMapping;

    private String title;
    private String description;
    private String version;
    private String license;
    private String licenseUrl;
    private String termsOfServiceUrl;
    public String baseUrl;

}
