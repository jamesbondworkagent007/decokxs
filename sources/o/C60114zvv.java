package o;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: o.zvv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60114zvv implements InterfaceC60098zvf {
    public volatile boolean AEQbTJ = false;
    public final java.util.Map<java.lang.String, C60115zvw> EZpvd = new ConcurrentHashMap();
    public final LinkedBlockingQueue<C60107zvo> KWHzl = new LinkedBlockingQueue<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl() {
        this.AEQbTJ = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LinkedBlockingQueue<C60107zvo> OLrzqt() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC60098zvf
    public InterfaceC60100zvh copydefault(java.lang.String str) {
        C60115zvw c60115zvw;
        synchronized (this) {
            c60115zvw = this.EZpvd.get(str);
            if (c60115zvw == null) {
                c60115zvw = new C60115zvw(str, this.KWHzl, this.AEQbTJ);
                this.EZpvd.put(str, c60115zvw);
            }
        }
        return c60115zvw;
    }

    public java.util.List<C60115zvw> AEQbTJ() {
        return new java.util.ArrayList(this.EZpvd.values());
    }

    public void EZpvd() {
        this.EZpvd.clear();
        this.KWHzl.clear();
    }
}
