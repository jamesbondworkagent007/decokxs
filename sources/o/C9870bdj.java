package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bdj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9870bdj extends C9789bcH {
    public final boolean AEQbTJ;
    public final java.util.List<java.lang.String> EZpvd;
    public final boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (r8v0 boolean)
  (r9v0 java.lang.String)
  (r10v0 boolean)
  (r11v0 boolean)
  (wrap:java.util.List:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:81)) : (r12v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(boolean, java.lang.String, boolean, boolean, java.util.List<java.lang.String>, java.lang.String):void (m)] (LINE:76) call: o.bdj.<init>(boolean, java.lang.String, boolean, boolean, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ C9870bdj(boolean z, java.lang.String str, boolean z2, boolean z3, java.util.List list, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, z2, z3, (i & 16) != 0 ? yDY.AhwBna() : list, (i & 32) != 0 ? "" : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9870bdj(boolean z, @NotNull java.lang.String str, boolean z2, boolean z3, @NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str2) {
        super(z, false);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = str;
        this.KWHzl = z2;
        this.AEQbTJ = z3;
        this.EZpvd = list;
        this.copydefault = str2;
    }
}
