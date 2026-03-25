package o;

import com.okinc.business.market.features.overview.domain.TransactionStatistic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.klZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29009klZ {
    public final boolean AEQbTJ;
    public final TransactionStatistic OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C29009klZ() {
        this(false, false, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C29009klZ copy$default(C29009klZ c29009klZ, boolean z, boolean z2, TransactionStatistic transactionStatistic, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c29009klZ.copydefault;
        }
        if ((i & 2) != 0) {
            z2 = c29009klZ.AEQbTJ;
        }
        if ((i & 4) != 0) {
            transactionStatistic = c29009klZ.OLrzqt;
        }
        return c29009klZ.OLrzqt(z, z2, transactionStatistic);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionStatistic AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29009klZ OLrzqt(boolean z, boolean z2, @NotNull TransactionStatistic transactionStatistic) {
        Intrinsics.checkNotNullParameter(transactionStatistic, "");
        return new C29009klZ(z, z2, transactionStatistic);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29009klZ)) {
            return false;
        }
        C29009klZ c29009klZ = (C29009klZ) obj;
        return this.copydefault == c29009klZ.copydefault && this.AEQbTJ == c29009klZ.AEQbTJ && Intrinsics.EZpvd(this.OLrzqt, c29009klZ.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.copydefault) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TransactionByTimeUiState(loading=" + this.copydefault + ", error=" + this.AEQbTJ + ", data=" + this.OLrzqt + ")";
    }

    public C29009klZ(boolean z, boolean z2, @NotNull TransactionStatistic transactionStatistic) {
        Intrinsics.checkNotNullParameter(transactionStatistic, "");
        this.copydefault = z;
        this.AEQbTJ = z2;
        this.OLrzqt = transactionStatistic;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:com.okinc.business.market.features.overview.domain.TransactionStatistic:?: TERNARY null = ((wrap:int:0x000b: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.overview.domain.TransactionStatistic:0x001b: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (63 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:43) call: com.okinc.business.market.features.overview.domain.TransactionStatistic.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r12v0 com.okinc.business.market.features.overview.domain.TransactionStatistic))
 A[MD:(boolean, boolean, com.okinc.business.market.features.overview.domain.TransactionStatistic):void (m)] (LINE:40) call: o.klZ.<init>(boolean, boolean, com.okinc.business.market.features.overview.domain.TransactionStatistic):void type: THIS */
    public /* synthetic */ C29009klZ(boolean z, boolean z2, TransactionStatistic transactionStatistic, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? new TransactionStatistic(null, null, null, null, null, null, 63, null) : transactionStatistic);
    }
}
