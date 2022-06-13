package cn.itcast.order.service;

import cn.itcast.order.mapper.OrderMapper;
import cn.itcast.order.pojo.Order;
import com.itcast.feign.client.UserClient;
import com.itcast.feign.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;
    //@Autowired
    //private RestTemplate restTemplate;
    @Autowired
    private UserClient userClient;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
        //2 根据对象查询除User的id
        Long userId = order.getUserId();
//        //3 使用RestTemplate发送请求去找UserService查询User的对象
//        String url = "http://userServer/user/"+userId;
//        User user = restTemplate.getForObject(url,User.class);
        //使用feign发送请求
        User user = userClient.findById(userId);
        // 4.返回
        order.setUser(user);
        return order;
    }
}
