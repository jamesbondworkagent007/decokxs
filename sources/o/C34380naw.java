package o;

import com.okinc.dexkline.market.features.holdings.ui.PositionSortType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.naw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34380naw {
    public final boolean AEQbTJ;
    public final PositionSortType EZpvd;
    public final boolean OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C34380naw() {
        this(false, false, null, false, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C34380naw copy$default(C34380naw c34380naw, boolean z, boolean z2, PositionSortType positionSortType, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c34380naw.OLrzqt;
        }
        if ((i & 2) != 0) {
            z2 = c34380naw.copydefault;
        }
        if ((i & 4) != 0) {
            positionSortType = c34380naw.EZpvd;
        }
        if ((i & 8) != 0) {
            z3 = c34380naw.AEQbTJ;
        }
        return c34380naw.EZpvd(z, z2, positionSortType, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34380naw EZpvd(boolean z, boolean z2, @NotNull PositionSortType positionSortType, boolean z3) {
        Intrinsics.checkNotNullParameter(positionSortType, "");
        return new C34380naw(z, z2, positionSortType, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34380naw)) {
            return false;
        }
        C34380naw c34380naw = (C34380naw) obj;
        return this.OLrzqt == c34380naw.OLrzqt && this.copydefault == c34380naw.copydefault && this.EZpvd == c34380naw.EZpvd && this.AEQbTJ == c34380naw.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.OLrzqt) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ActivePositionSorting(hideSmallAssets=" + this.OLrzqt + ", showCostPrice=" + this.copydefault + ", sortType=" + this.EZpvd + ", isDesc=" + this.AEQbTJ + ")";
    }

    public C34380naw(boolean z, boolean z2, @NotNull PositionSortType positionSortType, boolean z3) {
        Intrinsics.checkNotNullParameter(positionSortType, "");
        this.OLrzqt = z;
        this.copydefault = z2;
        this.EZpvd = positionSortType;
        this.AEQbTJ = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:com.okinc.dexkline.market.features.holdings.ui.PositionSortType:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.dexkline.market.features.holdings.ui.PositionSortType:0x000f: SGET  A[WRAPPED] (LINE:6) com.okinc.dexkline.market.features.holdings.ui.PositionSortType.BALANCE com.okinc.dexkline.market.features.holdings.ui.PositionSortType) : (r4v0 com.okinc.dexkline.market.features.holdings.ui.PositionSortType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r5v0 boolean))
 A[MD:(boolean, boolean, com.okinc.dexkline.market.features.holdings.ui.PositionSortType, boolean):void (m)] (LINE:3) call: o.naw.<init>(boolean, boolean, com.okinc.dexkline.market.features.holdings.ui.PositionSortType, boolean):void type: THIS */
    public /* synthetic */ C34380naw(boolean z, boolean z2, PositionSortType positionSortType, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? PositionSortType.BALANCE : positionSortType, (i & 8) != 0 ? true : z3);
    }
}
