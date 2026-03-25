package o;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LA implements LJ {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    public LA(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = str;
        this.KWHzl = str2;
        this.gEmmrt = LE.AEQbTJ(context);
        this.OLrzqt = LE.copydefault(context);
        this.djBIcL = "Android";
        java.lang.String language = java.util.Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "");
        this.copydefault = language;
        this.AYXKKw = "android " + Build.VERSION.RELEASE;
        java.lang.String str3 = android.os.Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(str3, "");
        this.EZpvd = str3;
        java.lang.String str4 = android.os.Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(str4, "");
        this.AEQbTJ = str4;
        java.lang.String str5 = android.os.Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str5, "");
        this.valueOf = str5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LA(@NotNull android.content.Context context) {
        this(context, null, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.LJ
    public LF AEQbTJ() {
        return LF.Companion.copydefault().copydefault(this.KWHzl).fetchVPNInfo(this.AhwBna).DbNXlk(this.gEmmrt).values(this.djBIcL).djBIcL(this.copydefault).AkhnZx(this.AYXKKw).AEQbTJ(this.EZpvd).gEmmrt(this.AEQbTJ).valueOf(this.valueOf).EZpvd(this.OLrzqt).OLrzqt();
    }
}
