package dev;

import javax.activation.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceMySQLConfig {
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		
		// TODO mettre à jour les informations de connexion à la base de données
		dataSource.setUrl("jdbc:mysql://localhost:3306/phpmyadmin/db_structure.php?server=1&db=restaurant-bdd&table=plat");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		return (DataSource) dataSource;
	}
}