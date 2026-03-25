package o;

import kotlin.jvm.internal.Intrinsics;
import o.FA;

/* JADX INFO: loaded from: classes2.dex */
public final class FE {
    public static /* synthetic */ boolean isTerminal$default(FA fa, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return KWHzl(fa, i);
    }

    public static final boolean KWHzl(FA fa, int i) {
        return fa == null || Intrinsics.EZpvd(fa, FA.Activity.AEQbTJ) || fa.copydefault() < i;
    }

    public static final boolean EZpvd(FA fa, int i) {
        return !KWHzl(fa, i);
    }

    public static /* synthetic */ boolean isNotTerminal$default(FA fa, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return EZpvd(fa, i);
    }

    public static final boolean AEQbTJ(FA fa, FA fa2) {
        if (fa == null || fa2 == null || !(fa instanceof FA.StateListAnimator) || !(fa2 instanceof FA.ActionBar)) {
            return false;
        }
        FA.ActionBar actionBar = (FA.ActionBar) fa2;
        return fa.copydefault() == actionBar.copydefault() && Intrinsics.EZpvd(((FA.StateListAnimator) fa).AEQbTJ(), actionBar.OLrzqt());
    }
}
