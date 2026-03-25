package o;

import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hvp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23312hvp {
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final boolean OLrzqt;

    public C23312hvp(@NotNull java.lang.String str, boolean z, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.OLrzqt = z;
        this.KWHzl = str2;
    }

    public final boolean EZpvd() {
        java.lang.String str = this.KWHzl;
        if (str != null) {
            return SPUtils.getBoolean(this.EZpvd, this.OLrzqt, str);
        }
        return SPUtils.getBoolean(this.EZpvd, this.OLrzqt);
    }

    public final void OLrzqt(boolean z) {
        if (this.KWHzl != null) {
            SPUtils.put(this.EZpvd, java.lang.Boolean.valueOf(z), this.KWHzl);
        } else {
            SPUtils.put(this.EZpvd, java.lang.Boolean.valueOf(z));
        }
    }
}
