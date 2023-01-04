package top.caibo.test;

import top.caibo.rpc.api.HelloService;
import top.caibo.rpc.registry.DefaultServiceRegistry;
import top.caibo.rpc.registry.ServiceRegistry;
import top.caibo.rpc.server.RpcServer;


/**
 * @author caibo
 * @date 2023/1/4 22:05
 */
//public class TestServer {
//
//    public static void main(String[] args) {
//        HelloService helloService = new HelloServiceImpl();
//        RpcServer rpcServer = new RpcServer();
//        rpcServer.register(helloService, 9000);
//    }
//}
public class TestServer {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ServiceRegistry serviceRegistry = new DefaultServiceRegistry();
        serviceRegistry.register(helloService);
        RpcServer rpcServer = new RpcServer(serviceRegistry);
        rpcServer.start(9000);
    }
}
