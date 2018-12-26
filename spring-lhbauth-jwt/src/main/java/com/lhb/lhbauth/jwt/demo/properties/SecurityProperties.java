package com.lhb.lhbauth.jwt.demo.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author lvhaibao
 * @description
 * @date 2018/11/22 0022 11:54
 */
@ConfigurationProperties(prefix = "system")
@Data
public class SecurityProperties {


    private OauthPageProperties oauthLogin = new OauthPageProperties();

}
