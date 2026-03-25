package o;

import com.okinc.rxutils.AndroidThreadFactory;

/* JADX INFO: renamed from: o.udJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48839udJ {
    public static final int AEQbTJ;
    public static final AbstractC58253yxm EZpvd;
    public static final C48839udJ KWHzl = new C48839udJ();
    public static final AbstractC58253yxm OLrzqt;
    public static final AndroidThreadFactory copydefault;

    private C48839udJ() {
    }

    static {
        java.lang.Integer integer = java.lang.Integer.getInteger("ok.io-priority", 5);
        int iCopydefault = C56548yJl.copydefault(1, C56548yJl.valueOf(10, integer != null ? integer.intValue() : 5));
        java.lang.Integer integer2 = java.lang.Integer.getInteger("ok.io-android-priority", 0);
        AndroidThreadFactory androidThreadFactory = new AndroidThreadFactory("OKRxCachedThreadScheduler", iCopydefault, C56548yJl.copydefault(-19, C56548yJl.valueOf(19, integer2 != null ? integer2.intValue() : 0)));
        copydefault = androidThreadFactory;
        OLrzqt = new yAU(androidThreadFactory);
        EZpvd = new yAU();
        AEQbTJ = 8;
    }
}
