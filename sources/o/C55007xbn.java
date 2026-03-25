package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xbn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55007xbn implements android.text.InputFilter {
    public boolean AEQbTJ;
    public boolean AhwBna;
    public int EZpvd;
    public boolean KWHzl;
    public java.util.Locale OLrzqt;
    public java.util.Set<java.lang.String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55007xbn() {
        this(0, false, null, null, false, false, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.util.Set<java.lang.String> set) {
        this.copydefault = set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        this.OLrzqt = locale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.AEQbTJ = z;
    }

    public C55007xbn(int i, boolean z, @NotNull java.util.Locale locale, java.util.Set<java.lang.String> set, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(locale, "");
        this.EZpvd = i;
        this.AhwBna = z;
        this.OLrzqt = locale;
        this.copydefault = set;
        this.AEQbTJ = z2;
        this.KWHzl = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (214748364 int) : (r5v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0007: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:java.util.Locale:0x0017: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Locale:0x0013: INVOKE  STATIC call: java.util.Locale.getDefault():java.util.Locale A[MD:():java.util.Locale (c), WRAPPED] (LINE:22)) : (r7v0 java.util.Locale))
  (wrap:java.util.Set:0x001d: TERNARY null = ((wrap:int:0x0018: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.Set) : (r8v0 java.util.Set))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r11v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r10v0 boolean) : false)
 A[MD:(int, boolean, java.util.Locale, java.util.Set<java.lang.String>, boolean, boolean):void (m)] (LINE:19) call: o.xbn.<init>(int, boolean, java.util.Locale, java.util.Set, boolean, boolean):void type: THIS */
    public /* synthetic */ C55007xbn(int i, boolean z, java.util.Locale locale, java.util.Set set, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 214748364 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? java.util.Locale.getDefault() : locale, (i2 & 8) != 0 ? null : set, (i2 & 16) != 0 ? false : z2, (i2 & 32) == 0 ? z3 : false);
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(@NotNull java.lang.CharSequence charSequence, int i, int i2, @NotNull android.text.Spanned spanned, int i3, int i4) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(spanned, "");
        if (this.AEQbTJ) {
            return null;
        }
        if (charSequence.length() == 0) {
            return "";
        }
        java.util.Locale locale = java.util.Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        if (android.text.TextUtils.equals(C38303pTu.EZpvd(locale), charSequence.toString())) {
            charSequence = C38303pTu.EZpvd(this.OLrzqt);
        }
        if (!C55005xbl.Companion.AEQbTJ(charSequence.toString(), this.copydefault, this.OLrzqt, this.AhwBna, this.KWHzl)) {
            return "";
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spanned.toString(), C38303pTu.EZpvd(this.OLrzqt), 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default >= 0) {
            int length = charSequence.length();
            for (int i5 = 0; i5 < length; i5++) {
                if (android.text.TextUtils.equals(java.lang.String.valueOf(charSequence.charAt(i5)), C38303pTu.EZpvd(this.OLrzqt)) && i3 != 0) {
                    return "";
                }
            }
            if (i4 <= iIndexOf$default) {
                return null;
            }
            if (spanned.length() - iIndexOf$default > this.EZpvd && i3 != 0) {
                return "";
            }
        }
        if (!android.text.TextUtils.equals(charSequence.toString(), C38303pTu.EZpvd(this.OLrzqt)) || i3 != 0) {
            if (android.text.TextUtils.equals(charSequence.toString(), C38303pTu.EZpvd(this.OLrzqt).toString())) {
                return this.EZpvd > 0 ? C38303pTu.EZpvd(this.OLrzqt) : "";
            }
            if (android.text.TextUtils.equals("0", spanned.toString()) && android.text.TextUtils.equals("0", charSequence.toString())) {
                return (i == 0 && i3 == 0) ? "0" : "";
            }
            return null;
        }
        if (this.EZpvd <= 0) {
            return "";
        }
        return "0" + C38303pTu.EZpvd(this.OLrzqt);
    }
}
