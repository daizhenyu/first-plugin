package io.sermant.template;

/**
 * template interface implementation
 *
 * @author luanwenfei
 * @since 2023-02-15
 */
public class EchoServiceImpl implements EchoService {
    @Override
    public void echo(String string) {
        // respond to a greeting
        string = string.replaceAll("[\\pP+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", "");
        System.out.println("ECHO: " + string + " to you!");
    }
}
