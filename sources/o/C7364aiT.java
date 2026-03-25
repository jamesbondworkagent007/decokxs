package o;

import android.view.View;

/* JADX INFO: renamed from: o.aiT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7364aiT {
    public static int KWHzl(int i, double d) {
        int iCopydefault = C7865arr.copydefault(d);
        if (i == 1) {
            return View.MeasureSpec.makeMeasureSpec(iCopydefault, Integer.MIN_VALUE);
        }
        if (i == 2) {
            return View.MeasureSpec.makeMeasureSpec(iCopydefault, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(iCopydefault, 0);
    }
}
