package o;

import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class qYM {
    public final java.lang.String AEQbTJ;
    public final java.lang.Object EZpvd;
    public final int KWHzl;
    public final Date OLrzqt;
    public final int copydefault;
    public final int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ qYM copy$default(qYM qym, java.lang.Object obj, Date date, java.lang.String str, int i, int i2, int i3, int i4, java.lang.Object obj2) {
        if ((i4 & 1) != 0) {
            obj = qym.EZpvd;
        }
        if ((i4 & 2) != 0) {
            date = qym.OLrzqt;
        }
        Date date2 = date;
        if ((i4 & 4) != 0) {
            str = qym.AEQbTJ;
        }
        java.lang.String str2 = str;
        if ((i4 & 8) != 0) {
            i = qym.KWHzl;
        }
        int i5 = i;
        if ((i4 & 16) != 0) {
            i2 = qym.copydefault;
        }
        int i6 = i2;
        if ((i4 & 32) != 0) {
            i3 = qym.valueOf;
        }
        return qym.KWHzl(obj, date2, str2, i5, i6, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final qYM KWHzl(@NotNull java.lang.Object obj, @NotNull Date date, @NotNull java.lang.String str, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorInt int i3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new qYM(obj, date, str, i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Object OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qYM)) {
            return false;
        }
        qYM qym = (qYM) obj;
        return Intrinsics.EZpvd(this.EZpvd, qym.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, qym.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) qym.AEQbTJ) && this.KWHzl == qym.KWHzl && this.copydefault == qym.copydefault && this.valueOf == qym.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Integer.hashCode(this.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DayItemExtra(data=" + this.EZpvd + ", date=" + this.OLrzqt + ", text=" + this.AEQbTJ + ", color=" + this.KWHzl + ", bgColor=" + this.copydefault + ", topBarColor=" + this.valueOf + ")";
    }

    public qYM(@NotNull java.lang.Object obj, @NotNull Date date, @NotNull java.lang.String str, @androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorInt int i3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = obj;
        this.OLrzqt = date;
        this.AEQbTJ = str;
        this.KWHzl = i;
        this.copydefault = i2;
        this.valueOf = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r10v0 java.lang.Object)
  (r11v0 java.util.Date)
  (r12v0 java.lang.String)
  (r13v0 int)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r14v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r15v0 int))
 A[MD:(java.lang.Object, java.util.Date, java.lang.String, int, int, int):void (m)] (LINE:29) call: o.qYM.<init>(java.lang.Object, java.util.Date, java.lang.String, int, int, int):void type: THIS */
    public /* synthetic */ qYM(java.lang.Object obj, Date date, java.lang.String str, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, date, str, i, (i4 & 16) != 0 ? -1 : i2, (i4 & 32) != 0 ? -1 : i3);
    }
}
