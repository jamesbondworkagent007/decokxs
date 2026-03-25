package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.pxw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C39737pxw<T> {
    public final T EZpvd;
    public boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T copydefault() {
        return this.EZpvd;
    }

    public C39737pxw(T t, boolean z) {
        this.EZpvd = t;
        this.KWHzl = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.Object)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(T, boolean):void (m)] (LINE:269) call: o.pxw.<init>(java.lang.Object, boolean):void type: THIS */
    public /* synthetic */ C39737pxw(java.lang.Object obj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? false : z);
    }
}
