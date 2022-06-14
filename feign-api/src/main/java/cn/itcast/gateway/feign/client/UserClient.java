package cn.itcast.gateway.feign.client;

import cn.itcast.gateway.feign.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("userServer")
public interface UserClient {
	@GetMapping("/user/{id}")
	User findById(@PathVariable("id") Long id);
}
