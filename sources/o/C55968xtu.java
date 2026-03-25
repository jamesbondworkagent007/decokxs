package o;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.unify_trade.bot.util.recurring.RecurringCycleConfigNew;
import com.okinc.unify_trade.bot.util.recurring.RecurringHourlyConfig;
import com.okinc.unify_trade.bot.util.recurring.RecurringWeekConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;

/* JADX INFO: renamed from: o.xtu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55968xtu {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public java.util.ArrayList<java.lang.String> OLrzqt = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.String> AYXKKw = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.String> AEQbTJ = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.String> KWHzl = new java.util.ArrayList<>();
    public final java.util.ArrayList<java.util.List<java.lang.String>> EZpvd = new java.util.ArrayList<>();
    public final java.util.ArrayList<java.lang.String> gEmmrt = new java.util.ArrayList<>();

    /* JADX INFO: renamed from: o.xtu$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xtu.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void EZpvd() {
        for (RecurringCycleConfigNew recurringCycleConfigNew : RecurringCycleConfigNew.values()) {
            this.OLrzqt.add(C33070mpX.AYXKKw(recurringCycleConfigNew.getTitle()));
        }
        for (RecurringWeekConfig recurringWeekConfig : RecurringWeekConfig.values()) {
            this.AYXKKw.add(C33070mpX.AYXKKw(recurringWeekConfig.getTitle()));
        }
        for (int i = 1; i < 29; i++) {
            if (xMP.AEQbTJ.AEQbTJ()) {
                this.AEQbTJ.add(xMR.copydefault.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(i))) + C33070mpX.AYXKKw(C55688xof.Application.getIcon));
            } else {
                this.AEQbTJ.add(C33070mpX.AYXKKw(C55688xof.Application.getIcon) + " " + xMR.copydefault.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(i))));
            }
        }
        for (int i2 = 0; i2 < 4; i2++) {
            java.util.ArrayList<java.lang.String> arrayList = this.KWHzl;
            android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
            int i3 = C55688xof.Activity.EZpvd;
            RecurringHourlyConfig.ActionBar actionBar = RecurringHourlyConfig.Companion;
            arrayList.add(pTD.EZpvd(applicationOLrzqt, i3, C33129mqd.AhwBna(actionBar.AEQbTJ(i2)), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", xMR.copydefault.copydefault(actionBar.AEQbTJ(i2))))));
        }
        this.EZpvd.add(C56402yEa.EZpvd(""));
        this.EZpvd.add(this.AYXKKw);
        this.EZpvd.add(this.AEQbTJ);
        this.EZpvd.add(this.KWHzl);
        copydefault();
    }

    public final void copydefault() {
        for (int i = 0; i < 24; i++) {
            this.gEmmrt.add(C56046xvS.AEQbTJ.AEQbTJ(i));
        }
    }

    public static final java.lang.String copydefault(java.lang.String str) {
        return C33069mpW.copydefault(C55688xof.Application.DkIxYv, C56424yEw.gEmmrt(C56390yDp.OLrzqt("frequency", str), C56390yDp.OLrzqt("buyType", C33070mpX.AYXKKw(C55688xof.Application.gxJrGF))));
    }

    public static final java.lang.String KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str2.length() == 0) {
            return C33069mpW.copydefault(C55688xof.Application.DXTac, C56424yEw.gEmmrt(C56390yDp.OLrzqt("frequency", str), C56390yDp.OLrzqt(CrashHianalyticsData.TIME, str3)));
        }
        return C33069mpW.copydefault(C55688xof.Application.sYOsaF, C56424yEw.gEmmrt(C56390yDp.OLrzqt("frequency", str), C56390yDp.OLrzqt("date", str2), C56390yDp.OLrzqt(CrashHianalyticsData.TIME, str3)));
    }

    public final java.lang.String EZpvd(int i, int i2, int i3, boolean z) {
        if (i == RecurringCycleConfigNew.HOUR.getIndex()) {
            RecurringHourlyConfig.ActionBar actionBar = RecurringHourlyConfig.Companion;
            java.lang.String strEZpvd = actionBar.EZpvd(actionBar.AEQbTJ(i2));
            if (z) {
                return copydefault(strEZpvd);
            }
            java.lang.String str = this.gEmmrt.get(i3);
            Intrinsics.checkNotNullExpressionValue(str, "");
            return KWHzl(strEZpvd, "", str);
        }
        if (z) {
            java.lang.String str2 = this.OLrzqt.get(i);
            Intrinsics.checkNotNullExpressionValue(str2, "");
            return copydefault(str2);
        }
        if (i == RecurringCycleConfigNew.DAY.getIndex()) {
            java.lang.String str3 = this.OLrzqt.get(i);
            Intrinsics.checkNotNullExpressionValue(str3, "");
            java.lang.String str4 = this.gEmmrt.get(i3);
            Intrinsics.checkNotNullExpressionValue(str4, "");
            return KWHzl(str3, "", str4);
        }
        java.lang.String str5 = this.OLrzqt.get(i);
        Intrinsics.checkNotNullExpressionValue(str5, "");
        java.lang.String str6 = this.EZpvd.get(i).get(i2);
        java.lang.String str7 = this.gEmmrt.get(i3);
        Intrinsics.checkNotNullExpressionValue(str7, "");
        return KWHzl(str5, str6, str7);
    }
}
