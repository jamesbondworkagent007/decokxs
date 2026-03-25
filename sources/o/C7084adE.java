package o;

import o.C7119adn;

/* JADX INFO: renamed from: o.adE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7084adE extends AbstractC7131adz {
    public C7084adE(C7119adn.Activity activity) {
        super(activity);
    }

    public static C7084adE OLrzqt(C7119adn.Activity activity) {
        if (activity == null) {
            return null;
        }
        return new C7084adE(activity);
    }

    @Override // o.AbstractC7131adz
    public InterfaceC7129adx AEQbTJ(C7119adn.Activity activity) {
        return OLrzqt(activity);
    }

    @Override // o.AbstractC7131adz
    public C7126adu AEQbTJ(long j, long j2, boolean z) {
        short sEZpvd = this.KWHzl.EZpvd();
        int i = 0;
        while (true) {
            C7080adA[] c7080adAArr = C7080adA.AYXKKw;
            if (i >= c7080adAArr.length) {
                return null;
            }
            if (((1 << i) & sEZpvd) != 0) {
                C7080adA c7080adA = c7080adAArr[i];
                long jOLrzqt = OLrzqt(c7080adA);
                if (j >= jOLrzqt) {
                    return C7126adu.copydefault((float) (j / jOLrzqt), c7080adA).copydefault(z);
                }
            }
            i++;
        }
    }
}
