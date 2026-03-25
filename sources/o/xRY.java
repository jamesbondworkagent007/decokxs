package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xRY {
    public static final xRY copydefault = new xRY();
    public static final java.util.Map<java.lang.String, java.lang.String> OLrzqt = C56424yEw.gEmmrt(C56390yDp.OLrzqt(HiAnalyticsConstant.KeyAndValue.NUMBER_01, "jan"), C56390yDp.OLrzqt("02", "feb"), C56390yDp.OLrzqt("03", "mar"), C56390yDp.OLrzqt("04", "apr"), C56390yDp.OLrzqt("05", "may"), C56390yDp.OLrzqt("06", "jun"), C56390yDp.OLrzqt("07", "jul"), C56390yDp.OLrzqt("08", "aug"), C56390yDp.OLrzqt("09", "sep"), C56390yDp.OLrzqt("10", "oct"), C56390yDp.OLrzqt("11", "nov"), C56390yDp.OLrzqt("12", "dec"));
    public static final int AEQbTJ = 8;

    private xRY() {
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        java.lang.String strSubstring;
        java.lang.String strSubstring2;
        java.lang.String strSubstring3;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
            if (listSplit$default.size() != 3) {
                return "";
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
                strSubstring3 = ((java.lang.String) listSplit$default.get(2)).substring(0, 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
            } else {
                strSubstring3 = "";
            }
            java.lang.String str2 = strSubstring + OLrzqt.get(strSubstring2) + strSubstring3;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            return str2;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            java.lang.Object objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            return (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? "" : objM7377constructorimpl);
        }
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) copydefault(str), (java.lang.CharSequence) str2, false, 2, (java.lang.Object) null);
    }
}
