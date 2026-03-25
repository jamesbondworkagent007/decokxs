package o;

import com.okinc.business.market.features.analysis.futures.sub.calendar.data.model.CalendarPo;
import com.okinc.market.ext.UpDownColor;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jJq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25876jJq {
    public final UpDownColor AhwBna;
    public final java.util.List<Application> EZpvd;
    public final CalendarPo KWHzl;
    public final java.lang.String OLrzqt;
    public final Date copydefault;
    public final java.lang.String djBIcL;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.jJq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C25876jJq copy$default(C25876jJq c25876jJq, CalendarPo calendarPo, Date date, java.util.List list, java.lang.String str, UpDownColor upDownColor, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            calendarPo = c25876jJq.KWHzl;
        }
        if ((i & 2) != 0) {
            date = c25876jJq.copydefault;
        }
        Date date2 = date;
        if ((i & 4) != 0) {
            list = c25876jJq.EZpvd;
        }
        java.util.List list2 = list;
        if ((i & 8) != 0) {
            str = c25876jJq.OLrzqt;
        }
        java.lang.String str3 = str;
        if ((i & 16) != 0) {
            upDownColor = c25876jJq.AhwBna;
        }
        UpDownColor upDownColor2 = upDownColor;
        if ((i & 32) != 0) {
            str2 = c25876jJq.djBIcL;
        }
        return c25876jJq.KWHzl(calendarPo, date2, list2, str3, upDownColor2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpDownColor EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<Application> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25876jJq KWHzl(CalendarPo calendarPo, @NotNull Date date, @NotNull java.util.List<Application> list, @NotNull java.lang.String str, @NotNull UpDownColor upDownColor, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C25876jJq(calendarPo, date, list, str, upDownColor, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25876jJq)) {
            return false;
        }
        C25876jJq c25876jJq = (C25876jJq) obj;
        return Intrinsics.EZpvd(this.KWHzl, c25876jJq.KWHzl) && Intrinsics.EZpvd(this.copydefault, c25876jJq.copydefault) && Intrinsics.EZpvd(this.EZpvd, c25876jJq.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c25876jJq.OLrzqt) && this.AhwBna == c25876jJq.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c25876jJq.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        CalendarPo calendarPo = this.KWHzl;
        return ((((((((((calendarPo == null ? 0 : calendarPo.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.djBIcL.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CalendarListVo(po=" + this.KWHzl + ", date=" + this.copydefault + ", itemList=" + this.EZpvd + ", totalPnl=" + this.OLrzqt + ", totalPnlColor=" + this.AhwBna + ", totalPnlUnit=" + this.djBIcL + ")";
    }

    public C25876jJq(CalendarPo calendarPo, @NotNull Date date, @NotNull java.util.List<Application> list, @NotNull java.lang.String str, @NotNull UpDownColor upDownColor, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = calendarPo;
        this.copydefault = date;
        this.EZpvd = list;
        this.OLrzqt = str;
        this.AhwBna = upDownColor;
        this.djBIcL = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0023: CONSTRUCTOR 
  (r8v0 com.okinc.business.market.features.analysis.futures.sub.calendar.data.model.CalendarPo)
  (r9v0 java.util.Date)
  (wrap:java.util.List:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:10)) : (r10v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:com.okinc.market.ext.UpDownColor:0x0018: TERNARY null = ((wrap:int:0x0012: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.market.ext.UpDownColor:0x0016: SGET  A[WRAPPED] (LINE:12) com.okinc.market.ext.UpDownColor.NEUTRAL com.okinc.market.ext.UpDownColor) : (r12v0 com.okinc.market.ext.UpDownColor))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(com.okinc.business.market.features.analysis.futures.sub.calendar.data.model.CalendarPo, java.util.Date, java.util.List<o.jJq$Application>, java.lang.String, com.okinc.market.ext.UpDownColor, java.lang.String):void (m)] (LINE:7) call: o.jJq.<init>(com.okinc.business.market.features.analysis.futures.sub.calendar.data.model.CalendarPo, java.util.Date, java.util.List, java.lang.String, com.okinc.market.ext.UpDownColor, java.lang.String):void type: THIS */
    public /* synthetic */ C25876jJq(CalendarPo calendarPo, Date date, java.util.List list, java.lang.String str, UpDownColor upDownColor, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(calendarPo, date, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? UpDownColor.NEUTRAL : upDownColor, (i & 32) != 0 ? "" : str2);
    }

    /* JADX INFO: renamed from: o.jJq$Application */
    public static final class Application {
        public final Date EZpvd;
        public final UpDownColor KWHzl;
        public final java.lang.String OLrzqt;
        public final CalendarPo.CalendarOneDayPo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, CalendarPo.CalendarOneDayPo calendarOneDayPo, Date date, java.lang.String str, UpDownColor upDownColor, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                calendarOneDayPo = application.copydefault;
            }
            if ((i & 2) != 0) {
                date = application.EZpvd;
            }
            if ((i & 4) != 0) {
                str = application.OLrzqt;
            }
            if ((i & 8) != 0) {
                upDownColor = application.KWHzl;
            }
            return application.EZpvd(calendarOneDayPo, date, str, upDownColor);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Date AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UpDownColor EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(@NotNull CalendarPo.CalendarOneDayPo calendarOneDayPo, @NotNull Date date, @NotNull java.lang.String str, @NotNull UpDownColor upDownColor) {
            Intrinsics.checkNotNullParameter(calendarOneDayPo, "");
            Intrinsics.checkNotNullParameter(date, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(upDownColor, "");
            return new Application(calendarOneDayPo, date, str, upDownColor);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CalendarPo.CalendarOneDayPo copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.copydefault, application.copydefault) && Intrinsics.EZpvd(this.EZpvd, application.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && this.KWHzl == application.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.copydefault.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ItemVo(calendarOneDayPo=" + this.copydefault + ", date=" + this.EZpvd + ", text=" + this.OLrzqt + ", color=" + this.KWHzl + ")";
        }

        public Application(@NotNull CalendarPo.CalendarOneDayPo calendarOneDayPo, @NotNull Date date, @NotNull java.lang.String str, @NotNull UpDownColor upDownColor) {
            Intrinsics.checkNotNullParameter(calendarOneDayPo, "");
            Intrinsics.checkNotNullParameter(date, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(upDownColor, "");
            this.copydefault = calendarOneDayPo;
            this.EZpvd = date;
            this.OLrzqt = str;
            this.KWHzl = upDownColor;
        }
    }

    /* JADX INFO: renamed from: o.jJq$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jJq.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C25876jJq EZpvd() {
            return new C25876jJq(null, new Date(), null, null, null, null, 60, null);
        }
    }
}
