package o;

import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jUn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26170jUn implements InterfaceC40516qYt {
    public final MarketFavoritesGroupPo OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C26170jUn copy$default(C26170jUn c26170jUn, MarketFavoritesGroupPo marketFavoritesGroupPo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            marketFavoritesGroupPo = c26170jUn.OLrzqt;
        }
        return c26170jUn.EZpvd(marketFavoritesGroupPo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketFavoritesGroupPo AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C26170jUn EZpvd(@NotNull MarketFavoritesGroupPo marketFavoritesGroupPo) {
        Intrinsics.checkNotNullParameter(marketFavoritesGroupPo, "");
        return new C26170jUn(marketFavoritesGroupPo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26170jUn) && Intrinsics.EZpvd(this.OLrzqt, ((C26170jUn) obj).OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarketFavoritesGroupItemVo(rawPo=" + this.OLrzqt + ")";
    }

    public C26170jUn(@NotNull MarketFavoritesGroupPo marketFavoritesGroupPo) {
        Intrinsics.checkNotNullParameter(marketFavoritesGroupPo, "");
        this.OLrzqt = marketFavoritesGroupPo;
    }

    public final java.lang.String copydefault() {
        return this.OLrzqt.getGroupName();
    }

    public final java.lang.String KWHzl() {
        java.lang.String translatedGroupName = this.OLrzqt.getTranslatedGroupName();
        if (translatedGroupName != null) {
            if (translatedGroupName.length() <= 0) {
                translatedGroupName = null;
            }
            if (translatedGroupName != null) {
                return translatedGroupName;
            }
        }
        return copydefault();
    }

    public final boolean EZpvd() {
        return this.OLrzqt.isAllGroup();
    }

    public final boolean AhwBna() {
        return this.OLrzqt.isPreset();
    }

    public final boolean OLrzqt() {
        return this.OLrzqt.isHidden();
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareItems(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return (interfaceC40516qYt instanceof C26170jUn) && Intrinsics.EZpvd((java.lang.Object) ((C26170jUn) interfaceC40516qYt).OLrzqt.getGroupName(), (java.lang.Object) this.OLrzqt.getGroupName());
    }

    @Override // o.InterfaceC40516qYt
    public boolean onCompareContents(@NotNull InterfaceC40516qYt interfaceC40516qYt) {
        Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
        return Intrinsics.EZpvd(interfaceC40516qYt, this);
    }
}
