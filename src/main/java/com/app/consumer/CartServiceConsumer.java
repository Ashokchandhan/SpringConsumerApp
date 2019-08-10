package com.app.consumer;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.model.Cart;

@FeignClient(name="CART-PROVIDER")
public interface CartServiceConsumer {

	@GetMapping("/cart/info")
	public String getMsg();
	@GetMapping("/cart/data")
	public Cart getObj();
	@GetMapping("/cart/list")
	public List<Cart>getBulk();
}
