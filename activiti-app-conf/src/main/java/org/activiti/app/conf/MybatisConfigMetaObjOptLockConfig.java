package org.activiti.app.conf;

import com.baomidou.mybatisplus.MybatisConfiguration;
import com.baomidou.mybatisplus.MybatisXMLLanguageDriver;
import com.baomidou.mybatisplus.entity.GlobalConfiguration;
import com.baomidou.mybatisplus.mapper.LogicSqlInjector;
import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;


@Configuration
@MapperScan({"com.baomidou.mybatisplus.test.h2.entity.mapper","org.activiti.app.dao","org.activiti.app.mapping"})
public class MybatisConfigMetaObjOptLockConfig {
    @Bean("mybatisSqlSession")
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource, GlobalConfiguration globalConfiguration) throws Exception {
        MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        sqlSessionFactory.setTypeAliasesPackage("com.baomidou.mybatisplus.test.h2.entity.persistent");
        MybatisConfiguration configuration = new MybatisConfiguration();
        configuration.setDefaultScriptingLanguage(MybatisXMLLanguageDriver.class);
        configuration.setJdbcTypeForNull(JdbcType.NULL);
        sqlSessionFactory.setConfiguration(configuration);
        //pageHelper配置
        PageInterceptor pageHelper = new PageInterceptor();//mybatis分页插件
        Properties p = new Properties();//插件属性配置
//        p.put("dialect", "mysql"); //数据库言
//        p.put("reasonable", "true");//参数合理化，如果pageNum<1会查询第一页，如果pageNum>pages会查询最后一页
//        p.put("offsetAsPageNum", "trsue"); //将RowBounds第一个参数offset当成pageNum页码使用
        pageHelper.setProperties(p);
        sqlSessionFactory.setPlugins(new Interceptor[]{
                pageHelper
        });
        sqlSessionFactory.setGlobalConfig(globalConfiguration);
        return sqlSessionFactory.getObject();
    }

    @Bean
    public GlobalConfiguration globalConfiguration() {
        GlobalConfiguration conf = new GlobalConfiguration(new LogicSqlInjector());
        conf.setLogicDeleteValue("-1");
        conf.setLogicNotDeleteValue("1");
        conf.setIdType(2);
        //conf.setMetaObjectHandler(new H2MetaObjectHandler());
        return conf;
    }
}
