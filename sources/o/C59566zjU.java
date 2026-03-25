package o;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: o.zjU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public final class C59566zjU implements InterfaceC59568zjW {
    public final ConcurrentHashMap<C59570zjY, java.lang.Integer> KWHzl;
    public volatile int copydefault;

    public C59566zjU(int i) {
        this.KWHzl = new ConcurrentHashMap<>();
        OLrzqt(i);
    }

    public C59566zjU() {
        this(2);
    }

    public void OLrzqt(int i) {
        C59851zoo.EZpvd(i, "Default max per route");
        this.copydefault = i;
    }

    @Override // o.InterfaceC59568zjW
    public int KWHzl(C59570zjY c59570zjY) {
        C59851zoo.AEQbTJ(c59570zjY, "HTTP route");
        java.lang.Integer num = this.KWHzl.get(c59570zjY);
        return num != null ? num.intValue() : this.copydefault;
    }

    public java.lang.String toString() {
        return this.KWHzl.toString();
    }
}
