package o;

import com.okinc.business.invest_biz.data.contants.AssetStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iEI {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final iEI EZpvd = new iEI(0, null, 3, null);
    public final AssetStatus AEQbTJ;
    public final long OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public iEI() {
        this(0L, null, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ iEI copy$default(iEI iei, long j, AssetStatus assetStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = iei.OLrzqt;
        }
        if ((i & 2) != 0) {
            assetStatus = iei.AEQbTJ;
        }
        return iei.copydefault(j, assetStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iEI copydefault(long j, @NotNull AssetStatus assetStatus) {
        Intrinsics.checkNotNullParameter(assetStatus, "");
        return new iEI(j, assetStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iEI)) {
            return false;
        }
        iEI iei = (iEI) obj;
        return this.OLrzqt == iei.OLrzqt && this.AEQbTJ == iei.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Long.hashCode(this.OLrzqt) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "StatusInfo(updatedAt=" + this.OLrzqt + ", assetStatus=" + this.AEQbTJ + ")";
    }

    public iEI(long j, @NotNull AssetStatus assetStatus) {
        Intrinsics.checkNotNullParameter(assetStatus, "");
        this.OLrzqt = j;
        this.AEQbTJ = assetStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r1v0 long))
  (wrap:com.okinc.business.invest_biz.data.contants.AssetStatus:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.data.contants.AssetStatus:0x000a: SGET  A[WRAPPED] (LINE:44) com.okinc.business.invest_biz.data.contants.AssetStatus.Default com.okinc.business.invest_biz.data.contants.AssetStatus) : (r3v0 com.okinc.business.invest_biz.data.contants.AssetStatus))
 A[MD:(long, com.okinc.business.invest_biz.data.contants.AssetStatus):void (m)] (LINE:42) call: o.iEI.<init>(long, com.okinc.business.invest_biz.data.contants.AssetStatus):void type: THIS */
    public /* synthetic */ iEI(long j, AssetStatus assetStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? AssetStatus.Default : assetStatus);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iEI.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final iEI copydefault() {
            return iEI.EZpvd;
        }
    }
}
