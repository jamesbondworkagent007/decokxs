package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.ztH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59979ztH<T> {
    public final Function1<T, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59979ztH() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ztH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C59979ztH copy$default(C59979ztH c59979ztH, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = c59979ztH.KWHzl;
        }
        return c59979ztH.KWHzl(function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<T, Unit> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59979ztH<T> KWHzl(Function1<? super T, Unit> function1) {
        return new C59979ztH<>(function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C59979ztH) && Intrinsics.EZpvd(this.KWHzl, ((C59979ztH) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Function1<T, Unit> function1 = this.KWHzl;
        if (function1 == null) {
            return 0;
        }
        return function1.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Callbacks(onClose=" + this.KWHzl + ')';
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59979ztH(Function1<? super T, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super T, kotlin.Unit>):void (m)] (LINE:23) call: o.ztH.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C59979ztH(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }
}
