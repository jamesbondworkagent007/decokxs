package o;

import java.util.Calendar;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.axD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8141axD {
    public final C8142axE EZpvd;

    public C8141axD(android.content.Context context, InterfaceC5318Nc interfaceC5318Nc) {
        C8142axE c8142axE = new C8142axE(2);
        this.EZpvd = c8142axE;
        c8142axE.KWHzl = context;
        c8142axE.djSkpj = interfaceC5318Nc;
    }

    public final C8141axD AEQbTJ(boolean[] zArr) {
        this.EZpvd.UeEOUB = zArr;
        return this;
    }

    public final C8141axD AEQbTJ(android.view.ViewGroup viewGroup) {
        this.EZpvd.fetchVPNInfo = viewGroup;
        return this;
    }

    public final C8141axD EZpvd(int i) {
        this.EZpvd.AEQbTJ = i;
        return this;
    }

    public final C8141axD AEQbTJ(int i) {
        this.EZpvd.RJOkX = i;
        return this;
    }

    public final C8141axD OLrzqt(int i) {
        this.EZpvd.uzCIH = i;
        return this;
    }

    public final C8141axD AEQbTJ(Calendar calendar) {
        this.EZpvd.AkhnZx = calendar;
        return this;
    }

    public final C8141axD EZpvd(int i, MY my) {
        C8142axE c8142axE = this.EZpvd;
        c8142axE.zLjUOn = i;
        c8142axE.AYXKKw = my;
        return this;
    }

    public final C8141axD KWHzl(Calendar calendar, Calendar calendar2) {
        C8142axE c8142axE = this.EZpvd;
        c8142axE.sSMYrx = calendar;
        c8142axE.DbNXlk = calendar2;
        return this;
    }

    public final C8141axD EZpvd(float f) {
        this.EZpvd.AwvSrB = f;
        return this;
    }

    public final C8141axD KWHzl(@androidx.annotation.ColorInt int i) {
        this.EZpvd.isConnected = i;
        return this;
    }

    public final C8141axD copydefault(@androidx.annotation.ColorInt int i) {
        this.EZpvd.ORxRYg = i;
        return this;
    }

    public final C8141axD djBIcL(@androidx.annotation.ColorInt int i) {
        this.EZpvd.QOLQEE = i;
        return this;
    }

    public final C8141axD copydefault(boolean z) {
        this.EZpvd.gEmmrt = z;
        return this;
    }

    public final C8141axD AEQbTJ(boolean z) {
        this.EZpvd.OLrzqt = z;
        return this;
    }

    public final C8141axD EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        C8142axE c8142axE = this.EZpvd;
        c8142axE.AuCTelauCTel = str;
        c8142axE.AubY = str2;
        c8142axE.iwGUEr = str3;
        c8142axE.hDKMBd = str4;
        c8142axE.zsXlph = str5;
        c8142axE.wlaJM = str6;
        return this;
    }

    public final C8141axD OLrzqt(InterfaceC5319Nd interfaceC5319Nd) {
        this.EZpvd.dNCPSb = interfaceC5319Nd;
        return this;
    }

    public final C8141axD AEQbTJ(@NotNull android.graphics.Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "");
        this.EZpvd.AuCTel = typeface;
        return this;
    }

    public final C8141axD EZpvd(@NotNull TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(timeZone, "");
        this.EZpvd.OLrzqt(timeZone);
        return this;
    }

    public final TimeZone copydefault() {
        return this.EZpvd.AEQbTJ();
    }

    public final ViewOnClickListenerC8143axF OLrzqt() {
        return new ViewOnClickListenerC8143axF(this.EZpvd);
    }
}
