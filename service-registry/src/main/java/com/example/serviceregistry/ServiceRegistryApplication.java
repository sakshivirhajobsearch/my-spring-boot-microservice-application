package com.example.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.event.ContextClosedEvent;

import com.netflix.eureka.EurekaServerContextHolder;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

	// Shutdown Hook for Eureka Server
	@org.springframework.context.event.EventListener(ContextClosedEvent.class)
	public void onShutdown() {
		if (EurekaServerContextHolder.getInstance().getServerContext() != null) {
			try {
				EurekaServerContextHolder.getInstance().getServerContext().shutdown();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
