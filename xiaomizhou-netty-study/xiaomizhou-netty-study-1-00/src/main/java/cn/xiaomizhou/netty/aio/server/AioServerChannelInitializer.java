package cn.xiaomizhou.netty.aio.server;

import cn.xiaomizhou.netty.aio.ChannelInitializer;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Author Rice
 * @Date 2021/6/18 15:59
 * @Version V1.0
 */
public class AioServerChannelInitializer extends ChannelInitializer {

    @Override
    protected void initChannel(AsynchronousSocketChannel channel) throws Exception {
        channel.read(ByteBuffer.allocate(1024), 10, TimeUnit.SECONDS,
                null, new AioServerHandler(channel, Charset.forName("GBK")));
    }
}
