package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xMZ extends C54571xNh {
    public java.lang.String EZpvd = "1";
    public boolean copydefault;

    @Override // o.C54571xNh
    public java.lang.String KWHzl() {
        if (!Intrinsics.EZpvd((java.lang.Object) super.KWHzl(), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            return super.KWHzl();
        }
        java.lang.String strEZpvd = EZpvd();
        return strEZpvd == null ? "" : strEZpvd;
    }

    public final C54571xNh AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str4 == null) {
            str4 = "1";
        }
        this.EZpvd = str4;
        this.copydefault = z;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.RgaQzq);
        if (str3 == null) {
            str3 = "0";
        }
        OLrzqt(str, str2, strAYXKKw, str3);
        return this;
    }

    @Override // o.C54571xNh
    public java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strEZpvd = EZpvd();
        if (strEZpvd == null || strEZpvd.length() == 0) {
            return null;
        }
        if (this.copydefault) {
            return C33129mqd.mulS$default(str, EZpvd(), null, null, null, 14, null);
        }
        java.lang.String strAEQbTJ = AEQbTJ();
        if (strAEQbTJ == null || strAEQbTJ.length() == 0) {
            return null;
        }
        return C33129mqd.divS$default(C33129mqd.mulS$default(str, EZpvd(), null, null, null, 14, null), AEQbTJ(), null, null, null, 14, null);
    }

    @Override // o.C54571xNh
    public java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strEZpvd = EZpvd();
        if (strEZpvd == null || strEZpvd.length() == 0) {
            return null;
        }
        if (this.copydefault) {
            java.lang.String strDivS$default = C33129mqd.divS$default(str, EZpvd(), null, null, null, 14, null);
            return C33129mqd.gEmmrt(strDivS$default, this.EZpvd) ? this.EZpvd : strDivS$default;
        }
        java.lang.String strAEQbTJ = AEQbTJ();
        if (strAEQbTJ == null || strAEQbTJ.length() == 0) {
            return null;
        }
        java.lang.String strDivS$default2 = C33129mqd.divS$default(C33129mqd.mulS$default(str, AEQbTJ(), null, null, null, 14, null), EZpvd(), null, null, null, 14, null);
        return C33129mqd.gEmmrt(strDivS$default2, this.EZpvd) ? this.EZpvd : strDivS$default2;
    }
}
