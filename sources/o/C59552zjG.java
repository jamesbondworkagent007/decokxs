package o;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: o.zjG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59552zjG<I> implements InterfaceC59548zjC<I> {
    public final java.util.Map<java.lang.String, I> AEQbTJ;

    public C59552zjG(java.util.Map<java.lang.String, I> map) {
        this.AEQbTJ = new ConcurrentHashMap(map);
    }

    @Override // o.InterfaceC59548zjC
    public I KWHzl(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return this.AEQbTJ.get(str.toLowerCase(java.util.Locale.ROOT));
    }

    public java.lang.String toString() {
        return this.AEQbTJ.toString();
    }
}
