package br.com.estudos;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.CompositeMeterRegistryAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.metrics.jdbc.DataSourcePoolMetricsAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.trace.http.HttpTraceAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration;
import org.springframework.boot.autoconfigure.http.codec.CodecsAutoConfiguration;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;
import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Import;


@EnableAutoConfiguration
@Slf4j
@Import({AopAutoConfiguration.class,
        CodecsAutoConfiguration.class,
        CompositeMeterRegistryAutoConfiguration.class,
        DataSourceAutoConfiguration.class,
        DataSourcePoolMetricsAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        DispatcherServletAutoConfiguration.class,
        EmbeddedWebServerFactoryCustomizerAutoConfiguration.TomcatWebServerFactoryCustomizerConfiguration.class,
        ErrorMvcAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class,
        HttpEncodingAutoConfiguration.class,
        HttpMessageConvertersAutoConfiguration.class,
        HttpTraceAutoConfiguration.class,
        JacksonAutoConfiguration.class,
        JdbcTemplateAutoConfiguration.class,
        JmxAutoConfiguration.class,
        JpaRepositoriesAutoConfiguration.class,
        JtaAutoConfiguration.class,
        MetricsAutoConfiguration.class,
        MetricsEndpointAutoConfiguration.class,
        MultipartAutoConfiguration.class,
        PersistenceExceptionTranslationAutoConfiguration.class,
        RestTemplateAutoConfiguration.class,
        ServletEndpointManagementContextConfiguration.class,
        ServletManagementContextAutoConfiguration.class,
        ServletWebServerFactoryAutoConfiguration.class,
        SimpleMetricsExportAutoConfiguration.class,
        SpringDataWebAutoConfiguration.class,
        TomcatMetricsAutoConfiguration.class,
        TransactionAutoConfiguration.class,
        TransactionAutoConfiguration.EnableTransactionManagementConfiguration.class,
        TransactionAutoConfiguration.EnableTransactionManagementConfiguration.CglibAutoProxyConfiguration.class,
        TransactionAutoConfiguration.TransactionTemplateConfiguration.class,
        ValidationAutoConfiguration.class,
        WebEndpointAutoConfiguration.class,
        WebMvcAutoConfiguration.class,
        WebMvcEndpointManagementContextConfiguration.class,
        WebMvcMetricsAutoConfiguration.class,
        WebSocketServletAutoConfiguration.class})
public class TestesImpostos {

    public static void main(String[] args) {
        SpringApplication.run(TestesImpostos.class, args);
    }

}
