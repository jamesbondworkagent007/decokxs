package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gKP {
    public final int AEQbTJ;
    public java.lang.String[] EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final java.util.Map<java.lang.String, Function1<java.lang.String, java.lang.String>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String[] KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, Function1<java.lang.String, java.lang.String>> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.Map<java.lang.String, ? extends kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public gKP(int i, @androidx.annotation.StringRes int i2, @NotNull java.lang.String[] strArr, int i3, java.util.Map<java.lang.String, ? extends Function1<? super java.lang.String, java.lang.String>> map) {
        Intrinsics.checkNotNullParameter(strArr, "");
        this.OLrzqt = i;
        this.AEQbTJ = i2;
        this.EZpvd = strArr;
        this.KWHzl = i3;
        this.copydefault = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (r7v0 int)
  (r8v0 int)
  (wrap:java.lang.String[]:0x0007: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String[]:0x0005: NEW_ARRAY (0 int) A[WRAPPED] type: java.lang.String[]) : (r9v0 java.lang.String[]))
  (wrap:int:0x000d: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r10v0 int))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x000e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r11v0 java.util.Map))
 A[MD:(int, int, java.lang.String[], int, java.util.Map<java.lang.String, ? extends kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String>>):void (m)] (LINE:5) call: o.gKP.<init>(int, int, java.lang.String[], int, java.util.Map):void type: THIS */
    public /* synthetic */ gKP(int i, int i2, java.lang.String[] strArr, int i3, java.util.Map map, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? new java.lang.String[0] : strArr, (i4 & 8) != 0 ? -1 : i3, (i4 & 16) != 0 ? null : map);
    }
}
