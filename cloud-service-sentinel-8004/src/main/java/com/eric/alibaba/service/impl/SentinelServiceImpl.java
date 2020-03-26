package com.eric.alibaba.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
//import com.eric.alibaba.service.SentinelService;
import com.alibaba.csp.sentinel.slots.block.BlockException;
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
    @SentinelResource(value = "hello", blockHandler = "handler")
    public String sayHello(String p1) {
        return "hello" + p1;
    }

    public String handler(String p1, BlockException blockException){
        return "block";
    }
}
