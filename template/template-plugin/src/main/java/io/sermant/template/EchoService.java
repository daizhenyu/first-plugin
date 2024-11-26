package io.sermant.template;

import io.sermant.core.plugin.service.PluginService;

/**
 * template plugin service interface
 *
 * @author luanwenfei
 * @since 2023-02-15
 */
public interface EchoService extends PluginService {
    void echo(String string);
}
