package o;

import com.immomo.mls.fun.ud.view.UDViewPager;

/* JADX INFO: renamed from: o.arD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7825arD {
    public boolean KWHzl = false;

    public void OLrzqt(UDViewPager uDViewPager, int i, int i2, boolean z) {
        if (uDViewPager == null || !this.KWHzl || z) {
            return;
        }
        int iMin = java.lang.Math.min(i, i2);
        int iMax = java.lang.Math.max(i, i2);
        while (true) {
            iMin++;
            if (iMin >= iMax) {
                return;
            }
            uDViewPager.AEQbTJ(iMin);
            uDViewPager.OLrzqt(iMin);
        }
    }
}
