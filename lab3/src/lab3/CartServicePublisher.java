package lab3;

import lab3.services.CartServiceImpl;
import lab3.services.ClothesServiceImpl;

import javax.xml.ws.Endpoint;

public class CartServicePublisher {
        public static void main(String[] args) {
            Endpoint.publish(
                    "http://localhost:8080/cartservice",
                    new CartServiceImpl());
            Endpoint.publish(
                    "http://localhost:8080/clothesservice",
                    new ClothesServiceImpl());

        }
}
