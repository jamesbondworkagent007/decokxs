package o;

import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jDe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25702jDe {
    public final java.lang.String AEQbTJ;
    public final LeaderBoardSortModel EZpvd;
    public final boolean KWHzl;
    public final C25701jDd OLrzqt;
    public final LeaderBoardSortModel copydefault;
    public final LeaderBoardSortModel djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25702jDe() {
        this(null, false, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25702jDe copy$default(C25702jDe c25702jDe, java.lang.String str, boolean z, LeaderBoardSortModel leaderBoardSortModel, LeaderBoardSortModel leaderBoardSortModel2, LeaderBoardSortModel leaderBoardSortModel3, C25701jDd c25701jDd, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c25702jDe.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z = c25702jDe.KWHzl;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            leaderBoardSortModel = c25702jDe.copydefault;
        }
        LeaderBoardSortModel leaderBoardSortModel4 = leaderBoardSortModel;
        if ((i & 8) != 0) {
            leaderBoardSortModel2 = c25702jDe.djBIcL;
        }
        LeaderBoardSortModel leaderBoardSortModel5 = leaderBoardSortModel2;
        if ((i & 16) != 0) {
            leaderBoardSortModel3 = c25702jDe.EZpvd;
        }
        LeaderBoardSortModel leaderBoardSortModel6 = leaderBoardSortModel3;
        if ((i & 32) != 0) {
            c25701jDd = c25702jDe.OLrzqt;
        }
        return c25702jDe.OLrzqt(str, z2, leaderBoardSortModel4, leaderBoardSortModel5, leaderBoardSortModel6, c25701jDd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LeaderBoardSortModel AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LeaderBoardSortModel EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25701jDd KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LeaderBoardSortModel OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25702jDe OLrzqt(@NotNull java.lang.String str, boolean z, LeaderBoardSortModel leaderBoardSortModel, LeaderBoardSortModel leaderBoardSortModel2, LeaderBoardSortModel leaderBoardSortModel3, C25701jDd c25701jDd) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C25702jDe(str, z, leaderBoardSortModel, leaderBoardSortModel2, leaderBoardSortModel3, c25701jDd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25702jDe)) {
            return false;
        }
        C25702jDe c25702jDe = (C25702jDe) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c25702jDe.AEQbTJ) && this.KWHzl == c25702jDe.KWHzl && Intrinsics.EZpvd(this.copydefault, c25702jDe.copydefault) && Intrinsics.EZpvd(this.djBIcL, c25702jDe.djBIcL) && Intrinsics.EZpvd(this.EZpvd, c25702jDe.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c25702jDe.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = java.lang.Boolean.hashCode(this.KWHzl);
        LeaderBoardSortModel leaderBoardSortModel = this.copydefault;
        int iHashCode3 = leaderBoardSortModel == null ? 0 : leaderBoardSortModel.hashCode();
        LeaderBoardSortModel leaderBoardSortModel2 = this.djBIcL;
        int iHashCode4 = leaderBoardSortModel2 == null ? 0 : leaderBoardSortModel2.hashCode();
        LeaderBoardSortModel leaderBoardSortModel3 = this.EZpvd;
        int iHashCode5 = leaderBoardSortModel3 == null ? 0 : leaderBoardSortModel3.hashCode();
        C25701jDd c25701jDd = this.OLrzqt;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (c25701jDd != null ? c25701jDd.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LeaderBoardChipsUIState(chainId=" + this.AEQbTJ + ", isFilterReset=" + this.KWHzl + ", category=" + this.copydefault + ", ranking=" + this.djBIcL + ", duration=" + this.EZpvd + ", displayChip=" + this.OLrzqt + ")";
    }

    public C25702jDe(@NotNull java.lang.String str, boolean z, LeaderBoardSortModel leaderBoardSortModel, LeaderBoardSortModel leaderBoardSortModel2, LeaderBoardSortModel leaderBoardSortModel3, C25701jDd c25701jDd) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.KWHzl = z;
        this.copydefault = leaderBoardSortModel;
        this.djBIcL = leaderBoardSortModel2;
        this.EZpvd = leaderBoardSortModel3;
        this.OLrzqt = c25701jDd;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:boolean:0x000b: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r6v0 boolean))
  (wrap:com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel:?: TERNARY null = ((wrap:int:0x000c: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel) : (r7v0 com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel))
  (wrap:com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel:?: TERNARY null = ((wrap:int:0x0014: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel) : (r8v0 com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel))
  (wrap:com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel:?: TERNARY null = ((wrap:int:0x001b: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel) : (r9v0 com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel))
  (wrap:o.jDd:?: TERNARY null = ((wrap:int:0x0022: ARITH (r11v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r10v0 o.jDd) : (null o.jDd))
 A[MD:(java.lang.String, boolean, com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel, com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel, com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel, o.jDd):void (m)] (LINE:14) call: o.jDe.<init>(java.lang.String, boolean, com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel, com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel, com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel, o.jDd):void type: THIS */
    public /* synthetic */ C25702jDe(java.lang.String str, boolean z, LeaderBoardSortModel leaderBoardSortModel, LeaderBoardSortModel leaderBoardSortModel2, LeaderBoardSortModel leaderBoardSortModel3, C25701jDd c25701jDd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : leaderBoardSortModel, (i & 8) != 0 ? null : leaderBoardSortModel2, (i & 16) != 0 ? null : leaderBoardSortModel3, (i & 32) == 0 ? c25701jDd : null);
    }
}
