package com.example.fileuploadspringboot.database;

import com.example.fileuploadspringboot.models.Product;
import com.example.fileuploadspringboot.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// Now connect with mysql using JPA
/*
docker run -d --rm --name mysql-spring-boot-tutorial \
-e MYSQL_ROOT_PASSWORD=123456 \
-e MYSQL_USER=minhpv \
-e MYSQL_PASSWORD=Pvminhwh2205@ \
-e MYSQL_DATABASE=file-upload \
-p 3309:3306 \
--volume mysql-spring-boot-tutorial-volume:/var/lib/mysql \
mysql:lastest

mysql -h localhost -P 3309 --protocol=tcp -u minhpv -p
* **/

@Configuration
public class Database {
    // logger
    private static final Logger logger = LoggerFactory.getLogger(Database.class);

    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
//                Product productA = new Product("ipad", 2020, 10000.2, "");
//                Product productB = new Product("iphone", 2020, 10000.2, "");
//                productRepository.save(productA);
//                productRepository.save(productB);
//                logger.info("insert data " + productRepository.save(productB));
            }
        };
    }
}
