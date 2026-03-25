package o;

import com.okinc.business.market.features.holdings.ui.PositionSortType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28444kar {
    public final boolean AEQbTJ;
    public final PositionSortType KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C28444kar() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C28444kar copy$default(C28444kar c28444kar, PositionSortType positionSortType, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            positionSortType = c28444kar.KWHzl;
        }
        if ((i & 2) != 0) {
            z = c28444kar.AEQbTJ;
        }
        return c28444kar.OLrzqt(positionSortType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PositionSortType KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28444kar OLrzqt(@NotNull PositionSortType positionSortType, boolean z) {
        Intrinsics.checkNotNullParameter(positionSortType, "");
        return new C28444kar(positionSortType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28444kar)) {
            return false;
        }
        C28444kar c28444kar = (C28444kar) obj;
        return this.KWHzl == c28444kar.KWHzl && this.AEQbTJ == c28444kar.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ActivePositionSorting(sortType=" + this.KWHzl + ", isDesc=" + this.AEQbTJ + ")";
    }

    public C28444kar(@NotNull PositionSortType positionSortType, boolean z) {
        Intrinsics.checkNotNullParameter(positionSortType, "");
        this.KWHzl = positionSortType;
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.holdings.ui.PositionSortType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.holdings.ui.PositionSortType:0x0004: SGET  A[WRAPPED] (LINE:4) com.okinc.business.market.features.holdings.ui.PositionSortType.BALANCE com.okinc.business.market.features.holdings.ui.PositionSortType) : (r1v0 com.okinc.business.market.features.holdings.ui.PositionSortType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(com.okinc.business.market.features.holdings.ui.PositionSortType, boolean):void (m)] (LINE:3) call: o.kar.<init>(com.okinc.business.market.features.holdings.ui.PositionSortType, boolean):void type: THIS */
    public /* synthetic */ C28444kar(PositionSortType positionSortType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PositionSortType.BALANCE : positionSortType, (i & 2) != 0 ? true : z);
    }
}
