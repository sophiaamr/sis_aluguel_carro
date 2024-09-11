package com.example.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnectionLogger {

    private static final Logger logger = LoggerFactory.getLogger(DatabaseConnectionLogger.class);

    private final JdbcTemplate jdbcTemplate;

    @Value("${spring.datasource.url}")
    private String datasourceUrl;

    public DatabaseConnectionLogger(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @EventListener(ApplicationReadyEvent.class)
public void logDatabaseConnection() {
    System.out.println("Aplicação pronta e conectada ao banco de dados!");  // Teste simples
    try {
        jdbcTemplate.execute("SELECT 1");
        logger.info("Conexão com o banco de dados estabelecida com sucesso!");
        logger.info("URL do banco de dados: {}", datasourceUrl);
    } catch (Exception e) {
        logger.error("Falha ao conectar ao banco de dados: ", e);
    }
}

}
