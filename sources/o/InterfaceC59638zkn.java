package o;

import java.net.InetSocketAddress;
import java.net.Socket;

/* JADX INFO: renamed from: o.zkn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public interface InterfaceC59638zkn {
    Socket connectSocket(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException;

    Socket createSocket(InterfaceC59779znV interfaceC59779znV) throws java.io.IOException;

    boolean isSecure(Socket socket) throws java.lang.IllegalArgumentException;
}
