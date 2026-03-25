package o;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: o.zmp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59746zmp implements InterfaceC59605zkG {
    public final java.util.Map<java.lang.String, InterfaceC59603zkE> KWHzl;

    public AbstractC59746zmp() {
        this.KWHzl = new ConcurrentHashMap(10);
    }

    public AbstractC59746zmp(InterfaceC59650zkz... interfaceC59650zkzArr) {
        this.KWHzl = new ConcurrentHashMap(interfaceC59650zkzArr.length);
        for (InterfaceC59650zkz interfaceC59650zkz : interfaceC59650zkzArr) {
            this.KWHzl.put(interfaceC59650zkz.OLrzqt(), interfaceC59650zkz);
        }
    }

    public InterfaceC59603zkE AEQbTJ(java.lang.String str) {
        return this.KWHzl.get(str);
    }

    public java.util.Collection<InterfaceC59603zkE> copydefault() {
        return this.KWHzl.values();
    }
}
