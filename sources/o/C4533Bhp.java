package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bhp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C4533Bhp {
    public static final int $stable = 8;
    public java.lang.String KWHzl;
    public long copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 long) A[MD:(java.lang.String, long):void (m)] call: o.Bhp.<init>(java.lang.String, long):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C4533Bhp(java.lang.String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: copy-2TYgG_w$default, reason: not valid java name */
    public static /* synthetic */ C4533Bhp m8311copy2TYgG_w$default(C4533Bhp c4533Bhp, java.lang.String str, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c4533Bhp.KWHzl;
        }
        if ((i & 2) != 0) {
            j = c4533Bhp.copydefault;
        }
        return c4533Bhp.OLrzqt(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4533Bhp OLrzqt(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C4533Bhp(str, j, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4533Bhp)) {
            return false;
        }
        C4533Bhp c4533Bhp = (C4533Bhp) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c4533Bhp.KWHzl) && this.copydefault == c4533Bhp.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + C56396yDv.AEQbTJ(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarketCapReq(symbol=" + this.KWHzl + ", cacheExpireSeconds=" + C56396yDv.EZpvd(this.copydefault) + ")";
    }

    public C4533Bhp(java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.copydefault = j;
    }
}
