package o;

import com.okinc.business.defi.biz.model.ChainAddress;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bhF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C10052bhF {
    public final java.util.List<ChainAddress> KWHzl;
    public final AbstractC12782ctV OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.bhF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C10052bhF copy$default(C10052bhF c10052bhF, java.util.List list, AbstractC12782ctV abstractC12782ctV, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c10052bhF.KWHzl;
        }
        if ((i & 2) != 0) {
            abstractC12782ctV = c10052bhF.OLrzqt;
        }
        return c10052bhF.OLrzqt(list, abstractC12782ctV);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ChainAddress> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10052bhF OLrzqt(@NotNull java.util.List<ChainAddress> list, @NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return new C10052bhF(list, abstractC12782ctV);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10052bhF)) {
            return false;
        }
        C10052bhF c10052bhF = (C10052bhF) obj;
        return Intrinsics.EZpvd(this.KWHzl, c10052bhF.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c10052bhF.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AddressAggregationData(chainAddressList=" + this.KWHzl + ", wallet=" + this.OLrzqt + ")";
    }

    public C10052bhF(@NotNull java.util.List<ChainAddress> list, @NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        this.KWHzl = list;
        this.OLrzqt = abstractC12782ctV;
    }
}
