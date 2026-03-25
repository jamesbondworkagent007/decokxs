package o;

import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.Ro, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5434Ro implements InterfaceC5444Ry {
    public boolean KWHzl;
    public boolean OLrzqt;
    public final java.util.Set<InterfaceC5441Rv> copydefault = Collections.newSetFromMap(new WeakHashMap());

    @Override // o.InterfaceC5444Ry
    public void AEQbTJ(@androidx.annotation.NonNull InterfaceC5441Rv interfaceC5441Rv) {
        this.copydefault.add(interfaceC5441Rv);
        if (this.KWHzl) {
            interfaceC5441Rv.valueOf();
        } else if (this.OLrzqt) {
            interfaceC5441Rv.AYXKKw();
        } else {
            interfaceC5441Rv.AhwBna();
        }
    }

    @Override // o.InterfaceC5444Ry
    public void copydefault(@androidx.annotation.NonNull InterfaceC5441Rv interfaceC5441Rv) {
        this.copydefault.remove(interfaceC5441Rv);
    }

    public void copydefault() {
        this.OLrzqt = true;
        java.util.Iterator it = SI.AEQbTJ(this.copydefault).iterator();
        while (it.hasNext()) {
            ((InterfaceC5441Rv) it.next()).AYXKKw();
        }
    }

    public void AEQbTJ() {
        this.OLrzqt = false;
        java.util.Iterator it = SI.AEQbTJ(this.copydefault).iterator();
        while (it.hasNext()) {
            ((InterfaceC5441Rv) it.next()).AhwBna();
        }
    }

    public void EZpvd() {
        this.KWHzl = true;
        java.util.Iterator it = SI.AEQbTJ(this.copydefault).iterator();
        while (it.hasNext()) {
            ((InterfaceC5441Rv) it.next()).valueOf();
        }
    }
}
