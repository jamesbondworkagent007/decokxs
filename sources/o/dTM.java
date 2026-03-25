package o;

import com.okinc.business.defi.tee.bean.CacheState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dTM {
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final long KWHzl;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;
    public CacheState djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ dTM copy$default(dTM dtm, CacheState cacheState, java.lang.String str, boolean z, boolean z2, boolean z3, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cacheState = dtm.djBIcL;
        }
        if ((i & 2) != 0) {
            str = dtm.OLrzqt;
        }
        java.lang.String str2 = str;
        if ((i & 4) != 0) {
            z = dtm.AEQbTJ;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = dtm.copydefault;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = dtm.EZpvd;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            j = dtm.KWHzl;
        }
        return dtm.KWHzl(cacheState, str2, z4, z5, z6, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final dTM KWHzl(@NotNull CacheState cacheState, @NotNull java.lang.String str, boolean z, boolean z2, boolean z3, long j) {
        Intrinsics.checkNotNullParameter(cacheState, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new dTM(cacheState, str, z, z2, z3, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CacheState copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dTM)) {
            return false;
        }
        dTM dtm = (dTM) obj;
        return this.djBIcL == dtm.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) dtm.OLrzqt) && this.AEQbTJ == dtm.AEQbTJ && this.copydefault == dtm.copydefault && this.EZpvd == dtm.EZpvd && this.KWHzl == dtm.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.djBIcL.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Long.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AccountAndChainStatus(state=" + this.djBIcL + ", accountId=" + this.OLrzqt + ", serviceIsMaintenance=" + this.AEQbTJ + ", serviceIsSupportChain=" + this.copydefault + ", isAlreadyUploaded=" + this.EZpvd + ", chainIndex=" + this.KWHzl + ")";
    }

    public dTM(@NotNull CacheState cacheState, @NotNull java.lang.String str, boolean z, boolean z2, boolean z3, long j) {
        Intrinsics.checkNotNullParameter(cacheState, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = cacheState;
        this.OLrzqt = str;
        this.AEQbTJ = z;
        this.copydefault = z2;
        this.EZpvd = z3;
        this.KWHzl = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.tee.bean.CacheState:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:5) com.okinc.business.defi.tee.bean.CacheState.None com.okinc.business.defi.tee.bean.CacheState) : (r10v0 com.okinc.business.defi.tee.bean.CacheState))
  (r11v0 java.lang.String)
  (r12v0 boolean)
  (r13v0 boolean)
  (r14v0 boolean)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0009: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r15v0 long))
 A[MD:(com.okinc.business.defi.tee.bean.CacheState, java.lang.String, boolean, boolean, boolean, long):void (m)] (LINE:4) call: o.dTM.<init>(com.okinc.business.defi.tee.bean.CacheState, java.lang.String, boolean, boolean, boolean, long):void type: THIS */
    public /* synthetic */ dTM(CacheState cacheState, java.lang.String str, boolean z, boolean z2, boolean z3, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CacheState.None : cacheState, str, z, z2, z3, (i & 32) != 0 ? 0L : j);
    }
}
