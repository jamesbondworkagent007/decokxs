package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.localization.util.currency.Notation;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.ranking.features.main.ui.RankingSubPage;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qxQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41786qxQ {
    public static final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ^ true ? (java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).get(0) : "--";
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (!(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ^ true) || StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).size() <= 1) ? "--" : (java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null).get(1);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        java.lang.Integer numValueOf = interfaceC46557tYt != null ? java.lang.Integer.valueOf(interfaceC46557tYt.EZpvd()) : null;
        return (numValueOf != null && numValueOf.intValue() == 1) ? str2 : (numValueOf != null && numValueOf.intValue() == 2) ? str3 : str;
    }

    public static final int OLrzqt(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal2) > 0) {
            return 3;
        }
        return bigDecimal.compareTo(bigDecimal2) < 0 ? 4 : 5;
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BigDecimal bigDecimalMultiply = C33129mqd.EZpvd(str).multiply(new BigDecimal(100));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "");
        java.lang.String iCUCompact$default = pTB.formatICUCompact$default(bigDecimalMultiply, null, C38307pTy.Companion.EZpvd(2), DisplaySign.EXCEPT_ZERO, null, 9, null);
        return pTF.KWHzl.AEQbTJ(iCUCompact$default + "%");
    }

    public static final RankingSubPage AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            return RankingSubPage.valueOf(str);
        } catch (java.lang.IllegalArgumentException unused) {
            return RankingSubPage.RANKING_HOT_CRYPTO;
        }
    }

    public static final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull InterfaceC54581xNr interfaceC54581xNr) {
        java.lang.Object objM7377constructorimpl;
        MutableLiveData<ValuationCurrencyData> mutableLiveDataBG_;
        ValuationCurrencyData value;
        java.lang.String isoCode;
        java.lang.String str4 = "";
        Intrinsics.checkNotNullParameter(interfaceC54581xNr, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) ? null : java.lang.String.valueOf(java.lang.Double.parseDouble(str) * java.lang.Double.parseDouble(str2)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.String str5 = (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        if (str5 != null) {
            str = str5;
        } else if (str3 != null) {
            str = str3;
        } else if (str == null) {
            str = "";
        }
        xOW newProxyInstance = interfaceC54581xNr.getNewProxyInstance();
        if (newProxyInstance != null && (mutableLiveDataBG_ = newProxyInstance.bG_()) != null && (value = mutableLiveDataBG_.getValue()) != null && (isoCode = value.getIsoCode()) != null) {
            str4 = isoCode;
        }
        return EZpvd(str, str4, interfaceC54581xNr.KWHzl());
    }

    public static final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, xMW xmw) {
        if (str.length() == 0) {
            return "--";
        }
        if (!Intrinsics.EZpvd(C33129mqd.EZpvd(xmw.AhwBna("1")), BigDecimal.ZERO)) {
            str = xmw.AhwBna(str);
        }
        return C38305pTw.formatFiatSymbol$default(pTB.OLrzqt((java.lang.Object) str), str2, RoundingMode.HALF_DOWN, C38307pTy.Companion.AEQbTJ(2), DisplaySign.AUTO, Notation.COMPACT_SHORT, null, 32, null);
    }
}
