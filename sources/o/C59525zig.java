package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.zig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59525zig<T> {
    public final T EZpvd;
    public final long KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.Object), (r2v0 long) A[MD:(T, long):void (m)] call: o.zig.<init>(java.lang.Object, long):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C59525zig(java.lang.Object obj, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.zig */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-RFiDyg4$default, reason: not valid java name */
    public static /* synthetic */ C59525zig m9310copyRFiDyg4$default(C59525zig c59525zig, java.lang.Object obj, long j, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = c59525zig.EZpvd;
        }
        if ((i & 2) != 0) {
            j = c59525zig.KWHzl;
        }
        return c59525zig.AEQbTJ(obj, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59525zig<T> AEQbTJ(T t, long j) {
        return new C59525zig<>(t, j, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59525zig)) {
            return false;
        }
        C59525zig c59525zig = (C59525zig) obj;
        return Intrinsics.EZpvd(this.EZpvd, c59525zig.EZpvd) && C59462zhW.EZpvd(this.KWHzl, c59525zig.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        T t = this.EZpvd;
        return ((t == null ? 0 : t.hashCode()) * 31) + C59462zhW.AuCTel(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TimedValue(value=" + this.EZpvd + ", duration=" + ((java.lang.Object) C59462zhW.getFieldNames(this.KWHzl)) + ')';
    }

    public C59525zig(T t, long j) {
        this.EZpvd = t;
        this.KWHzl = j;
    }
}
