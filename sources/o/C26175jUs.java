package o;

import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jUs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26175jUs implements InterfaceC26171jUo {
    public final boolean AEQbTJ;
    public final boolean AYXKKw;
    public final java.lang.CharSequence EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final InterfaceC55797xqi copydefault;
    public final boolean djBIcL;
    public final MarketFavoritesGroupPo.FavoritesPo gEmmrt;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C26175jUs copy$default(C26175jUs c26175jUs, java.lang.String str, java.lang.CharSequence charSequence, boolean z, java.lang.String str2, boolean z2, boolean z3, MarketFavoritesGroupPo.FavoritesPo favoritesPo, InterfaceC55797xqi interfaceC55797xqi, boolean z4, int i, java.lang.Object obj) {
        return c26175jUs.KWHzl((i & 1) != 0 ? c26175jUs.OLrzqt : str, (i & 2) != 0 ? c26175jUs.EZpvd : charSequence, (i & 4) != 0 ? c26175jUs.valueOf : z, (i & 8) != 0 ? c26175jUs.KWHzl : str2, (i & 16) != 0 ? c26175jUs.AYXKKw : z2, (i & 32) != 0 ? c26175jUs.djBIcL : z3, (i & 64) != 0 ? c26175jUs.gEmmrt : favoritesPo, (i & 128) != 0 ? c26175jUs.copydefault : interfaceC55797xqi, (i & 256) != 0 ? c26175jUs.AEQbTJ : z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketFavoritesGroupPo.FavoritesPo AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26175jUs KWHzl(@NotNull java.lang.String str, @NotNull java.lang.CharSequence charSequence, boolean z, @NotNull java.lang.String str2, boolean z2, boolean z3, @NotNull MarketFavoritesGroupPo.FavoritesPo favoritesPo, @NotNull InterfaceC55797xqi interfaceC55797xqi, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(favoritesPo, "");
        Intrinsics.checkNotNullParameter(interfaceC55797xqi, "");
        return new C26175jUs(str, charSequence, z, str2, z2, z3, favoritesPo, interfaceC55797xqi, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC26171jUo
    public boolean OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.CharSequence copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26175jUs)) {
            return false;
        }
        C26175jUs c26175jUs = (C26175jUs) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c26175jUs.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c26175jUs.EZpvd) && this.valueOf == c26175jUs.valueOf && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c26175jUs.KWHzl) && this.AYXKKw == c26175jUs.AYXKKw && this.djBIcL == c26175jUs.djBIcL && Intrinsics.EZpvd(this.gEmmrt, c26175jUs.gEmmrt) && Intrinsics.EZpvd(this.copydefault, c26175jUs.copydefault) && this.AEQbTJ == c26175jUs.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AYXKKw)) * 31) + java.lang.Boolean.hashCode(this.djBIcL)) * 31) + this.gEmmrt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        java.lang.String str = this.OLrzqt;
        java.lang.CharSequence charSequence = this.EZpvd;
        return "MarketFavoritesListItemVo(coinName=" + str + ", quoteName=" + ((java.lang.Object) charSequence) + ", showQuote=" + this.valueOf + ", leverage=" + this.KWHzl + ", showLeverage=" + this.AYXKKw + ", showPerpetualTag=" + this.djBIcL + ", rawPo=" + this.gEmmrt + ", rawInstrument=" + this.copydefault + ", isSelected=" + this.AEQbTJ + ")";
    }

    public C26175jUs(@NotNull java.lang.String str, @NotNull java.lang.CharSequence charSequence, boolean z, @NotNull java.lang.String str2, boolean z2, boolean z3, @NotNull MarketFavoritesGroupPo.FavoritesPo favoritesPo, @NotNull InterfaceC55797xqi interfaceC55797xqi, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(favoritesPo, "");
        Intrinsics.checkNotNullParameter(interfaceC55797xqi, "");
        this.OLrzqt = str;
        this.EZpvd = charSequence;
        this.valueOf = z;
        this.KWHzl = str2;
        this.AYXKKw = z2;
        this.djBIcL = z3;
        this.gEmmrt = favoritesPo;
        this.copydefault = interfaceC55797xqi;
        this.AEQbTJ = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (r13v0 java.lang.CharSequence)
  (r14v0 boolean)
  (r15v0 java.lang.String)
  (r16v0 boolean)
  (r17v0 boolean)
  (r18v0 com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo$FavoritesPo)
  (r19v0 o.xqi)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
 A[MD:(java.lang.String, java.lang.CharSequence, boolean, java.lang.String, boolean, boolean, com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo$FavoritesPo, o.xqi, boolean):void (m)] (LINE:23) call: o.jUs.<init>(java.lang.String, java.lang.CharSequence, boolean, java.lang.String, boolean, boolean, com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo$FavoritesPo, o.xqi, boolean):void type: THIS */
    public /* synthetic */ C26175jUs(java.lang.String str, java.lang.CharSequence charSequence, boolean z, java.lang.String str2, boolean z2, boolean z3, MarketFavoritesGroupPo.FavoritesPo favoritesPo, InterfaceC55797xqi interfaceC55797xqi, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, charSequence, z, str2, z2, z3, favoritesPo, interfaceC55797xqi, (i & 256) != 0 ? false : z4);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C26175jUs) && Intrinsics.EZpvd(this.copydefault, ((C26175jUs) interfaceC40516qYt).copydefault);
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C26175jUs) && OLrzqt() == ((C26175jUs) interfaceC40516qYt).OLrzqt();
    }

    @Override // o.InterfaceC26171jUo
    public InterfaceC26171jUo KWHzl(boolean z) {
        return copy$default(this, null, null, false, null, false, false, null, null, z, 255, null);
    }
}
