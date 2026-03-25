package o;

import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class RI implements InterfaceC5441Rv {
    public final java.util.Set<InterfaceC5462Sq<?>> AEQbTJ = Collections.newSetFromMap(new WeakHashMap());

    public void KWHzl(@androidx.annotation.NonNull InterfaceC5462Sq<?> interfaceC5462Sq) {
        this.AEQbTJ.add(interfaceC5462Sq);
    }

    public void OLrzqt(@androidx.annotation.NonNull InterfaceC5462Sq<?> interfaceC5462Sq) {
        this.AEQbTJ.remove(interfaceC5462Sq);
    }

    @Override // o.InterfaceC5441Rv
    public void AYXKKw() {
        java.util.Iterator it = SI.AEQbTJ(this.AEQbTJ).iterator();
        while (it.hasNext()) {
            ((InterfaceC5462Sq) it.next()).AYXKKw();
        }
    }

    @Override // o.InterfaceC5441Rv
    public void AhwBna() {
        java.util.Iterator it = SI.AEQbTJ(this.AEQbTJ).iterator();
        while (it.hasNext()) {
            ((InterfaceC5462Sq) it.next()).AhwBna();
        }
    }

    @Override // o.InterfaceC5441Rv
    public void valueOf() {
        java.util.Iterator it = SI.AEQbTJ(this.AEQbTJ).iterator();
        while (it.hasNext()) {
            ((InterfaceC5462Sq) it.next()).valueOf();
        }
    }

    public java.util.List<InterfaceC5462Sq<?>> KWHzl() {
        return SI.AEQbTJ(this.AEQbTJ);
    }

    public void AEQbTJ() {
        this.AEQbTJ.clear();
    }
}
