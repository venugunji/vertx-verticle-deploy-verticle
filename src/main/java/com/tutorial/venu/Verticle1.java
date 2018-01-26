package com.tutorial.venu;

import io.vertx.core.AbstractVerticle;

public class Verticle1 extends AbstractVerticle {

	@Override
    public void start() {
        System.out.println("Verticle one started!");
		 vertx.deployVerticle(new Verticle2(), asyncResult -> {
			 System.out.println("callback in Verticle 1 deploying Verticle 2");
		 });
    }

	
}
