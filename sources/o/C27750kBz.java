package o;

import com.okinc.business.market.features.vibes.domain.VibesSortType;
import com.okinc.business.market.features.vibes.domain.VibesTimeRange;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kBz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27750kBz {
    public final int AEQbTJ;
    public final VibesSortType EZpvd;
    public final VibesSortType KWHzl;
    public final VibesTimeRange OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27750kBz() {
        this(null, 0, null, null, false, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C27750kBz copy$default(C27750kBz c27750kBz, VibesTimeRange vibesTimeRange, int i, VibesSortType vibesSortType, VibesSortType vibesSortType2, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            vibesTimeRange = c27750kBz.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            i = c27750kBz.AEQbTJ;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            vibesSortType = c27750kBz.KWHzl;
        }
        VibesSortType vibesSortType3 = vibesSortType;
        if ((i2 & 8) != 0) {
            vibesSortType2 = c27750kBz.EZpvd;
        }
        VibesSortType vibesSortType4 = vibesSortType2;
        if ((i2 & 16) != 0) {
            z = c27750kBz.copydefault;
        }
        return c27750kBz.copydefault(vibesTimeRange, i3, vibesSortType3, vibesSortType4, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VibesSortType EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VibesSortType KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VibesTimeRange copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27750kBz copydefault(@NotNull VibesTimeRange vibesTimeRange, int i, @NotNull VibesSortType vibesSortType, @NotNull VibesSortType vibesSortType2, boolean z) {
        Intrinsics.checkNotNullParameter(vibesTimeRange, "");
        Intrinsics.checkNotNullParameter(vibesSortType, "");
        Intrinsics.checkNotNullParameter(vibesSortType2, "");
        return new C27750kBz(vibesTimeRange, i, vibesSortType, vibesSortType2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27750kBz)) {
            return false;
        }
        C27750kBz c27750kBz = (C27750kBz) obj;
        return this.OLrzqt == c27750kBz.OLrzqt && this.AEQbTJ == c27750kBz.AEQbTJ && this.KWHzl == c27750kBz.KWHzl && this.EZpvd == c27750kBz.EZpvd && this.copydefault == c27750kBz.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.OLrzqt.hashCode() * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "VibesFilterUiState(timeRange=" + this.OLrzqt + ", klineMode=" + this.AEQbTJ + ", treemapSortType=" + this.KWHzl + ", kolListSortType=" + this.EZpvd + ", isListDateMode=" + this.copydefault + ")";
    }

    public C27750kBz(@NotNull VibesTimeRange vibesTimeRange, int i, @NotNull VibesSortType vibesSortType, @NotNull VibesSortType vibesSortType2, boolean z) {
        Intrinsics.checkNotNullParameter(vibesTimeRange, "");
        Intrinsics.checkNotNullParameter(vibesSortType, "");
        Intrinsics.checkNotNullParameter(vibesSortType2, "");
        this.OLrzqt = vibesTimeRange;
        this.AEQbTJ = i;
        this.KWHzl = vibesSortType;
        this.EZpvd = vibesSortType2;
        this.copydefault = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.vibes.domain.VibesTimeRange:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.vibes.domain.VibesTimeRange:0x0004: SGET  A[WRAPPED] (LINE:47) com.okinc.business.market.features.vibes.domain.VibesTimeRange.TIME_3D com.okinc.business.market.features.vibes.domain.VibesTimeRange) : (r4v0 com.okinc.business.market.features.vibes.domain.VibesTimeRange))
  (wrap:int:0x000b: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
  (wrap:com.okinc.business.market.features.vibes.domain.VibesSortType:0x0012: TERNARY null = ((wrap:int:0x000c: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.vibes.domain.VibesSortType:0x0010: SGET  A[WRAPPED] (LINE:49) com.okinc.business.market.features.vibes.domain.VibesSortType.ENGAGEMENTS com.okinc.business.market.features.vibes.domain.VibesSortType) : (r6v0 com.okinc.business.market.features.vibes.domain.VibesSortType))
  (wrap:com.okinc.business.market.features.vibes.domain.VibesSortType:0x0019: TERNARY null = ((wrap:int:0x0013: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.vibes.domain.VibesSortType:0x0017: SGET  A[WRAPPED] (LINE:50) com.okinc.business.market.features.vibes.domain.VibesSortType.ENGAGEMENTS com.okinc.business.market.features.vibes.domain.VibesSortType) : (r7v0 com.okinc.business.market.features.vibes.domain.VibesSortType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001a: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r8v0 boolean))
 A[MD:(com.okinc.business.market.features.vibes.domain.VibesTimeRange, int, com.okinc.business.market.features.vibes.domain.VibesSortType, com.okinc.business.market.features.vibes.domain.VibesSortType, boolean):void (m)] (LINE:46) call: o.kBz.<init>(com.okinc.business.market.features.vibes.domain.VibesTimeRange, int, com.okinc.business.market.features.vibes.domain.VibesSortType, com.okinc.business.market.features.vibes.domain.VibesSortType, boolean):void type: THIS */
    public /* synthetic */ C27750kBz(VibesTimeRange vibesTimeRange, int i, VibesSortType vibesSortType, VibesSortType vibesSortType2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? VibesTimeRange.TIME_3D : vibesTimeRange, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? VibesSortType.ENGAGEMENTS : vibesSortType, (i2 & 8) != 0 ? VibesSortType.ENGAGEMENTS : vibesSortType2, (i2 & 16) != 0 ? true : z);
    }
}
