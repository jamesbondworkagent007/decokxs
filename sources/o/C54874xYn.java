package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.api.bean.CurrencyPrependSign;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xYn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54874xYn {
    public final java.lang.String AEQbTJ;
    public final CurrencyDisplayStyle EZpvd;
    public final CurrencyPrependSign KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyPrependSign AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyDisplayStyle copydefault() {
        return this.EZpvd;
    }

    public C54874xYn(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull CurrencyPrependSign currencyPrependSign, @NotNull CurrencyDisplayStyle currencyDisplayStyle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(currencyPrependSign, "");
        Intrinsics.checkNotNullParameter(currencyDisplayStyle, "");
        this.copydefault = str;
        this.OLrzqt = str2;
        this.AEQbTJ = str3;
        this.KWHzl = currencyPrependSign;
        this.EZpvd = currencyDisplayStyle;
    }
}
