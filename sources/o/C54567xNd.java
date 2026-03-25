package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xNd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54567xNd extends C54571xNh {
    public java.lang.String OLrzqt = "1";

    @Override // o.C54571xNh
    public java.lang.String KWHzl() {
        return C33129mqd.gEmmrt(java.lang.Integer.valueOf(C33129mqd.copydefault(C33129mqd.formatS$default(copydefault(), null, java.lang.Boolean.TRUE, null, 5, null)).scale()));
    }

    public final void OLrzqt(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str3 == null) {
            str3 = "1";
        }
        this.OLrzqt = str3;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.RgaQzq);
        if (str2 == null) {
            str2 = "0";
        }
        OLrzqt(str, MultiTransferSignData.DEFAULT_INTERVAL, strAYXKKw, str2);
    }

    @Override // o.C54571xNh
    public java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.mulS$default(str, copydefault(), null, null, null, 14, null);
    }

    @Override // o.C54571xNh
    public java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strDivS$default = C33129mqd.divS$default(str, copydefault(), null, null, null, 14, null);
        return C33129mqd.gEmmrt(strDivS$default, this.OLrzqt) ? this.OLrzqt : strDivS$default;
    }
}
