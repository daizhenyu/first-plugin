package com.huaweicloud.sermant.template;

import com.huaweicloud.sermant.core.config.common.ConfigTypeKey;
import com.huaweicloud.sermant.core.plugin.config.PluginConfig;

/**
 * 模版插件的配置类
 *
 * @author daizhenyu
 * @since 2023-10-19
 **/
@ConfigTypeKey("template.config")
public class TemplateConfig implements PluginConfig {
    private boolean enabled;

    private boolean beforeEnabled;

    private boolean afterEnabled;

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setBeforeEnabled(boolean beforeEnabled) {
        this.beforeEnabled = beforeEnabled;
    }

    public void setAfterEnabled(boolean afterEnabled) {
        this.afterEnabled = afterEnabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public boolean isBeforeEnabled() {
        return beforeEnabled;
    }

    public boolean isAfterEnabled() {
        return afterEnabled;
    }
}
