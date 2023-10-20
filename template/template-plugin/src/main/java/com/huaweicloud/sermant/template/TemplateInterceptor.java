package com.huaweicloud.sermant.template;

import com.huaweicloud.sermant.core.plugin.agent.entity.ExecuteContext;
import com.huaweicloud.sermant.core.plugin.agent.interceptor.Interceptor;

/**
 * 拦截器
 *
 * @author daizhenyu
 * @since 2023-10-19
 **/
public class TemplateInterceptor implements Interceptor {
    @Override
    public ExecuteContext before(ExecuteContext context) {
        System.out.println("Good morning!");
        return context;
    }

    @Override
    public ExecuteContext after(ExecuteContext context) {
        System.out.println("Good night!");
        return context;
    }

    @Override
    public ExecuteContext onThrow(ExecuteContext context) {
        return context;
    }
}
