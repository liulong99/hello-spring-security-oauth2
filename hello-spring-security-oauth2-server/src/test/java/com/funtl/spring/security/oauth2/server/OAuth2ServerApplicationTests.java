package com.funtl.spring.security.oauth2.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OAuth2ServerApplicationTests {
    @Test
    public void testPasswordEncoder(){
        System.out.println(new BCryptPasswordEncoder().encode("admin888"));
    }
}
