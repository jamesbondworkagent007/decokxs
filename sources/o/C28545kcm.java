package o;

import com.okinc.business.market.data.model.HomeTokenData;
import com.okinc.business.market.data.model.TokenAggregateData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kcm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C28545kcm {
    public final TokenAggregateData AEQbTJ;
    public final java.util.List<HomeTokenData> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kcm */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C28545kcm copy$default(C28545kcm c28545kcm, java.util.List list, TokenAggregateData tokenAggregateData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c28545kcm.copydefault;
        }
        if ((i & 2) != 0) {
            tokenAggregateData = c28545kcm.AEQbTJ;
        }
        return c28545kcm.KWHzl(list, tokenAggregateData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenAggregateData AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<HomeTokenData> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28545kcm KWHzl(@NotNull java.util.List<HomeTokenData> list, TokenAggregateData tokenAggregateData) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C28545kcm(list, tokenAggregateData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28545kcm)) {
            return false;
        }
        C28545kcm c28545kcm = (C28545kcm) obj;
        return Intrinsics.EZpvd(this.copydefault, c28545kcm.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c28545kcm.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        TokenAggregateData tokenAggregateData = this.AEQbTJ;
        return (iHashCode * 31) + (tokenAggregateData == null ? 0 : tokenAggregateData.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TokenListResult(items=" + this.copydefault + ", aggregate=" + this.AEQbTJ + ")";
    }

    public C28545kcm(@NotNull java.util.List<HomeTokenData> list, TokenAggregateData tokenAggregateData) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
        this.AEQbTJ = tokenAggregateData;
    }
}
