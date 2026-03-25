package o;

import com.okinc.market.search.features.main.root.data.po.P2pAndDeposit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qFz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40009qFz implements InterfaceC40516qYt {
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final P2pAndDeposit OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C40009qFz copy$default(C40009qFz c40009qFz, P2pAndDeposit p2pAndDeposit, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            p2pAndDeposit = c40009qFz.OLrzqt;
        }
        if ((i & 2) != 0) {
            z = c40009qFz.EZpvd;
        }
        if ((i & 4) != 0) {
            z2 = c40009qFz.KWHzl;
        }
        return c40009qFz.EZpvd(p2pAndDeposit, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40009qFz EZpvd(@NotNull P2pAndDeposit p2pAndDeposit, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(p2pAndDeposit, "");
        return new C40009qFz(p2pAndDeposit, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final P2pAndDeposit copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40009qFz)) {
            return false;
        }
        C40009qFz c40009qFz = (C40009qFz) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c40009qFz.OLrzqt) && this.EZpvd == c40009qFz.EZpvd && this.KWHzl == c40009qFz.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchResultP2pAndDepositVo(po=" + this.OLrzqt + ", isSupportP2p=" + this.EZpvd + ", isSupportDeposit=" + this.KWHzl + ")";
    }

    public C40009qFz(@NotNull P2pAndDeposit p2pAndDeposit, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(p2pAndDeposit, "");
        this.OLrzqt = p2pAndDeposit;
        this.EZpvd = z;
        this.KWHzl = z2;
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C40009qFz) && Intrinsics.EZpvd(this.OLrzqt, ((C40009qFz) interfaceC40516qYt).OLrzqt);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C40009qFz) && Intrinsics.EZpvd(this, interfaceC40516qYt);
    }
}
