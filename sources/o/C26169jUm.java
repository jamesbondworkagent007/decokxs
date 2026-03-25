package o;

import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jUm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26169jUm implements InterfaceC26171jUo {
    public boolean EZpvd;
    public final java.lang.String OLrzqt;
    public final MarketFavoritesGroupPo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C26169jUm copy$default(C26169jUm c26169jUm, java.lang.String str, MarketFavoritesGroupPo marketFavoritesGroupPo, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c26169jUm.OLrzqt;
        }
        if ((i & 2) != 0) {
            marketFavoritesGroupPo = c26169jUm.copydefault;
        }
        if ((i & 4) != 0) {
            z = c26169jUm.EZpvd;
        }
        return c26169jUm.KWHzl(str, marketFavoritesGroupPo, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketFavoritesGroupPo AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26169jUm KWHzl(@NotNull java.lang.String str, @NotNull MarketFavoritesGroupPo marketFavoritesGroupPo, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(marketFavoritesGroupPo, "");
        return new C26169jUm(str, marketFavoritesGroupPo, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC26171jUo
    public boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26169jUm)) {
            return false;
        }
        C26169jUm c26169jUm = (C26169jUm) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c26169jUm.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c26169jUm.copydefault) && this.EZpvd == c26169jUm.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarketFavoritesAddToGroupVo(title=" + this.OLrzqt + ", rawGroupPo=" + this.copydefault + ", isSelected=" + this.EZpvd + ")";
    }

    public C26169jUm(@NotNull java.lang.String str, @NotNull MarketFavoritesGroupPo marketFavoritesGroupPo, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(marketFavoritesGroupPo, "");
        this.OLrzqt = str;
        this.copydefault = marketFavoritesGroupPo;
        this.EZpvd = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.lang.String, com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo, boolean):void (m)] (LINE:6) call: o.jUm.<init>(java.lang.String, com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo, boolean):void type: THIS */
    public /* synthetic */ C26169jUm(java.lang.String str, MarketFavoritesGroupPo marketFavoritesGroupPo, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, marketFavoritesGroupPo, (i & 4) != 0 ? false : z);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C26169jUm) && Intrinsics.EZpvd(this.copydefault, ((C26169jUm) interfaceC40516qYt).copydefault);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        if (interfaceC40516qYt instanceof C26169jUm) {
            C26169jUm c26169jUm = (C26169jUm) interfaceC40516qYt;
            if (Intrinsics.EZpvd(this.copydefault, c26169jUm.copydefault) && OLrzqt() == c26169jUm.OLrzqt()) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC26171jUo
    public InterfaceC26171jUo KWHzl(boolean z) {
        copydefault(z);
        return this;
    }
}
