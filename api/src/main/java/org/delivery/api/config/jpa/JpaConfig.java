package org.delivery.api.config.jpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//db패키지의 스프링빈들을 조회하기 위한 JPA 설정
@Configuration
@EntityScan(basePackages = "org.delivery.db")
@EnableJpaRepositories(basePackages = "org.delivery.db")
public class JpaConfig {
}
