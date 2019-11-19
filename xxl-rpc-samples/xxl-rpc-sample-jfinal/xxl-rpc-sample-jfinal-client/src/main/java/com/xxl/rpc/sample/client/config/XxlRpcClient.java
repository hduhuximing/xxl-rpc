package com.xxl.rpc.sample.client.config;

import com.xxl.rpc.remoting.invoker.annotation.XxlRpcReference;
import com.xxl.rpc.sample.api.DemoService;

/**
 */
public class XxlRpcClient {
    public static final XxlRpcClient instance = new XxlRpcClient();


    @XxlRpcReference
    private DemoService demoService;


    public DemoService getDemoService() {
        return demoService;
    }


}
