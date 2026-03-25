package o;

import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xNg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54570xNg extends C54571xNh {
    public java.lang.String copydefault = "1";

    public final C54571xNh KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str4 == null) {
            str4 = "1";
        }
        this.copydefault = str4;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.RgaQzq);
        if (str3 == null) {
            str3 = "0";
        }
        OLrzqt(str2, str, strAYXKKw, str3);
        return this;
    }

    @Override // o.C54571xNh
    public java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return null;
        }
        return C33129mqd.mulS$default(C33129mqd.mulS$default(str, AEQbTJ(), null, null, null, 14, null), EZpvd(), null, null, null, 14, null);
    }

    @Override // o.C54571xNh
    public java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return null;
        }
        java.lang.String strDivS$default = C33129mqd.divS$default(str, C33129mqd.mulS$default(EZpvd(), AEQbTJ(), null, null, null, 14, null), null, null, null, 14, null);
        return C33129mqd.gEmmrt(strDivS$default, this.copydefault) ? this.copydefault : strDivS$default;
    }
}
