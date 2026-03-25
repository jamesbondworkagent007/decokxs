package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class pER {
    public static final pER AEQbTJ = new pER();

    private pER() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "FUTURES")) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
                switch (str3.hashCode()) {
                    case -927019468:
                        if (str3.equals("next_month")) {
                            str3 = "monthly";
                        }
                        break;
                    case -560300811:
                        if (str3.equals("this_week")) {
                            str3 = "weekly";
                        }
                        break;
                    case -198384225:
                        if (str3.equals("this_month")) {
                            str3 = "bimonthly";
                        }
                        break;
                    case 651403948:
                        if (str3.equals("quarter")) {
                            str3 = "quarterly";
                        }
                        break;
                    case 1217310144:
                        if (str3.equals("next_week")) {
                            str3 = "biweekly";
                        }
                        break;
                    case 1902260576:
                        if (str3.equals("next_quarter")) {
                            str3 = "biquarterly";
                        }
                        break;
                }
                java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
                if (listSplit$default != null && listSplit$default.size() == 3) {
                    java.lang.String str4 = listSplit$default.get(0) + "-" + listSplit$default.get(1) + "-" + str3;
                    java.util.Locale locale = java.util.Locale.ROOT;
                    java.lang.String lowerCase = str2.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    java.lang.String lowerCase2 = str4.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    return "https://www.okx.com/trade-" + lowerCase + "/" + lowerCase2;
                }
            }
            return "";
        }
        java.util.Locale locale2 = java.util.Locale.ROOT;
        java.lang.String lowerCase3 = str2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
        java.lang.String lowerCase4 = str.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "");
        return "https://www.okx.com/trade-" + lowerCase3 + "/" + lowerCase4;
    }
}
