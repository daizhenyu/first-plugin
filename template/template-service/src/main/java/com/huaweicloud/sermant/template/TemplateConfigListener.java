package com.huaweicloud.sermant.template;

import com.huaweicloud.sermant.core.service.dynamicconfig.common.DynamicConfigEvent;
import com.huaweicloud.sermant.core.service.dynamicconfig.common.DynamicConfigListener;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.representer.Representer;

/**
 * 末班配置类 动态配置监听器
 *
 * @author daizhenyu
 * @since 2023-10-19
 **/
public class TemplateConfigListener implements DynamicConfigListener {
    private TemplateConfig templateConfig;

    private final Yaml yaml;

    public TemplateConfigListener(TemplateConfig templateConfig, Yaml yaml) {
        this.templateConfig = templateConfig;
        Representer representer = new Representer();
        representer.getPropertyUtils().setSkipMissingProperties(true);
        this.yaml = new Yaml(representer);
    }

    @Override
    public void process(DynamicConfigEvent dynamicConfigEvent) {

    }
}
