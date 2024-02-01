package com.mattlangsenkamp.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Profile("staging")
@Controller
public class DataLoader implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("AAAAA");
    }
}
