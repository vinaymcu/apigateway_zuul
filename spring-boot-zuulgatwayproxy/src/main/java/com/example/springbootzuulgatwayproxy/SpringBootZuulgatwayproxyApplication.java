package com.example.springbootzuulgatwayproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.example.springbootzuulgatwayproxy.filters.ErrorFilter;
import com.example.springbootzuulgatwayproxy.filters.PostFilter;
import com.example.springbootzuulgatwayproxy.filters.PreFilter;
import com.example.springbootzuulgatwayproxy.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class SpringBootZuulgatwayproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulgatwayproxyApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
            System.out.println("Gateway proxy :preFilter ");
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
             System.out.println("Gateway proxy :PostFilter ");
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
             System.out.println("Gateway proxy :ErrorFilter ");
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
             System.out.println("Gateway proxy :RouteFilter ");
		return new RouteFilter();
	}
}
