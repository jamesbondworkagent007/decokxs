package o;

import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.mjk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32765mjk implements RxBus.Application {
    public final boolean EZpvd;
    public final long KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C32765mjk copy$default(C32765mjk c32765mjk, boolean z, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c32765mjk.EZpvd;
        }
        if ((i & 2) != 0) {
            j = c32765mjk.KWHzl;
        }
        return c32765mjk.OLrzqt(z, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32765mjk OLrzqt(boolean z, long j) {
        return new C32765mjk(z, j);
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32765mjk)) {
            return false;
        }
        C32765mjk c32765mjk = (C32765mjk) obj;
        return this.EZpvd == c32765mjk.EZpvd && this.KWHzl == c32765mjk.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.EZpvd) * 31) + java.lang.Long.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ServiceStatusEvent(isRunning=" + this.EZpvd + ", timestamp=" + this.KWHzl + ")";
    }

    public C32765mjk(boolean z, long j) {
        this.EZpvd = z;
        this.KWHzl = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 boolean)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:92)) : (r2v0 long))
 A[MD:(boolean, long):void (m)] (LINE:90) call: o.mjk.<init>(boolean, long):void type: THIS */
    public /* synthetic */ C32765mjk(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? java.lang.System.currentTimeMillis() : j);
    }
}
