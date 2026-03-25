package o;

import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hvy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23321hvy {
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;

    public C23321hvy(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.OLrzqt = str2;
        this.KWHzl = str3;
    }

    public final java.lang.String KWHzl() {
        java.lang.String str = this.KWHzl;
        if (str != null) {
            java.lang.String string = SPUtils.getString(this.EZpvd, this.OLrzqt, str);
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }
        java.lang.String string2 = SPUtils.getString(this.EZpvd, this.OLrzqt);
        Intrinsics.copydefault((java.lang.Object) string2);
        return string2;
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = this.KWHzl;
        if (str2 != null) {
            SPUtils.put(this.EZpvd, str, str2);
        } else {
            SPUtils.put(this.EZpvd, str);
        }
    }
}
