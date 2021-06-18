package cn.xiaomizhou.netty.aio.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @Description
 * @Author Rice
 * @Date 2021/6/18 14:46
 * @Version V1.0
 */
public class AioClient {

    public static void main(String[] args) throws Exception {
        AsynchronousSocketChannel socketChannel = AsynchronousSocketChannel.open();

        Future<Void> future = socketChannel.connect(new InetSocketAddress("127.0.0.1", 7397));
        future.get();

        socketChannel.read(ByteBuffer.allocate(1024), null, new AioClientHandler(socketChannel, Charset.forName("GBK")));

        Thread.sleep(100000);
    }

}
