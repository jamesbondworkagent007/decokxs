package com.engagelab.privates.common;

import android.content.Context;
import android.text.TextUtils;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.SystemUtil;
import com.engagelab.privates.core.api.Address;
import com.engagelab.privates.core.global.MTCoreGlobal;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class r extends q {
    public Selector d;
    public SocketChannel e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.engagelab.privates.common.q
    public String a() {
        return "TcpChannlClient";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.engagelab.privates.common.q
    public void a(Context context) {
        MTCommonLog.d("TcpChannlClient", "tcp disconnectImp");
        try {
            Selector selector = this.d;
            if (selector != null && selector.isOpen()) {
                this.d.close();
                this.d = null;
            }
            SocketChannel socketChannel = this.e;
            if (socketChannel == null || !socketChannel.isConnected()) {
                return;
            }
            this.e.finishConnect();
            this.e.close();
            this.e = null;
        } catch (Throwable th) {
            MTCommonLog.w("TcpChannlClient", "disconnect failed " + th.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.engagelab.privates.common.q
    public boolean b(Context context, String str, int i) throws Throwable {
        if (!SystemUtil.isNetworkConnecting(context)) {
            MTCommonLog.e("TcpChannlClient", "can't connect, network is disConnected");
            return false;
        }
        MTCommonLog.d("TcpChannlClient", "tcp connect " + str + ":" + i);
        InetSocketAddress inetSocketAddress = new InetSocketAddress(str, i);
        SocketChannel socketChannelOpen = SocketChannel.open();
        this.e = socketChannelOpen;
        socketChannelOpen.configureBlocking(false);
        Selector selectorOpen = Selector.open();
        this.d = selectorOpen;
        this.e.register(selectorOpen, 8);
        this.e.connect(inetSocketAddress);
        this.d.select();
        Set<SelectionKey> setSelectedKeys = this.d.selectedKeys();
        if (setSelectedKeys == null) {
            MTCommonLog.d("TcpChannlClient", "selectionKeys is null");
            return false;
        }
        if (setSelectedKeys.isEmpty()) {
            MTCommonLog.d("TcpChannlClient", "selectionKeys is empty");
            return false;
        }
        SelectionKey next = setSelectedKeys.iterator().next();
        if (next == null || !next.isConnectable()) {
            MTCommonLog.d("TcpChannlClient", "selectionKey is null");
            return false;
        }
        if (!next.isConnectable()) {
            MTCommonLog.d("TcpChannlClient", "selectionKey is disConnected");
            return false;
        }
        SocketChannel socketChannel = (SocketChannel) next.channel();
        if (!socketChannel.isConnectionPending()) {
            MTCommonLog.d("TcpChannlClient", "finish connect");
            return false;
        }
        socketChannel.finishConnect();
        socketChannel.register(this.d, 1);
        MTCommonLog.d("TcpChannlClient", "tcp connect success");
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.engagelab.privates.common.q
    public List<String> c(Context context) {
        return i(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.engagelab.privates.common.q
    public byte[] d(Context context) {
        try {
        } catch (IOException e) {
            MTCommonLog.w("TcpChannlClient", "receive IOException " + e.getMessage());
            a(context, true);
        } catch (Throwable th) {
            MTCommonLog.w("TcpChannlClient", "receive failed " + th.getMessage());
            a(context, true);
        }
        if (!b()) {
            MTCommonLog.d("TcpChannlClient", "tcp is not connecting");
            return null;
        }
        this.d.select();
        if (!this.d.isOpen()) {
            MTCommonLog.d("TcpChannlClient", "selector is closed");
            return null;
        }
        Set<SelectionKey> setSelectedKeys = this.d.selectedKeys();
        if (setSelectedKeys == null) {
            MTCommonLog.w("TcpChannlClient", "selectionKeys is null");
            a(context, true);
            return null;
        }
        if (setSelectedKeys.isEmpty()) {
            MTCommonLog.w("TcpChannlClient", "selectionKeys is empty");
            a(context, true);
            return null;
        }
        Iterator<SelectionKey> it = setSelectedKeys.iterator();
        if (!it.hasNext()) {
            MTCommonLog.w("TcpChannlClient", "selectionKeys hasn't next");
            a(context, true);
            return null;
        }
        SelectionKey next = it.next();
        if (next == null) {
            MTCommonLog.w("TcpChannlClient", "selectionKey is null");
            a(context, true);
            return null;
        }
        if (!next.isReadable()) {
            MTCommonLog.w("TcpChannlClient", "selectionKey is disReadable");
            a(context, true);
            return null;
        }
        SocketChannel socketChannel = (SocketChannel) next.channel();
        if (!socketChannel.isConnected()) {
            MTCommonLog.w("TcpChannlClient", "socketChannel is disConnected");
            a(context, true);
            return null;
        }
        if (b()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
            int i = socketChannel.read(byteBufferAllocate);
            if (i < 0) {
                MTCommonLog.w("TcpChannlClient", "read ahead length = " + i);
                a(context, true);
                return null;
            }
            byte[] bArrArray = byteBufferAllocate.array();
            int i2 = ByteBuffer.wrap(bArrArray).getShort() & 16383;
            if (i2 == 0) {
                MTCommonLog.w("TcpChannlClient", "read total length = " + i2);
                a(context, true);
                return null;
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i2 - 2);
            while (byteBufferAllocate2.hasRemaining()) {
                long j = socketChannel.read(byteBufferAllocate2);
                if (j < 0) {
                    MTCommonLog.w("TcpChannlClient", "read content n = " + j);
                    MTCommonLog.w("TcpChannlClient", "read content position = " + byteBufferAllocate2.position());
                    MTCommonLog.w("TcpChannlClient", "read content limit = " + byteBufferAllocate2.limit());
                    a(context, true);
                    return null;
                }
            }
            byte[] bArrArray2 = byteBufferAllocate2.array();
            byte[] bArr = new byte[i2];
            System.arraycopy(bArrArray, 0, bArr, 0, bArrArray.length);
            System.arraycopy(bArrArray2, 0, bArr, bArrArray.length, bArrArray2.length);
            return bArr;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> i(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(j(context));
        Collections.shuffle(arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Set<String> j(Context context) {
        Set<String> setL = w.l(context);
        Address address = MTCoreGlobal.getAddress();
        int defaultPort = address.getDefaultPort();
        if (defaultPort <= 0) {
            return setL;
        }
        String defaultHost = address.getDefaultHost();
        if (!TextUtils.isEmpty(defaultHost)) {
            setL.add(defaultHost + ":" + defaultPort);
        }
        String defaultIp = address.getDefaultIp();
        if (!TextUtils.isEmpty(defaultIp)) {
            setL.add(defaultIp + ":" + defaultPort);
        }
        return setL;
    }

    @Override // com.engagelab.privates.common.q
    public boolean c(Context context, byte[] bArr) throws IOException {
        SocketChannel socketChannel = this.e;
        if (socketChannel == null || !socketChannel.isConnected()) {
            return false;
        }
        this.e.write(ByteBuffer.wrap(bArr));
        return true;
    }
}
