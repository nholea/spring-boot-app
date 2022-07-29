package test.app.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CreatePermissionTest {

        @LocalServerPort
        private int port;

        @Autowired
        private TestRestTemplate restTemplate;

        @Test
        void createPermission(){
            MyPermission myPermission = new MyPermission("Read only");

            String urlCreatePermission = "http://localhost:" + port + "/permissions";

            assertThat(restTemplate.postForObject(urlCreatePermission, myPermission, String.class)).isEqualTo("Permission created successfully");


        }
        @Test
        void greeting(){
            String urlGreeting = "http://localhost:" + port + "/greeting";

            assertThat(restTemplate.getForObject(urlGreeting, String.class)).isEqualTo("Hi! I'm spring boot");

        }

    }


