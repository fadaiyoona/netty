package cn.itcast.other;

import io.netty.channel.EventLoop;
import io.netty.channel.nio.NioEventLoopGroup;

/**
 * @author zhanglin
 * @description EventLoopGroup当成线程池使用用例
 */
public class TestEventLoop {
    public static void main(String[] args) {
        EventLoop eventLoop = new NioEventLoopGroup().next();
        eventLoop.execute(()->{
            System.out.println("hello");
        });
    }
}
