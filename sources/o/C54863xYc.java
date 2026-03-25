package o;

import com.okinc.localization.util.currency.Notation;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xYc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54863xYc {
    public static /* synthetic */ java.lang.String formatFiatCodeSafe$default(java.lang.Number number, java.lang.String str, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, Notation notation, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 4) != 0) {
            c38307pTy = C38307pTy.Companion.EZpvd(C38306pTx.AEQbTJ.AEQbTJ(str));
        }
        C38307pTy c38307pTy2 = c38307pTy;
        if ((i & 8) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        DisplaySign displaySign2 = displaySign;
        if ((i & 16) != 0) {
            notation = Notation.DEFAULT;
        }
        Notation notation2 = notation;
        if ((i & 32) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return KWHzl(number, str, roundingMode2, c38307pTy2, displaySign2, notation2, locale);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.Number number, @NotNull java.lang.String str, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull Notation notation, @NotNull java.util.Locale locale) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(notation, "");
        Intrinsics.checkNotNullParameter(locale, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C38305pTw.OLrzqt(number, str, roundingMode, c38307pTy, displaySign, notation, locale));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("WalletCurrencyFormat", "Failed to formatFiatCode", thM7380exceptionOrNullimpl);
            objM7377constructorimpl = number.toString();
        }
        return (java.lang.String) objM7377constructorimpl;
    }

    public static /* synthetic */ java.lang.String formatFiatSymbolSafe$default(java.lang.Number number, java.lang.String str, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, Notation notation, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 4) != 0) {
            c38307pTy = C38307pTy.Companion.EZpvd(C38306pTx.AEQbTJ.AEQbTJ(str));
        }
        C38307pTy c38307pTy2 = c38307pTy;
        if ((i & 8) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        DisplaySign displaySign2 = displaySign;
        if ((i & 16) != 0) {
            notation = Notation.DEFAULT;
        }
        Notation notation2 = notation;
        if ((i & 32) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return EZpvd(number, str, roundingMode2, c38307pTy2, displaySign2, notation2, locale);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.Number number, @NotNull java.lang.String str, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull Notation notation, @NotNull java.util.Locale locale) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(notation, "");
        Intrinsics.checkNotNullParameter(locale, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C38305pTw.EZpvd(number, str, roundingMode, c38307pTy, displaySign, notation, locale));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("WalletCurrencyFormat", "Failed to formatFiatSymbol", thM7380exceptionOrNullimpl);
            objM7377constructorimpl = number.toString();
        }
        return (java.lang.String) objM7377constructorimpl;
    }

    public static /* synthetic */ java.lang.String formatCryptoCodeSafe$default(java.lang.Number number, java.lang.String str, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, Notation notation, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 4) != 0) {
            c38307pTy = C38307pTy.Companion.EZpvd(2);
        }
        C38307pTy c38307pTy2 = c38307pTy;
        if ((i & 8) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        DisplaySign displaySign2 = displaySign;
        if ((i & 16) != 0) {
            notation = Notation.DEFAULT;
        }
        Notation notation2 = notation;
        if ((i & 32) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return copydefault(number, str, roundingMode2, c38307pTy2, displaySign2, notation2, locale);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.Number number, @NotNull java.lang.String str, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull Notation notation, @NotNull java.util.Locale locale) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(notation, "");
        Intrinsics.checkNotNullParameter(locale, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C38305pTw.copydefault(number, str, roundingMode, c38307pTy, displaySign, notation, locale));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("WalletCurrencyFormat", "Failed to formatCryptoCode", thM7380exceptionOrNullimpl);
            objM7377constructorimpl = number.toString();
        }
        return (java.lang.String) objM7377constructorimpl;
    }

    public static /* synthetic */ java.lang.String formatCryptoSymbolSafe$default(java.lang.Number number, java.lang.String str, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, Notation notation, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 4) != 0) {
            c38307pTy = C38307pTy.Companion.EZpvd(2);
        }
        C38307pTy c38307pTy2 = c38307pTy;
        if ((i & 8) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        DisplaySign displaySign2 = displaySign;
        if ((i & 16) != 0) {
            notation = Notation.DEFAULT;
        }
        Notation notation2 = notation;
        if ((i & 32) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return AEQbTJ(number, str, roundingMode2, c38307pTy2, displaySign2, notation2, locale);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.Number number, @NotNull java.lang.String str, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull Notation notation, @NotNull java.util.Locale locale) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(notation, "");
        Intrinsics.checkNotNullParameter(locale, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C38305pTw.KWHzl(number, str, roundingMode, c38307pTy, displaySign, notation, locale));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("WalletCurrencyFormat", "Failed to formatCryptoSymbol", thM7380exceptionOrNullimpl);
            objM7377constructorimpl = number.toString();
        }
        return (java.lang.String) objM7377constructorimpl;
    }
}
