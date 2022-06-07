package ml.java.starter;

import ml.java.starter.context.GreeterAutoConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = GreeterAutoConfiguration.class)
public class SpringStarterTest {

    @Test
    void test(){
    }

}
