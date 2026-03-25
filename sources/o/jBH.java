package o;

import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel;
import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jBH {
    public final LeaderBoardSortModel AEQbTJ;
    public final LeaderBoardSortModel EZpvd;
    public final LeaderBoardFilterModel KWHzl;
    public final java.lang.String OLrzqt;
    public final jBI copydefault;
    public final LeaderBoardSortModel valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public jBH() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ jBH copy$default(jBH jbh, java.lang.String str, LeaderBoardSortModel leaderBoardSortModel, LeaderBoardSortModel leaderBoardSortModel2, LeaderBoardSortModel leaderBoardSortModel3, LeaderBoardFilterModel leaderBoardFilterModel, jBI jbi, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = jbh.OLrzqt;
        }
        if ((i & 2) != 0) {
            leaderBoardSortModel = jbh.AEQbTJ;
        }
        LeaderBoardSortModel leaderBoardSortModel4 = leaderBoardSortModel;
        if ((i & 4) != 0) {
            leaderBoardSortModel2 = jbh.valueOf;
        }
        LeaderBoardSortModel leaderBoardSortModel5 = leaderBoardSortModel2;
        if ((i & 8) != 0) {
            leaderBoardSortModel3 = jbh.EZpvd;
        }
        LeaderBoardSortModel leaderBoardSortModel6 = leaderBoardSortModel3;
        if ((i & 16) != 0) {
            leaderBoardFilterModel = jbh.KWHzl;
        }
        LeaderBoardFilterModel leaderBoardFilterModel2 = leaderBoardFilterModel;
        if ((i & 32) != 0) {
            jbi = jbh.copydefault;
        }
        return jbh.AEQbTJ(str, leaderBoardSortModel4, leaderBoardSortModel5, leaderBoardSortModel6, leaderBoardFilterModel2, jbi);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jBH AEQbTJ(@NotNull java.lang.String str, LeaderBoardSortModel leaderBoardSortModel, LeaderBoardSortModel leaderBoardSortModel2, LeaderBoardSortModel leaderBoardSortModel3, LeaderBoardFilterModel leaderBoardFilterModel, @NotNull jBI jbi) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jbi, "");
        return new jBH(str, leaderBoardSortModel, leaderBoardSortModel2, leaderBoardSortModel3, leaderBoardFilterModel, jbi);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LeaderBoardSortModel AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jBI EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LeaderBoardFilterModel KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LeaderBoardSortModel OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LeaderBoardSortModel copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jBH)) {
            return false;
        }
        jBH jbh = (jBH) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) jbh.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, jbh.AEQbTJ) && Intrinsics.EZpvd(this.valueOf, jbh.valueOf) && Intrinsics.EZpvd(this.EZpvd, jbh.EZpvd) && Intrinsics.EZpvd(this.KWHzl, jbh.KWHzl) && Intrinsics.EZpvd(this.copydefault, jbh.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        LeaderBoardSortModel leaderBoardSortModel = this.AEQbTJ;
        int iHashCode2 = leaderBoardSortModel == null ? 0 : leaderBoardSortModel.hashCode();
        LeaderBoardSortModel leaderBoardSortModel2 = this.valueOf;
        int iHashCode3 = leaderBoardSortModel2 == null ? 0 : leaderBoardSortModel2.hashCode();
        LeaderBoardSortModel leaderBoardSortModel3 = this.EZpvd;
        int iHashCode4 = leaderBoardSortModel3 == null ? 0 : leaderBoardSortModel3.hashCode();
        LeaderBoardFilterModel leaderBoardFilterModel = this.KWHzl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (leaderBoardFilterModel != null ? leaderBoardFilterModel.hashCode() : 0)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LeaderBoardFilterGroup(chainId=" + this.OLrzqt + ", category=" + this.AEQbTJ + ", ranking=" + this.valueOf + ", duration=" + this.EZpvd + ", filters=" + this.KWHzl + ", paginationData=" + this.copydefault + ")";
    }

    public jBH(@NotNull java.lang.String str, LeaderBoardSortModel leaderBoardSortModel, LeaderBoardSortModel leaderBoardSortModel2, LeaderBoardSortModel leaderBoardSortModel3, LeaderBoardFilterModel leaderBoardFilterModel, @NotNull jBI jbi) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jbi, "");
        this.OLrzqt = str;
        this.AEQbTJ = leaderBoardSortModel;
        this.valueOf = leaderBoardSortModel2;
        this.EZpvd = leaderBoardSortModel3;
        this.KWHzl = leaderBoardFilterModel;
        this.copydefault = jbi;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel:?: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel) : (r6v0 com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel))
  (wrap:com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel:?: TERNARY null = ((wrap:int:0x000e: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel) : (r7v0 com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel))
  (wrap:com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel:?: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel) : (r8v0 com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel))
  (wrap:com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel:?: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel) : (r9v0 com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel))
  (wrap:o.jBI:?: TERNARY null = ((wrap:int:0x0023: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:o.jBI:0x002b: CONSTRUCTOR (0 int), (0 int), (3 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:9) call: o.jBI.<init>(int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r10v0 o.jBI))
 A[MD:(java.lang.String, com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel, com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel, com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel, com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel, o.jBI):void (m)] (LINE:3) call: o.jBH.<init>(java.lang.String, com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel, com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel, com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel, com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel, o.jBI):void type: THIS */
    public /* synthetic */ jBH(java.lang.String str, LeaderBoardSortModel leaderBoardSortModel, LeaderBoardSortModel leaderBoardSortModel2, LeaderBoardSortModel leaderBoardSortModel3, LeaderBoardFilterModel leaderBoardFilterModel, jBI jbi, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : leaderBoardSortModel, (i & 4) != 0 ? null : leaderBoardSortModel2, (i & 8) != 0 ? null : leaderBoardSortModel3, (i & 16) != 0 ? null : leaderBoardFilterModel, (i & 32) != 0 ? new jBI(0, 0, 3, null) : jbi);
    }
}
