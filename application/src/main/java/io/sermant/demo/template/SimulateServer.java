package io.sermant.demo.template;

import java.util.HashMap;

/**
 * simulate a backend service
 *
 * @author luanwenfei
 * @since 2023-02-17
 */
public class SimulateServer {
    public static void handleRequest(HashMap<String, String> body) {
        consume(body);
    }

    private static void consume(HashMap<String, String> body) {
        SimulateProvider.handleConsume(body);
    }
}
