package o;

import java.net.Socket;

/* JADX INFO: renamed from: o.zkj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59634zkj extends C59639zko implements InterfaceC59637zkm {
    public final InterfaceC59630zkf AEQbTJ;

    public C59634zkj(InterfaceC59630zkf interfaceC59630zkf) {
        super(interfaceC59630zkf);
        this.AEQbTJ = interfaceC59630zkf;
    }

    @Override // o.InterfaceC59637zkm
    public Socket createLayeredSocket(Socket socket, java.lang.String str, int i, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        return this.AEQbTJ.createSocket(socket, str, i, true);
    }
}
