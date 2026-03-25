package o;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class sMK implements sMN {
    public final CopyOnWriteArrayList<sGD> KWHzl = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<sGE> EZpvd = new CopyOnWriteArrayList<>();

    @yCM
    public sMK() {
    }

    @Override // o.sMN
    public void OLrzqt(int i) {
        java.util.Iterator<T> it = this.KWHzl.iterator();
        while (it.hasNext()) {
            ((sGD) it.next()).EZpvd(i);
        }
    }

    @Override // o.sMN
    public void copydefault(int i) {
        java.util.Iterator<T> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            ((sGE) it.next()).copydefault().EZpvd(i);
        }
    }
}
