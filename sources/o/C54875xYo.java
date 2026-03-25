package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.api.bean.CurrencyPrependSign;
import com.okinc.wallet.core.formatter.WalletCurrencyBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xYo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54875xYo {
    public final WalletCurrencyBean AEQbTJ;
    public final java.lang.String EZpvd;
    public final CurrencyDisplayStyle KWHzl;
    public final CurrencyPrependSign copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletCurrencyBean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyDisplayStyle OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyPrependSign copydefault() {
        return this.copydefault;
    }

    public C54875xYo(@NotNull java.lang.String str, WalletCurrencyBean walletCurrencyBean, @NotNull CurrencyPrependSign currencyPrependSign, @NotNull CurrencyDisplayStyle currencyDisplayStyle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(currencyPrependSign, "");
        Intrinsics.checkNotNullParameter(currencyDisplayStyle, "");
        this.EZpvd = str;
        this.AEQbTJ = walletCurrencyBean;
        this.copydefault = currencyPrependSign;
        this.KWHzl = currencyDisplayStyle;
    }
}
