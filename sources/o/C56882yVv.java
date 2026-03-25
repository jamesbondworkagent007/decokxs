package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yVv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56882yVv {
    public final yVF AEQbTJ;
    public final java.util.List<yVF> KWHzl;
    public final C56882yVv OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C56882yVv() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yVF AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56882yVv OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<yVF> copydefault() {
        return this.KWHzl;
    }

    public C56882yVv(yVF yvf, @NotNull java.util.List<yVF> list, java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = yvf;
        this.KWHzl = list;
        this.copydefault = str;
        C56882yVv c56882yVv = null;
        if (str != null) {
            yVF yvfEZpvd = yvf != null ? yvf.EZpvd() : null;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (yVF yvf2 : list) {
                arrayList.add(yvf2 != null ? yvf2.EZpvd() : null);
            }
            c56882yVv = new C56882yVv(yvfEZpvd, arrayList, null);
        }
        this.OLrzqt = c56882yVv;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:o.yVF:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.yVF) : (r2v0 o.yVF))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:33)) : (r3v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(o.yVF, java.util.List<o.yVF>, java.lang.String):void (m)] (LINE:31) call: o.yVv.<init>(o.yVF, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ C56882yVv(yVF yvf, java.util.List list, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : yvf, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? null : str);
    }
}
