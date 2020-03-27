package com.eric.alibaba.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author eric.li
 * @date 2020/3/27
 */
public class SentinelServiceHandler {
    /**
     * 特别注意参数需要与被调用方法参数一致，且需要加上BlockException参数
     * @param p1
     * @param blockException
     * @return
     */
    public static String handlerInClassBlock(String p1, BlockException blockException){
        return "block in class";
    }

    /**
     * 特别注意参数需要与被调用方法参数一致，或者可以额外多一个 Throwable 类型的参数用于接收对应的异常。
     * @param p1
     * @return
     */
    public static String handlerInClassFallback(String p1, Throwable throwable){
        return "fallback in class. " + throwable.getMessage();
    }
}
