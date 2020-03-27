package com.eric.alibaba.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.eric.alibaba.handler.SentinelServiceHandler;
import com.eric.alibaba.service.SentinelService;
import org.springframework.stereotype.Service;

/**
 * @author eric.li
 * @date 2020/3/26
 */
@Service
public class SentinelServiceImpl implements SentinelService {

    /**
     * blockHandler / blockHandlerClass: blockHandler 对应处理 BlockException 的函数名称，可选项。
     * blockHandler 函数访问范围需要是 public，返回类型需要与原方法相匹配，
     * 参数类型需要和原方法相匹配并且最后加一个额外的参数，
     * 类型为 BlockException。blockHandler 函数默认需要和原方法在同一个类中。
     * 若希望使用其他类的函数，则可以指定 blockHandlerClass 为对应的类的 Class 对象，
     * 注意对应的函数必需为 static 函数，否则无法解析。
     * @param p1
     * @return
     */
    @Override
    @SentinelResource(value = "hello", blockHandler = "handlerInClassBlock", blockHandlerClass = SentinelServiceHandler.class)
    public String sayHello(String p1) {
        return "hello" + p1;
    }

    /**
     * fallback 函数名称，可选项，用于在抛出异常的时候提供 fallback 处理逻辑。
     * fallback 函数可以针对所有类型的异常（除了 exceptionsToIgnore 里面排除掉的异常类型）进行处理。
     * fallback 函数签名和位置要求：
     * 返回值类型必须与原函数返回值类型一致；
     * 方法参数列表需要和原函数一致，或者可以额外多一个 Throwable 类型的参数用于接收对应的异常。
     * fallback 函数默认需要和原方法在同一个类中。
     * 若希望使用其他类的函数，则可以指定 fallbackClass 为对应的类的 Class 对象，
     * 注意对应的函数必需为 static 函数，否则无法解析。
     * @param p1
     * @return
     */
    @Override
    @SentinelResource(value = "hi", fallbackClass = SentinelServiceHandler.class, fallback = "handlerInClassFallback")
    public String sayHi(String p1) {
        Integer a = 10/0;
        return "hi" + p1;
    }

//    public String handler(String p1, BlockException blockException){
//        return "block";
//    }
}
