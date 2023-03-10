package top.caibo.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.caibo.rpc.api.HelloObject;
import top.caibo.rpc.api.HelloService;

public class HelloServiceImpl implements HelloService {

    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String hello(HelloObject object) {
        logger.info("接收到：{}", object.getMessage());
        return "这是调用的返回值，id=" + object.getId();
    }

}
