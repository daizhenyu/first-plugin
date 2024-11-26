package io.sermant.demo.template;

import java.util.HashMap;

/**
 * simulate a downstream service
 *
 * @author luanwenfei
 * @since 2023-02-17
 */
public class SimulateProvider {
    public static void handleConsume(HashMap<String, String> body) {
        assert !body.isEmpty();
    }
}
