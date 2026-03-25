package o;

import com.okinc.unify_trade.trade.source.search.OkBizSearchInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ptq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C39519ptq {
    public static final int OLrzqt = OkBizSearchInfo.$stable;
    public final java.lang.String AEQbTJ;
    public final OkBizSearchInfo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C39519ptq copy$default(C39519ptq c39519ptq, OkBizSearchInfo okBizSearchInfo, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            okBizSearchInfo = c39519ptq.copydefault;
        }
        if ((i & 2) != 0) {
            str = c39519ptq.AEQbTJ;
        }
        return c39519ptq.AEQbTJ(okBizSearchInfo, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39519ptq AEQbTJ(@NotNull OkBizSearchInfo okBizSearchInfo, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(okBizSearchInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C39519ptq(okBizSearchInfo, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkBizSearchInfo EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39519ptq)) {
            return false;
        }
        C39519ptq c39519ptq = (C39519ptq) obj;
        return Intrinsics.EZpvd(this.copydefault, c39519ptq.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c39519ptq.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CoinInfoTradeData(data=" + this.copydefault + ", type=" + this.AEQbTJ + ")";
    }

    public C39519ptq(@NotNull OkBizSearchInfo okBizSearchInfo, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(okBizSearchInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = okBizSearchInfo;
        this.AEQbTJ = str;
    }
}
