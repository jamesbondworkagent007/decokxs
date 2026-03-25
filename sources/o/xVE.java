package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xVE {
    public static final xVE copydefault = new xVE();
    public static final java.util.Map<java.lang.String, java.lang.String> KWHzl = C56424yEw.gEmmrt(C56390yDp.OLrzqt(HiAnalyticsConstant.KeyAndValue.NUMBER_01, "JAN"), C56390yDp.OLrzqt("02", "FEB"), C56390yDp.OLrzqt("03", "MAR"), C56390yDp.OLrzqt("04", "APR"), C56390yDp.OLrzqt("05", "MAY"), C56390yDp.OLrzqt("06", "JUN"), C56390yDp.OLrzqt("07", "JUL"), C56390yDp.OLrzqt("08", "AUG"), C56390yDp.OLrzqt("09", "SEP"), C56390yDp.OLrzqt("10", "OCT"), C56390yDp.OLrzqt("11", "NOV"), C56390yDp.OLrzqt("12", "DEC"));
    public static final int OLrzqt = 8;

    private xVE() {
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT") ? "MARGIN" : str;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() < 2) {
            return "";
        }
        return listSplit$default.get(0) + "-" + listSplit$default.get(1);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
        return (listSplit$default.size() < 2 || !Intrinsics.EZpvd(listSplit$default.get(1), (java.lang.Object) "USD")) ? (listSplit$default.size() < 2 || !(listSplit$default.isEmpty() ^ true)) ? "" : "linear" : "inverse";
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r10v5, r5v10 */
    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        java.lang.String string;
        java.lang.String strSubstring;
        java.lang.String strSubstring2;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument bizInstrumentValueOf = (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt("FUTURES")) == null) ? null : abstractC54531xLwOLrzqt.valueOf(str);
        if (bizInstrumentValueOf != null && bizInstrumentValueOf.isPreMarketPair()) {
            return AEQbTJ(bizInstrumentValueOf.getInstFamily());
        }
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() != 3) {
            return str;
        }
        if (listSplit$default.size() >= 2) {
            java.lang.Object obj = listSplit$default.get(0);
            java.lang.Object obj2 = listSplit$default.get(1);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(obj);
            sb.append(obj2);
            string = sb.toString();
        } else {
            string = "";
        }
        if (((java.lang.String) listSplit$default.get(2)).length() == 6) {
            strSubstring = ((java.lang.String) listSplit$default.get(2)).substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        } else {
            strSubstring = "";
        }
        if (((java.lang.String) listSplit$default.get(2)).length() == 6) {
            strSubstring2 = ((java.lang.String) listSplit$default.get(2)).substring(2, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        } else {
            strSubstring2 = "";
        }
        if (((java.lang.String) listSplit$default.get(2)).length() == 6) {
            java.lang.String strSubstring3 = ((java.lang.String) listSplit$default.get(2)).substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
            str2 = strSubstring3;
        }
        return string + "-" + strSubstring + ((java.lang.Object) KWHzl.get(strSubstring2)) + str2;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33069mpW.copydefault(C55688xof.Application.r8lambda3HoOD4FOOs4BK4W3sogOQmeeOUI, C56423yEv.EZpvd(C56390yDp.OLrzqt("uly", C59449zhJ.replace$default(str, "-", "", false, 4, (java.lang.Object) null))));
    }

    public static /* synthetic */ java.lang.String convertFuturesShortTitle$default(xVE xve, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return xve.OLrzqt(str, z);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z) {
        java.lang.String strSubstring;
        java.lang.String strSubstring2;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            return C33070mpX.AYXKKw(C55688xof.Application.component2);
        }
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() != 3) {
            return str;
        }
        if (((java.lang.String) listSplit$default.get(2)).length() == 6) {
            strSubstring = ((java.lang.String) listSplit$default.get(2)).substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        } else {
            strSubstring = "";
        }
        if (((java.lang.String) listSplit$default.get(2)).length() == 6) {
            strSubstring2 = ((java.lang.String) listSplit$default.get(2)).substring(2, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        } else {
            strSubstring2 = "";
        }
        if (((java.lang.String) listSplit$default.get(2)).length() == 6) {
            java.lang.String strSubstring3 = ((java.lang.String) listSplit$default.get(2)).substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
            str2 = strSubstring3;
        }
        return strSubstring + ((java.lang.Object) KWHzl.get(strSubstring2)) + str2;
    }
}
