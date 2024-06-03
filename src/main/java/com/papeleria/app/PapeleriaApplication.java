package com.papeleria.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PapeleriaApplication {

    public static void main(String[] args) {
        // Configurar TrustStore y KeyStore
        System.setProperty("javax.net.ssl.trustStore", "ruta/a/tu/truststore.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "contrasenaTruststore");
        System.setProperty("javax.net.ssl.keyStore", "ruta/a/tu/keystore.jks");
        System.setProperty("javax.net.ssl.keyStorePassword", "contrasenaKeystore");

        // Habilitar depuración SSL/TLS
        System.setProperty("javax.net.debug", "ssl,handshake");

        // Ejecutar la aplicación Spring Boot
        SpringApplication.run(PapeleriaApplication.class, args);
    }
}
