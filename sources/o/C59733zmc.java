package o;

import java.net.UnknownHostException;

/* JADX INFO: renamed from: o.zmc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59733zmc implements InterfaceC59559zjN {
    public static final C59733zmc copydefault = new C59733zmc();

    @Override // o.InterfaceC59559zjN
    public java.net.InetAddress[] AEQbTJ(java.lang.String str) throws UnknownHostException {
        return java.net.InetAddress.getAllByName(str);
    }
}
