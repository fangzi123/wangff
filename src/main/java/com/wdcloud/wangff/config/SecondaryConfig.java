package com.wdcloud.wangff.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

@Configuration
@MapperScan(
        basePackages = "com.wdcloud.wangff.mapper.db2",
        sqlSessionFactoryRef = "sqlSessionFactorySecondary",
        sqlSessionTemplateRef = "sqlSessionTemplateSecondary")
public class SecondaryConfig {

    private DataSource secondaryDataSource;

    public SecondaryConfig(@Qualifier("secondaryDataSource") DataSource secondaryDataSource) {
        this.secondaryDataSource = secondaryDataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactorySecondary() throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(secondaryDataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/**.xml"));
        return bean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplateSecondary() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactorySecondary());
    }

}