package o;

import java.net.Socket;

/* JADX INFO: renamed from: o.znu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59804znu extends AbstractC59791znh {
    public C59804znu(Socket socket, int i, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        C59851zoo.AEQbTJ(socket, "Socket");
        i = i < 0 ? socket.getSendBufferSize() : i;
        AEQbTJ(socket.getOutputStream(), i < 1024 ? 1024 : i, interfaceC59779znV);
    }
}
