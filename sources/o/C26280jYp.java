package o;

import com.okinc.business.market.common.constants.RankingType;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jYp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26280jYp implements kMU {
    public boolean AEQbTJ;
    public final java.lang.String KWHzl;
    public final RankingType copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C26280jYp copy$default(C26280jYp c26280jYp, java.lang.String str, RankingType rankingType, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c26280jYp.KWHzl;
        }
        if ((i & 2) != 0) {
            rankingType = c26280jYp.copydefault;
        }
        if ((i & 4) != 0) {
            z = c26280jYp.AEQbTJ;
        }
        return c26280jYp.AEQbTJ(str, rankingType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26280jYp AEQbTJ(@NotNull java.lang.String str, @NotNull RankingType rankingType, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rankingType, "");
        return new C26280jYp(str, rankingType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankingType copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26280jYp)) {
            return false;
        }
        C26280jYp c26280jYp = (C26280jYp) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c26280jYp.KWHzl) && this.copydefault == c26280jYp.copydefault && this.AEQbTJ == c26280jYp.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RankFilterUiModel(title=" + this.KWHzl + ", rankingType=" + this.copydefault + ", check=" + this.AEQbTJ + ")";
    }

    public C26280jYp(@NotNull java.lang.String str, @NotNull RankingType rankingType, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rankingType, "");
        this.KWHzl = str;
        this.copydefault = rankingType;
        this.AEQbTJ = z;
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        return kMU.TaskDescription.KWHzl(this, kmu);
    }

    @Override // o.kMU
    public java.lang.Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }
}
