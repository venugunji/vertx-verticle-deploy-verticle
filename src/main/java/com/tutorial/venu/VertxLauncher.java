package com.tutorial.venu;

import io.vertx.core.Vertx;
public class VertxLauncher {

	public static void main(String[] args) {
		
		Vertx vertx = Vertx.vertx();
		
		vertx.deployVerticle(new Verticle1(), stringAsyncResult -> {
			
			System.out.println("Verticle One deployment is completed. In callback method");
		}
		);
		
	}
}
