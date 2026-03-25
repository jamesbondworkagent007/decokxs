package o;

import java.net.Socket;

/* JADX INFO: renamed from: o.zkq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public interface InterfaceC59641zkq {
    Socket connectSocket(Socket socket, java.lang.String str, int i, java.net.InetAddress inetAddress, int i2, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException;

    Socket createSocket() throws java.io.IOException;

    boolean isSecure(Socket socket) throws java.lang.IllegalArgumentException;
}
