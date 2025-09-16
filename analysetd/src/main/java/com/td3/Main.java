package com.td3;

public class Main {
    public String hello(Object e) {
        if (e == null) {
            return "Hello, World!";
        }
        return e.toString();
    }
}