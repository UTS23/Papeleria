package com.papeleria.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PapeleriaApplication {

    public static void main(String[] args) {
        // Configurar TrustStore y KeyStore
        System.setProperty("javax.net.ssl.trustStore", "src/main/resources/truststore.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "truststore-password");
        System.setProperty("javax.net.ssl.keyStore", "src/main/resources/keystore.jks");
        System.setProperty("javax.net.ssl.keyStorePassword", "keystore-password");

        // Habilitar depuración SSL/TLS
        System.setProperty("javax.net.debug", "ssl,handshake");

        // Configurar protocolos SSL/TLS
        System.setProperty("https.protocols", "TLSv1.2,TLSv1.3");

        // Ejecutar la aplicación Spring Boot
        SpringApplication.run(PapeleriaApplication.class, args);
    }
}
