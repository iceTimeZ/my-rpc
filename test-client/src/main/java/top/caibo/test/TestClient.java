package top.caibo.test;

import top.caibo.rpc.api.HelloObject;
import top.caibo.rpc.api.HelloService;
import top.caibo.rpc.client.RpcClientProxy;

/**
 * 测试用消费者（客户端）
 */
public class TestClient {

    public static void main(String[] args) {
        RpcClientProxy proxy = new RpcClientProxy("127.0.0.1", 9000);
        HelloService helloService = proxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
    }

}
