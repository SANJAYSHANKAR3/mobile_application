package com.example.mobileapp.cart;
<<<<<<< HEAD
=======

>>>>>>> 2a5db5ae919ad50b97eb13a9e5570e84c5cf0947
import org.springframework.stereotype.Service;

@Service
public interface CartService {
    Cart addToCart(Cart addProduct);
    Cart removeFromCart(Cart removeProduct);

    Cart updateToCart(Cart updateProducts);

    Cart getCartTotal(Cart totalCost);


}
