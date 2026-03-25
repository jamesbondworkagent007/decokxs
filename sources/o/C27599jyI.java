package o;

import com.okinc.business.market.data.constant.AddressTrackerUserAction;

/* JADX INFO: renamed from: o.jyI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27599jyI {
    public static final java.util.Set<java.lang.Integer> EZpvd = yEE.AhwBna(java.lang.Integer.valueOf(AddressTrackerUserAction.BUY.getValue()), java.lang.Integer.valueOf(AddressTrackerUserAction.BUY_MORE.getValue()), java.lang.Integer.valueOf(AddressTrackerUserAction.NEWLY_HOLD.getValue()));

    public static final boolean copydefault(int i) {
        return EZpvd.contains(java.lang.Integer.valueOf(i));
    }
}
