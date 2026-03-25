package o;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.unify_trade.bot.util.recurring.RecurringCycleConfig;
import com.okinc.unify_trade.bot.util.recurring.RecurringHourlyConfig;
import com.okinc.unify_trade.bot.util.recurring.RecurringWeekConfig;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xvS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56046xvS {
    public static final C56046xvS AEQbTJ = new C56046xvS();

    public final int KWHzl(int i) {
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 1;
        }
    }

    private C56046xvS() {
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        int iHashCode = str.hashCode();
        if (iHashCode != -1211426191) {
            if (iHashCode != -791707519) {
                if (iHashCode == 95346201 && str.equals("daily")) {
                    return OLrzqt(str4);
                }
            } else if (str.equals("weekly")) {
                return OLrzqt(str2, str4);
            }
        } else if (str.equals("hourly")) {
            return copydefault(str3, str4);
        }
        return AEQbTJ(str2, str4);
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        java.lang.String simpleDate$default;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(java.lang.System.currentTimeMillis()));
        int i = calendar.get(11);
        if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(i), str2)) {
            Date time = calendar.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "");
            return pTA.formatSimpleDate$default(time, null, 1, null) + " " + AEQbTJ(C33129mqd.AhwBna(str2));
        }
        java.lang.String strAddS$default = C33129mqd.addS$default(C33129mqd.mulS$default(C33129mqd.addS$default(C33129mqd.divS$default(C33129mqd.subS$default(java.lang.Integer.valueOf(i), str2, null, null, null, 14, null), str, 0, null, RoundingMode.DOWN, 4, null), 1, null, null, null, 14, null), str, null, null, null, 14, null), str2, null, null, null, 14, null);
        if (C33129mqd.AEQbTJ(strAddS$default, 23)) {
            calendar.add(5, 1);
            Date time2 = calendar.getTime();
            Intrinsics.checkNotNullExpressionValue(time2, "");
            simpleDate$default = pTA.formatSimpleDate$default(time2, null, 1, null);
        } else {
            simpleDate$default = pTA.formatSimpleDate$default(new Date(java.lang.System.currentTimeMillis()), null, 1, null);
        }
        if (C33129mqd.AEQbTJ(strAddS$default, 23)) {
            strAddS$default = C33129mqd.subS$default(strAddS$default, 24, null, null, null, 14, null);
        }
        return simpleDate$default + " " + AEQbTJ(C33129mqd.AhwBna(strAddS$default));
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        java.lang.String simpleDate$default;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(java.lang.System.currentTimeMillis()));
        if (C33129mqd.copydefault(java.lang.Integer.valueOf(calendar.get(11)), str)) {
            calendar.add(5, 1);
            Date time = calendar.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "");
            simpleDate$default = pTA.formatSimpleDate$default(time, null, 1, null);
        } else {
            simpleDate$default = pTA.formatSimpleDate$default(new Date(java.lang.System.currentTimeMillis()), null, 1, null);
        }
        return simpleDate$default + " " + AEQbTJ(C33129mqd.AhwBna(str));
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(java.lang.System.currentTimeMillis()));
        int i = calendar.get(11);
        int i2 = calendar.get(7);
        int iKWHzl = KWHzl(C33129mqd.AhwBna(str));
        if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(iKWHzl), java.lang.Integer.valueOf(i2))) {
            calendar.add(4, 1);
            calendar.set(7, iKWHzl);
        } else if (!C33129mqd.AEQbTJ(java.lang.Integer.valueOf(iKWHzl), java.lang.Integer.valueOf(i2)) && C33129mqd.copydefault(java.lang.Integer.valueOf(i), str2)) {
            calendar.add(4, 1);
            calendar.set(7, iKWHzl);
        } else {
            calendar.set(7, iKWHzl);
        }
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "");
        return pTA.formatSimpleDate$default(time, null, 1, null) + " " + AEQbTJ(C33129mqd.AhwBna(str2));
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(java.lang.System.currentTimeMillis()));
        int i = calendar.get(11);
        int i2 = calendar.get(5);
        int iAhwBna = C33129mqd.AhwBna(str);
        if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(iAhwBna), java.lang.Integer.valueOf(i2))) {
            calendar.add(2, 1);
            calendar.set(5, iAhwBna);
        } else if (!C33129mqd.AEQbTJ(java.lang.Integer.valueOf(iAhwBna), java.lang.Integer.valueOf(i2)) && C33129mqd.copydefault(java.lang.Integer.valueOf(i), str2)) {
            calendar.add(2, 1);
            calendar.set(5, iAhwBna);
        } else {
            calendar.set(5, iAhwBna);
        }
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "");
        return pTA.formatSimpleDate$default(time, null, 1, null) + " " + AEQbTJ(C33129mqd.AhwBna(str2));
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return pTA.format$default(new Date(C33129mqd.valueOf(str)), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, true, 12, null);
    }

    public final java.lang.String AEQbTJ(int i) {
        if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(i), 10)) {
            return "0" + xMR.copydefault.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(i))) + ":00";
        }
        return xMR.copydefault.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(i))) + ":00";
    }

    public final java.lang.String copydefault(int i, @NotNull java.lang.String str) {
        java.lang.String strCopydefault;
        java.lang.String strCopydefault2;
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(i), 10)) {
            strCopydefault = "0" + xMR.copydefault.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(i)));
        } else {
            strCopydefault = xMR.copydefault.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(i)));
        }
        int iAhwBna = C33129mqd.AhwBna(str);
        if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(iAhwBna), 10)) {
            strCopydefault2 = "0" + xMR.copydefault.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(iAhwBna)));
        } else {
            strCopydefault2 = xMR.copydefault.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(iAhwBna)));
        }
        return strCopydefault + ":" + strCopydefault2;
    }

    public final int AEQbTJ() {
        return (Calendar.getInstance().get(11) + 1) % 24;
    }

    public final int KWHzl() {
        return (Calendar.getInstance().get(7) + 5) % 7;
    }

    public final int EZpvd() {
        return (Calendar.getInstance().get(5) - 1) % 28;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2) && C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
            xMR xmr = xMR.copydefault;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String strCopydefault = xmr.copydefault(str2);
            if (str3 == null) {
                str3 = "";
            }
            return str + " " + strCopydefault + " - " + xmr.copydefault(str3);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2) && (str3 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3))) {
            xMR xmr2 = xMR.copydefault;
            if (str2 == null) {
                str2 = "";
            }
            return str + " > " + xmr2.copydefault(str2);
        }
        xMR xmr3 = xMR.copydefault;
        if (str3 == null) {
            str3 = "";
        }
        return str + " < " + xmr3.copydefault(str3);
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str) && C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            xMR xmr = xMR.copydefault;
            if (str == null) {
                str = "";
            }
            java.lang.String strCopydefault = xmr.copydefault(str);
            if (str2 == null) {
                str2 = "";
            }
            return strCopydefault + " - " + xmr.copydefault(str2);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str) && (str2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2))) {
            xMR xmr2 = xMR.copydefault;
            if (str == null) {
                str = "";
            }
            return "> " + xmr2.copydefault(str);
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str2) || (str != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str))) {
            return "--";
        }
        xMR xmr3 = xMR.copydefault;
        if (str2 == null) {
            str2 = "";
        }
        return "< " + xmr3.copydefault(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd A[PHI: r16
  0x00dd: PHI (r16v3 java.lang.String) = (r16v2 java.lang.String), (r16v5 java.lang.String) binds: [B:47:0x00da, B:30:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        java.lang.String str7;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        java.lang.String str8 = str6;
        Intrinsics.checkNotNullParameter(str8, "");
        int iHashCode = str.hashCode();
        java.lang.String strAEQbTJ = "--";
        java.lang.String strEZpvd = (iHashCode == -791707519 ? !str.equals("weekly") : iHashCode == 95346201 ? !str.equals("daily") : !(iHashCode == 1236635661 && str.equals("monthly"))) ? "--" : RecurringCycleConfig.Companion.EZpvd(str);
        if (xMP.AEQbTJ.AEQbTJ()) {
            str7 = "";
            int iHashCode2 = str.hashCode();
            if (iHashCode2 != -791707519) {
                if (iHashCode2 != 95346201) {
                    if (iHashCode2 == 1236635661 && str.equals("monthly")) {
                        strAEQbTJ = str2 + C33070mpX.AYXKKw(C55688xof.Application.getIcon);
                    }
                } else if (str.equals("daily")) {
                    strAEQbTJ = str7;
                }
            } else if (str.equals("weekly")) {
                strAEQbTJ = AEQbTJ(str2);
            }
        } else {
            str7 = "";
            int iHashCode3 = str.hashCode();
            if (iHashCode3 != -791707519) {
                if (iHashCode3 != 95346201) {
                    if (iHashCode3 == 1236635661 && str.equals("monthly")) {
                        strAEQbTJ = C33070mpX.AYXKKw(C55688xof.Application.getIcon) + " " + str2;
                    }
                } else if (str.equals("daily")) {
                }
            } else if (str.equals("weekly")) {
                strAEQbTJ = AEQbTJ(str2);
            }
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) "2") || !yDY.gEmmrt("daily", "weekly", "monthly").contains(str) || str6.length() <= 0) {
            str8 = str7;
        }
        java.lang.String strKWHzl = KWHzl(str3, str8);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "hourly")) {
            return RecurringHourlyConfig.Companion.EZpvd(str4);
        }
        java.lang.String str9 = " " + strAEQbTJ;
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str9)) {
            str9 = str7;
        }
        java.lang.String str10 = " " + strKWHzl;
        return strEZpvd + ((java.lang.Object) str9) + ((java.lang.Object) (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str10) ? str7 : str10));
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        return RecurringWeekConfig.Companion.OLrzqt(C33129mqd.AhwBna(str));
    }

    public static /* synthetic */ java.lang.String getTime$default(C56046xvS c56046xvS, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return c56046xvS.KWHzl(str, str2);
    }

    public final java.lang.String KWHzl(java.lang.String str, java.lang.String str2) {
        if (str.length() == 0) {
            return "--";
        }
        if (str2.length() > 0) {
            return copydefault(C33129mqd.AhwBna(str), str2);
        }
        return AEQbTJ(C33129mqd.AhwBna(str));
    }
}
