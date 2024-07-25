package com.luv2code.test;

import com.luv2code.component.MvcTestingExampleApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// Pass class as param is needed when directory for tests has different name
@SpringBootTest(classes = MvcTestingExampleApplication.class)
public class ApplicationExampleTest {

    @Test
    void basicTest() {

    }
}
