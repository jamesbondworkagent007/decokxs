package o;

import java.net.Socket;

/* JADX INFO: renamed from: o.zns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59802zns extends AbstractC59788zne implements InterfaceC59803znt {
    public boolean AkhnZx;
    public final Socket fIwbmz;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59803znt
    public boolean copydefault() {
        return this.AkhnZx;
    }

    public C59802zns(Socket socket, int i, InterfaceC59779znV interfaceC59779znV) throws java.io.IOException {
        C59851zoo.AEQbTJ(socket, "Socket");
        this.fIwbmz = socket;
        this.AkhnZx = false;
        i = i < 0 ? socket.getReceiveBufferSize() : i;
        OLrzqt(socket.getInputStream(), i < 1024 ? 1024 : i, interfaceC59779znV);
    }

    @Override // o.AbstractC59788zne
    public int EZpvd() throws java.io.IOException {
        int iEZpvd = super.EZpvd();
        this.AkhnZx = iEZpvd == -1;
        return iEZpvd;
    }

    @Override // o.InterfaceC59758znA
    public boolean copydefault(int i) throws java.io.IOException {
        boolean zDjBIcL = djBIcL();
        if (zDjBIcL) {
            return zDjBIcL;
        }
        int soTimeout = this.fIwbmz.getSoTimeout();
        try {
            this.fIwbmz.setSoTimeout(i);
            EZpvd();
            return djBIcL();
        } finally {
            this.fIwbmz.setSoTimeout(soTimeout);
        }
    }
}
