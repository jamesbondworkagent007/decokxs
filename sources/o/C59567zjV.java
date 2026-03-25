package o;

import org.apache.http.client.params.ClientPNames;

/* JADX INFO: renamed from: o.zjV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public final class C59567zjV {
    public static final InterfaceC59568zjW AEQbTJ = new InterfaceC59568zjW() { // from class: o.zjV.5
        @Override // o.InterfaceC59568zjW
        public int KWHzl(C59570zjY c59570zjY) {
            return 2;
        }
    };

    @java.lang.Deprecated
    public static void OLrzqt(InterfaceC59779znV interfaceC59779znV, long j) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        interfaceC59779znV.setLongParameter(ClientPNames.CONN_MANAGER_TIMEOUT, j);
    }

    public static void KWHzl(InterfaceC59779znV interfaceC59779znV, InterfaceC59568zjW interfaceC59568zjW) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        interfaceC59779znV.setParameter("http.conn-manager.max-per-route", interfaceC59568zjW);
    }

    public static InterfaceC59568zjW AEQbTJ(InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        InterfaceC59568zjW interfaceC59568zjW = (InterfaceC59568zjW) interfaceC59779znV.getParameter("http.conn-manager.max-per-route");
        return interfaceC59568zjW == null ? AEQbTJ : interfaceC59568zjW;
    }

    public static void KWHzl(InterfaceC59779znV interfaceC59779znV, int i) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        interfaceC59779znV.setIntParameter("http.conn-manager.max-total", i);
    }

    public static int EZpvd(InterfaceC59779znV interfaceC59779znV) {
        C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
        return interfaceC59779znV.getIntParameter("http.conn-manager.max-total", 20);
    }
}
