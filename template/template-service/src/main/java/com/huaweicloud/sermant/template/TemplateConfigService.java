package com.huaweicloud.sermant.template;

import com.huaweicloud.sermant.core.common.LoggerFactory;
import com.huaweicloud.sermant.core.plugin.service.PluginService;

import java.util.logging.Logger;

/**
 * 模版插件配置动态监听服务
 *
 * @author daizhenyu
 * @since 2023-10-20
 **/
public class TemplateConfigService implements PluginService {
    private static final Logger LOGGER = LoggerFactory.getLogger();

    private static final String DYNAMIC_CONFIG_KEY = "template-config";

    private static final String DYNAMIC_CONFIG_GROUP = "sermant/template-plugin";


}
