package o;

import com.okinc.captcha.impl.data.CaptchaVendor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lVz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30373lVz {
    public static final C30373lVz copydefault = new C30373lVz();
    public static java.util.List<? extends CaptchaVendor> OLrzqt = yDY.AhwBna();
    public static final int AEQbTJ = 8;

    private C30373lVz() {
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: java.util.List<? extends com.okinc.captcha.impl.data.CaptchaVendor>, java.util.List<com.okinc.captcha.impl.data.CaptchaVendor> */
    public final java.util.List<CaptchaVendor> KWHzl() {
        java.util.List list;
        synchronized (this) {
            list = OLrzqt;
        }
        return list;
    }

    public final void AEQbTJ(@NotNull java.util.List<? extends CaptchaVendor> list) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(list, "");
            OLrzqt = list;
        }
    }
}
