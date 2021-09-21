package com.intuit.qbpayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class QbPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(QbPaymentApplication.class, args);
    }

}
