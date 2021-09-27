package com.tedblob.triggeringpolicy.sizebased;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SizeBasedTriggeringPolicyApplication {

	private static final Logger logger = LoggerFactory.getLogger(SizeBasedTriggeringPolicyApplication.class);

	public static void main(String[] args) {
		logger.debug("SpringBootApplication main START");
		SpringApplication.run(SizeBasedTriggeringPolicyApplication.class, args);
		logger.debug("SpringBootApplication main method END");
	}

}
