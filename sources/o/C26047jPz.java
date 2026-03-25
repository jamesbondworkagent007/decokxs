package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jPz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26047jPz {
    public final java.lang.String AEQbTJ;
    public final java.lang.CharSequence AYXKKw;
    public final java.lang.Integer AhwBna;
    public final java.lang.Integer EZpvd;
    public final java.lang.String KWHzl;
    public final int OLrzqt;
    public final jPD copydefault;
    public final Function0<Unit> gEmmrt;
    public final int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jPD KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26047jPz copydefault(@androidx.annotation.StringRes int i, jPD jpd, @NotNull java.lang.String str, @androidx.annotation.ColorInt int i2, @NotNull java.lang.CharSequence charSequence, @androidx.annotation.ColorRes java.lang.Integer num, java.lang.String str2, @androidx.annotation.DrawableRes java.lang.Integer num2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        return new C26047jPz(i, jpd, str, i2, charSequence, num, str2, num2, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26047jPz)) {
            return false;
        }
        C26047jPz c26047jPz = (C26047jPz) obj;
        return this.OLrzqt == c26047jPz.OLrzqt && Intrinsics.EZpvd(this.copydefault, c26047jPz.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c26047jPz.AEQbTJ) && this.valueOf == c26047jPz.valueOf && Intrinsics.EZpvd(this.AYXKKw, c26047jPz.AYXKKw) && Intrinsics.EZpvd(this.AhwBna, c26047jPz.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c26047jPz.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c26047jPz.EZpvd) && Intrinsics.EZpvd(this.gEmmrt, c26047jPz.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.OLrzqt);
        jPD jpd = this.copydefault;
        int iHashCode2 = jpd == null ? 0 : jpd.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        int iHashCode4 = java.lang.Integer.hashCode(this.valueOf);
        int iHashCode5 = this.AYXKKw.hashCode();
        java.lang.Integer num = this.AhwBna;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        java.lang.String str = this.KWHzl;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        java.lang.Integer num2 = this.EZpvd;
        int iHashCode8 = num2 == null ? 0 : num2.hashCode();
        Function0<Unit> function0 = this.gEmmrt;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (function0 != null ? function0.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        int i = this.OLrzqt;
        jPD jpd = this.copydefault;
        java.lang.String str = this.AEQbTJ;
        int i2 = this.valueOf;
        java.lang.CharSequence charSequence = this.AYXKKw;
        return "DataCardUiItem(header=" + i + ", headerDialogDetails=" + jpd + ", coloredTextValue=" + str + ", textColor=" + i2 + ", plainTextValue=" + ((java.lang.Object) charSequence) + ", plainTextColor=" + this.AhwBna + ", iconStartUrl=" + this.KWHzl + ", iconEnd=" + this.EZpvd + ", onValueClick=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> valueOf() {
        return this.gEmmrt;
    }

    public C26047jPz(@androidx.annotation.StringRes int i, jPD jpd, @NotNull java.lang.String str, @androidx.annotation.ColorInt int i2, @NotNull java.lang.CharSequence charSequence, @androidx.annotation.ColorRes java.lang.Integer num, java.lang.String str2, @androidx.annotation.DrawableRes java.lang.Integer num2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.OLrzqt = i;
        this.copydefault = jpd;
        this.AEQbTJ = str;
        this.valueOf = i2;
        this.AYXKKw = charSequence;
        this.AhwBna = num;
        this.KWHzl = str2;
        this.EZpvd = num2;
        this.gEmmrt = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (r12v0 int)
  (r13v0 o.jPD)
  (r14v0 java.lang.String)
  (r15v0 int)
  (r16v0 java.lang.CharSequence)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000a: INVOKE (wrap:int:0x0004: SGET  A[WRAPPED] o.wXj.Activity.QwvEab int) STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:85)) : (r17v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (r19v0 java.lang.Integer)
  (r20v0 kotlin.jvm.functions.Function0)
 A[MD:(int, o.jPD, java.lang.String, int, java.lang.CharSequence, java.lang.Integer, java.lang.String, java.lang.Integer, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:76) call: o.jPz.<init>(int, o.jPD, java.lang.String, int, java.lang.CharSequence, java.lang.Integer, java.lang.String, java.lang.Integer, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C26047jPz(int i, jPD jpd, java.lang.String str, int i2, java.lang.CharSequence charSequence, java.lang.Integer num, java.lang.String str2, java.lang.Integer num2, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, jpd, str, i2, charSequence, (i3 & 32) != 0 ? java.lang.Integer.valueOf(C52761wXj.Activity.QwvEab) : num, (i3 & 64) != 0 ? null : str2, num2, function0);
    }
}
