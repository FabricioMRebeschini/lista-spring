package com.fabricio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.fabricio.Repository.ListaRepository;
import com.fabricio.model.Lista;

@ComponentScan(basePackages = "com.fabricio.controller")

@SpringBootApplication
public class ListSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListSpringApplication.class, args);
	}
		@Bean
		CommandLineRunner initDataBase(ListaRepository listaRepository){
			return args->{
				listaRepository.deleteAll();

				Lista l = new Lista();
				l.setName("Cabo de vela");
				l.setQuantity("15");
				listaRepository.save(l);

				Lista l2 = new Lista();
				l2.setName("Capô");
				l2.setQuantity("7");
				listaRepository.save(l2);

				Lista l3 = new Lista();
				l3.setName("Multimetro");
				l3.setQuantity("8");
				listaRepository.save(l3);
			};
		}
		

}
