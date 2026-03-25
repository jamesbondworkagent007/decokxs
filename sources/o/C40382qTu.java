package o;

import androidx.camera.video.AudioStats;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: renamed from: o.qTu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40382qTu {
    public static final C40382qTu AEQbTJ = new C40382qTu();

    private C40382qTu() {
    }

    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, BizInstrument bizInstrument) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.lang.String strCopydefault = copydefault(str3);
        if (strCopydefault != null) {
            linkedHashMap.put("sub_tab", strCopydefault);
        }
        java.lang.String strEZpvd = EZpvd(bizInstrument, str4);
        if (strEZpvd != null) {
            linkedHashMap.put("searchtype", strEZpvd);
        }
        return linkedHashMap;
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "find_page")) {
            return WalletSearchRequest.SEARCH_SOURCE_DISCOVER;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "home_page")) {
            return "home";
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String copydefault(java.lang.String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -2027980370:
                if (str.equals("MARGIN")) {
                    return "margin";
                }
                return null;
            case -1956807563:
                if (str.equals("OPTION")) {
                    return "option";
                }
                return null;
            case 64972:
                if (str.equals("ANY")) {
                    return "all";
                }
                return null;
            case 2552066:
                if (str.equals("SPOT")) {
                    return "spot";
                }
                return null;
            case 2558355:
                if (str.equals("SWAP")) {
                    return "perpetual";
                }
                return null;
            case 214415088:
                if (str.equals("FUTURES")) {
                    return "futures";
                }
                return null;
            case 1724028365:
                if (!str.equals("Watchlist")) {
                    return null;
                }
                break;
            default:
                return null;
        }
    }

    public static /* synthetic */ java.lang.String convertSearchType$default(C40382qTu c40382qTu, BizInstrument bizInstrument, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return c40382qTu.EZpvd(bizInstrument, str);
    }

    public final java.lang.String EZpvd(BizInstrument bizInstrument, java.lang.String str) {
        if (str == null || bizInstrument == null) {
            return null;
        }
        return AEQbTJ(bizInstrument, str);
    }

    public final java.lang.String AEQbTJ(BizInstrument bizInstrument, java.lang.String str) {
        java.util.Locale locale = java.util.Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.String tradeSymbol = bizInstrument.getTradeSymbol();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase2 = tradeSymbol.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        java.lang.String strFullCoinName = bizInstrument.fullCoinName();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase3 = strFullCoinName.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
        java.lang.String quoteSymbol = bizInstrument.getQuoteSymbol();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase4 = quoteSymbol.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
        java.lang.String str2 = lowerCase2 + lowerCase4;
        if (Intrinsics.EZpvd((java.lang.Object) lowerCase2, (java.lang.Object) lowerCase)) {
            return "tradeshort_exactmatch";
        }
        if (C59449zhJ.startsWith$default(lowerCase2, lowerCase, false, 2, null) || C59449zhJ.startsWith$default(str2, lowerCase, false, 2, null)) {
            return "tradeshorthigh";
        }
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) lowerCase, false, 2, (java.lang.Object) null)) {
            return "tradeshortlow";
        }
        if (C59449zhJ.startsWith$default(lowerCase3, lowerCase, false, 2, null)) {
            return "tradelong";
        }
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase4, (java.lang.CharSequence) lowerCase, false, 2, (java.lang.Object) null)) {
            return FirebaseAnalytics.Param.PRICE;
        }
        if (Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "OPTION") || C54704xSf.OLrzqt.KWHzl(lowerCase2, lowerCase, 0, lowerCase3, AudioStats.AUDIO_AMPLITUDE_NONE).getFirst().doubleValue() <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            return null;
        }
        return "fuzzy";
    }
}
