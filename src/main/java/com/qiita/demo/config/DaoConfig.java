package com.qiita.demo.config;

import java.io.IOException;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;

@Configuration
@MapperScan("com.qiita.demo.dao")
public class DaoConfig {
  /**
   * SqlSessionFactoryBean�i�[�N���X�B
   *
   * <PRE>
  * DataSource��SqlSessionFactoryBean�ɃZ�b�g���܂��B
  * mybatis�̐ݒ����SqlSessionFactoryBean�ɃZ�b�g���܂��B
   * </PRE>
   *
   * @return SqlSessionFactoryBean�B
   */
  @Bean
  public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) throws IOException {
    SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
    factory.setDataSource(dataSource);
    ResourcePatternResolver resolver =
        ResourcePatternUtils.getResourcePatternResolver(new DefaultResourceLoader());
    // MyBatis �̃R���t�B�O���[�V�����t�@�C��
    factory.setConfigLocation(resolver.getResource("classpath:mybatis-config.xml"));
    // MyBatis �Ŏg�p���� SQL �t�@�C���Q(dao�t�H���_���̃T�u�t�H���_�����܂񂾑S�Ă�xml)
    factory.setMapperLocations(resolver.getResources("classpath:dao/**/*.xml"));

    return factory;
  }
}