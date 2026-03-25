package o;

import com.okinc.dexkline.market.features.overview.domain.TransactionStatistic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.naT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34351naT {
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final TransactionStatistic copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C34351naT() {
        this(false, false, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C34351naT copy$default(C34351naT c34351naT, boolean z, boolean z2, TransactionStatistic transactionStatistic, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c34351naT.OLrzqt;
        }
        if ((i & 2) != 0) {
            z2 = c34351naT.KWHzl;
        }
        if ((i & 4) != 0) {
            transactionStatistic = c34351naT.copydefault;
        }
        return c34351naT.OLrzqt(z, z2, transactionStatistic);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionStatistic EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34351naT OLrzqt(boolean z, boolean z2, @NotNull TransactionStatistic transactionStatistic) {
        Intrinsics.checkNotNullParameter(transactionStatistic, "");
        return new C34351naT(z, z2, transactionStatistic);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34351naT)) {
            return false;
        }
        C34351naT c34351naT = (C34351naT) obj;
        return this.OLrzqt == c34351naT.OLrzqt && this.KWHzl == c34351naT.KWHzl && Intrinsics.EZpvd(this.copydefault, c34351naT.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.OLrzqt) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TransactionByTimeUiState(loading=" + this.OLrzqt + ", error=" + this.KWHzl + ", data=" + this.copydefault + ")";
    }

    public C34351naT(boolean z, boolean z2, @NotNull TransactionStatistic transactionStatistic) {
        Intrinsics.checkNotNullParameter(transactionStatistic, "");
        this.OLrzqt = z;
        this.KWHzl = z2;
        this.copydefault = transactionStatistic;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:com.okinc.dexkline.market.features.overview.domain.TransactionStatistic:?: TERNARY null = ((wrap:int:0x000b: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.dexkline.market.features.overview.domain.TransactionStatistic:0x001b: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (63 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:32) call: com.okinc.dexkline.market.features.overview.domain.TransactionStatistic.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r12v0 com.okinc.dexkline.market.features.overview.domain.TransactionStatistic))
 A[MD:(boolean, boolean, com.okinc.dexkline.market.features.overview.domain.TransactionStatistic):void (m)] (LINE:29) call: o.naT.<init>(boolean, boolean, com.okinc.dexkline.market.features.overview.domain.TransactionStatistic):void type: THIS */
    public /* synthetic */ C34351naT(boolean z, boolean z2, TransactionStatistic transactionStatistic, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? new TransactionStatistic(null, null, null, null, null, null, 63, null) : transactionStatistic);
    }
}
