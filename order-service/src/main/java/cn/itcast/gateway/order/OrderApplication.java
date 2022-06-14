package cn.itcast.gateway.order;


import cn.itcast.gateway.feign.client.UserClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("cn.itcast.gateway.order.mapper")
@SpringBootApplication
@EnableFeignClients(clients = UserClient.class) //开始feign客户端
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }



   /* @Bean
    @LoadBalanced
    *//**
     * 创建RestTemplate并注入Spring容器
     *//*
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }*/


   /* @Bean
    public IRule randomRule() {
        return new RandomRule();
    }*/
}