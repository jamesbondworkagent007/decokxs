package o;

import java.math.RoundingMode;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: renamed from: o.xvG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56034xvG {
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    public C56034xvG(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.copydefault = str;
        this.KWHzl = str2;
        this.OLrzqt = str3;
    }

    public final java.lang.String KWHzl(boolean z, boolean z2) {
        java.lang.String str;
        java.lang.String str2 = this.copydefault;
        if (str2 == null || str2.length() == 0 || (str = this.OLrzqt) == null || str.length() == 0) {
            return "";
        }
        return C56068xvo.copydefault.AEQbTJ("", "", this.copydefault, (536 & 8) != 0 ? "" : this.OLrzqt, (536 & 16) != 0, (536 & 32) != 0 ? false : z2, (536 & 64) != 0 ? false : z, (536 & 128) != 0 ? null : null, (536 & 256) != 0 ? RoundingMode.FLOOR : null, (536 & 512) != 0 ? null : null);
    }

    public final java.lang.String copydefault() {
        java.lang.String str = this.KWHzl;
        if (str == null || str.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            str = "0";
        }
        return C56033xvF.copydefault(str, "USDT", (88 & 4) != 0 ? false : false, (88 & 8) != 0 ? null : null, (88 & 16) != 0 ? false : false, (88 & 32) == 0, (88 & 64) == 0 ? null : null);
    }
}
