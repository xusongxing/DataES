package cn.xsx.web.dsp.conf;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @ClassName: DspConfig
 * @Description: 负责管理基本配置信息
 * @author 1993xusongxing@163.com
 * @date 2019年10月29日 下午8:41:07
 */    
@Configurable
@PropertySource(value = {"classpath:dsp.properties"})
public class DspConfig {
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
