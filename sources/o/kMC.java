package o;

import com.okinc.business.market.common.constants.RankingType;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class kMC {
    public final boolean AEQbTJ;
    public final RankingType KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public kMC() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ kMC copy$default(kMC kmc, RankingType rankingType, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            rankingType = kmc.KWHzl;
        }
        if ((i & 2) != 0) {
            z = kmc.AEQbTJ;
        }
        return kmc.copydefault(rankingType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankingType EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kMC copydefault(RankingType rankingType, boolean z) {
        return new kMC(rankingType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kMC)) {
            return false;
        }
        kMC kmc = (kMC) obj;
        return this.KWHzl == kmc.KWHzl && this.AEQbTJ == kmc.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        RankingType rankingType = this.KWHzl;
        return ((rankingType == null ? 0 : rankingType.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HomeRankingUiModel(selectedType=" + this.KWHzl + ", isDesc=" + this.AEQbTJ + ")";
    }

    public kMC(RankingType rankingType, boolean z) {
        this.KWHzl = rankingType;
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:com.okinc.business.market.common.constants.RankingType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.common.constants.RankingType) : (r1v0 com.okinc.business.market.common.constants.RankingType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(com.okinc.business.market.common.constants.RankingType, boolean):void (m)] (LINE:13) call: o.kMC.<init>(com.okinc.business.market.common.constants.RankingType, boolean):void type: THIS */
    public /* synthetic */ kMC(RankingType rankingType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rankingType, (i & 2) != 0 ? true : z);
    }
}
