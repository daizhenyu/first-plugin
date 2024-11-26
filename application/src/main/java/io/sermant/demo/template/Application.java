package io.sermant.demo.template;

import java.util.HashMap;

/**
 * template application
 *
 * @author luanwenfei
 * @since 2023-01-15
 */
public class Application {
    public static void main(String[] args) {
        System.out.println("Good afternoon!");
        SimulateServer.handleRequest(new HashMap<>());
    }
}
