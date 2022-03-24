package cn.itcast.other;

import io.netty.channel.DefaultEventLoop;
import io.netty.util.concurrent.DefaultPromise;
import io.netty.util.concurrent.Future;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhanglin
 * @description netty promise接口的使用
 */
@Slf4j
public class TestNettyPromise {
    public static void main(String[] args) throws InterruptedException {
        DefaultEventLoop eventExecutors = new DefaultEventLoop();
        DefaultPromise<Integer> promise = new DefaultPromise<>(eventExecutors);
            log.debug("enter...");
            promise.addListener(future -> {
                log.debug("{}",future.getNow());
            });

        Thread.sleep(1000);
        promise.setSuccess(100);
    }
}
