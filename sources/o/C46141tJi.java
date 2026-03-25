package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tJi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C46141tJi {
    public final float AEQbTJ;
    public final float EZpvd;
    public final java.lang.CharSequence KWHzl;
    public final float OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C46141tJi() {
        this(null, null, 0.0f, 0.0f, 0.0f, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence copydefault() {
        return this.KWHzl;
    }

    public C46141tJi(@NotNull java.lang.String str, java.lang.CharSequence charSequence, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.KWHzl = charSequence;
        this.OLrzqt = f;
        this.EZpvd = f2;
        this.AEQbTJ = f3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.CharSequence:0x000b: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.CharSequence) : (r5v0 java.lang.CharSequence))
  (wrap:float:?: TERNARY null = ((wrap:int:0x000c: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r6v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0014: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r7v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x001b: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 float) : (0.0f float))
 A[MD:(java.lang.String, java.lang.CharSequence, float, float, float):void (m)] (LINE:66) call: o.tJi.<init>(java.lang.String, java.lang.CharSequence, float, float, float):void type: THIS */
    public /* synthetic */ C46141tJi(java.lang.String str, java.lang.CharSequence charSequence, float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : charSequence, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? 0.0f : f2, (i & 16) == 0 ? f3 : 0.0f);
    }
}
