package com.example.demo.cmm.utl;

import java.util.function.Consumer;

import org.springframework.stereotype.Service;

@Service
public class Printer {
	public void accept(String t) {
		Consumer<String> c = System.out::println;
		c.accept((String) t);
	}
}
