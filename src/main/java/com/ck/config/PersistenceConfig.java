package com.ck.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceConfig {

	@Bean
	DataSource loadDataSource() {
		DataSourceProperties dataSourceProperties = new DataSourceProperties();
		dataSourceProperties.setUsername("citus");
		dataSourceProperties.setPassword("yJ8cAMBO");
		dataSourceProperties
				.setUrl("jdbc:postgresql://c-postgres-db.mkxu5hhvweo4sg.postgres.cosmos.azure.com:5432/postgres-db");
		DataSource dataSource = dataSourceProperties.initializeDataSourceBuilder().build();
		return dataSource;

	}
}
