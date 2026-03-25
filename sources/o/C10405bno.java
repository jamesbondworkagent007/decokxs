package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bno, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10405bno {
    public final boolean AEQbTJ;
    public final java.util.List<C10527bqD> EZpvd;
    public final C10531bqH KWHzl;
    public final AbstractC12782ctV OLrzqt;
    public final java.util.List<C10525bqB> copydefault;
    public final java.util.List<C10525bqB> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.bno */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C10405bno copy$default(C10405bno c10405bno, AbstractC12782ctV abstractC12782ctV, boolean z, java.util.List list, java.util.List list2, java.util.List list3, C10531bqH c10531bqH, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            abstractC12782ctV = c10405bno.OLrzqt;
        }
        if ((i & 2) != 0) {
            z = c10405bno.AEQbTJ;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            list = c10405bno.copydefault;
        }
        java.util.List list4 = list;
        if ((i & 8) != 0) {
            list2 = c10405bno.djBIcL;
        }
        java.util.List list5 = list2;
        if ((i & 16) != 0) {
            list3 = c10405bno.EZpvd;
        }
        java.util.List list6 = list3;
        if ((i & 32) != 0) {
            c10531bqH = c10405bno.KWHzl;
        }
        return c10405bno.AEQbTJ(abstractC12782ctV, z2, list4, list5, list6, c10531bqH);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C10525bqB> AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10405bno AEQbTJ(@NotNull AbstractC12782ctV abstractC12782ctV, boolean z, @NotNull java.util.List<C10525bqB> list, @NotNull java.util.List<C10525bqB> list2, @NotNull java.util.List<C10527bqD> list3, @NotNull C10531bqH c10531bqH) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(c10531bqH, "");
        return new C10405bno(abstractC12782ctV, z, list, list2, list3, c10531bqH);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C10525bqB> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10405bno)) {
            return false;
        }
        C10405bno c10405bno = (C10405bno) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c10405bno.OLrzqt) && this.AEQbTJ == c10405bno.AEQbTJ && Intrinsics.EZpvd(this.copydefault, c10405bno.copydefault) && Intrinsics.EZpvd(this.djBIcL, c10405bno.djBIcL) && Intrinsics.EZpvd(this.EZpvd, c10405bno.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c10405bno.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + this.copydefault.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HomeAssetsDataSource(mainWallet=" + this.OLrzqt + ", isRefreshFromServer=" + this.AEQbTJ + ", coinData=" + this.copydefault + ", smallCoinData=" + this.djBIcL + ", defiData=" + this.EZpvd + ", nftData=" + this.KWHzl + ")";
    }

    public C10405bno(@NotNull AbstractC12782ctV abstractC12782ctV, boolean z, @NotNull java.util.List<C10525bqB> list, @NotNull java.util.List<C10525bqB> list2, @NotNull java.util.List<C10527bqD> list3, @NotNull C10531bqH c10531bqH) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(c10531bqH, "");
        this.OLrzqt = abstractC12782ctV;
        this.AEQbTJ = z;
        this.copydefault = list;
        this.djBIcL = list2;
        this.EZpvd = list3;
        this.KWHzl = c10531bqH;
    }
}
