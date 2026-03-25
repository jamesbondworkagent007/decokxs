package o;

import o.C7119adn;

/* JADX INFO: renamed from: o.adz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC7131adz implements InterfaceC7129adx {
    public C7119adn.Activity KWHzl;

    public abstract C7126adu AEQbTJ(long j, long j2, boolean z);

    public abstract InterfaceC7129adx AEQbTJ(C7119adn.Activity activity);

    public long OLrzqt(C7080adA c7080adA) {
        return C7119adn.KWHzl(c7080adA);
    }

    @Override // o.InterfaceC7129adx
    public C7126adu OLrzqt(long j, long j2) {
        boolean z = j < 0;
        if (z) {
            j = -j;
        }
        long j3 = j;
        C7126adu c7126aduEZpvd = this.KWHzl.EZpvd(j3, z);
        if (c7126aduEZpvd != null) {
            return c7126aduEZpvd;
        }
        C7126adu c7126aduAEQbTJ = AEQbTJ(j3, j2, z);
        return c7126aduAEQbTJ == null ? C7126adu.EZpvd(1.0f, this.KWHzl.AEQbTJ()).copydefault(z) : c7126aduAEQbTJ;
    }

    @Override // o.InterfaceC7129adx
    public InterfaceC7129adx copydefault(java.lang.String str) {
        C7119adn.Activity activityAEQbTJ = this.KWHzl.AEQbTJ(str);
        return activityAEQbTJ != this.KWHzl ? AEQbTJ(activityAEQbTJ) : this;
    }

    public AbstractC7131adz(C7119adn.Activity activity) {
        this.KWHzl = activity;
    }
}
