package com.xxl.rpc.test;

import com.xxl.rpc.util.IpUtil;

import java.net.UnknownHostException;

/**
 */
public class IpUtilTest {

    public static void main(String[] args) throws UnknownHostException {
        System.out.println(IpUtil.getIp());
        System.out.println(IpUtil.getIpPort(8080));
    }

}
