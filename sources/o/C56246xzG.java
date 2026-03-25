package o;

import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56246xzG extends xKD {
    public final C56235xyw OLrzqt = new C56235xyw();
    public final xBF EZpvd = new xBF();

    public final C56246xzG EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C56235xyw c56235xyw = this.OLrzqt;
        c56235xyw.AEQbTJ(new C56109xwc());
        c56235xyw.KWHzl(str);
        c56235xyw.AEQbTJ(str2);
        c56235xyw.djBIcL();
        c56235xyw.fIwbmz();
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
        return this;
    }

    public final C56246xzG OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        xBF xbf = this.EZpvd;
        xbf.AEQbTJ(new C56109xwc());
        xbf.EZpvd(str);
        xbf.OLrzqt(str2);
        xbf.KWHzl(str3);
        xbf.copydefault(str4);
        xbf.AEQbTJ(str5);
        xbf.fIwbmz();
        xKK.Activity.execute$default(xbf, 0L, 1, null);
        return this;
    }

    public final java.lang.String EZpvd() {
        return this.OLrzqt.bB_();
    }

    public final java.lang.String AEQbTJ() {
        return this.EZpvd.bB_();
    }

    @Override // o.xKD
    public java.util.List<xKK> values() {
        return yDY.gEmmrt(this.OLrzqt, this.EZpvd);
    }
}
