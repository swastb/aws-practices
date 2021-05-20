package org.practice.functional;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

@SuppressWarnings("deprecation")
public class MyStringHandlers extends SpringBootRequestHandler<String, String>  {

}