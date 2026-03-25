package o;

import com.okinc.business.defi.api.bean.CurrencyPrependSign;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xYp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54876xYp {
    public final java.lang.String EZpvd;
    public final CurrencyPrependSign KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyPrependSign EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public C54876xYp(@NotNull java.lang.String str, @NotNull CurrencyPrependSign currencyPrependSign) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(currencyPrependSign, "");
        this.EZpvd = str;
        this.KWHzl = currencyPrependSign;
    }
}
