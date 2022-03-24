package cigma.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Override
    public void configure(AuthenticationManagerBuilder authenticationManagerBuilder)throws Exception{
        authenticationManagerBuilder.inMemoryAuthentication()
                .passwordEncoder(passwordEncoder).withUser("ZakariaUser").password(passwordEncoder.encode("zakariaelarrim"))
                .roles("USER")
                .and()
                .withUser("ZakariaAdmin").password(passwordEncoder.encode("zakariaelarrimAdmin"))
                .roles("ADMIN");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers(
                        "/addClient","/show-client/**"
                )
                .hasRole("USER")
                .antMatchers(
                        "/deleteClient/**"
                )
                .hasRole("ADMIN")
                .antMatchers(
                        "/clients","/"
                )
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin();
    }
}
