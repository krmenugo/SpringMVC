package com.krmenugo;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@Configuration
public class WebSecurityConfig {//extends WebSecurityConfigurerAdapter {
//	
//	@Autowired
//	private DataSource dataSource;
//
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
//	
//	@Autowired
//	public void configurerSecurityGlobal(AuthenticationManagerBuilder builder) throws Exception{
//			builder.jdbcAuthentication()
//			.dataSource(dataSource)
//			.passwordEncoder(passwordEncoder)
//			.usersByUsernameQuery("SELECT user, password, enable FROM users WHERE user = ?")
//			.authoritiesByUsernameQuery("SELECT u.user, r.rol FROM roles r INNER JOIN users u ON r.idUser = u.idUser WHERE u.user = ?");
//	}
//	
}
