package o;

/* JADX INFO: renamed from: o.Oy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5366Oy {
    public final java.util.Map<NH, C5359Or<?>> AEQbTJ = new java.util.HashMap();
    public final java.util.Map<NH, C5359Or<?>> OLrzqt = new java.util.HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<NH, C5359Or<?>> OLrzqt(boolean z) {
        return z ? this.OLrzqt : this.AEQbTJ;
    }

    public C5359Or<?> EZpvd(NH nh, boolean z) {
        return OLrzqt(z).get(nh);
    }

    public void copydefault(NH nh, C5359Or<?> c5359Or) {
        OLrzqt(c5359Or.AhwBna()).put(nh, c5359Or);
    }

    public void KWHzl(NH nh, C5359Or<?> c5359Or) {
        java.util.Map<NH, C5359Or<?>> mapOLrzqt = OLrzqt(c5359Or.AhwBna());
        if (c5359Or.equals(mapOLrzqt.get(nh))) {
            mapOLrzqt.remove(nh);
        }
    }
}
