package com.aristide.joblisting;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
       info = @Info(
               title = "JOB LISTING",
               version = "1.0.0",
               description = "Job Listing - Learning Swagger",
               termsOfService = "no terms",
               contact = @Contact(
                    name = "Aristide",
                    email = "niyongaboaristide17@gmail.com"
               ),
               license = @License(
                       name = "licence",
                       url = "no url"
               )
       )
)
public class JobListingApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobListingApplication.class, args);
    }

}
