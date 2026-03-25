package o;

import com.okinc.market.quotation.ui.model.OptionsCategoryGroupVo;
import com.okinc.market.quotation.ui.model.OptionsDirection;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41507qsC {
    public final boolean AEQbTJ;
    public final OptionsCategoryGroupVo EZpvd;
    public final java.lang.String KWHzl;
    public final OptionsDirection OLrzqt;
    public final java.util.Map<OptionsCategoryGroupVo, java.util.Map<java.lang.String, java.util.List<InterfaceC41642quf>>> copydefault;
    public final kotlin.Pair<SortBy, SortOrder> djBIcL;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.qsC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41507qsC copy$default(C41507qsC c41507qsC, OptionsCategoryGroupVo optionsCategoryGroupVo, java.lang.String str, java.lang.String str2, OptionsDirection optionsDirection, kotlin.Pair pair, java.util.Map map, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optionsCategoryGroupVo = c41507qsC.EZpvd;
        }
        if ((i & 2) != 0) {
            str = c41507qsC.KWHzl;
        }
        java.lang.String str3 = str;
        if ((i & 4) != 0) {
            str2 = c41507qsC.gEmmrt;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            optionsDirection = c41507qsC.OLrzqt;
        }
        OptionsDirection optionsDirection2 = optionsDirection;
        if ((i & 16) != 0) {
            pair = c41507qsC.djBIcL;
        }
        kotlin.Pair pair2 = pair;
        if ((i & 32) != 0) {
            map = c41507qsC.copydefault;
        }
        java.util.Map map2 = map;
        if ((i & 64) != 0) {
            z = c41507qsC.AEQbTJ;
        }
        return c41507qsC.EZpvd(optionsCategoryGroupVo, str3, str4, optionsDirection2, pair2, map2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OptionsDirection EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41507qsC EZpvd(@NotNull OptionsCategoryGroupVo optionsCategoryGroupVo, java.lang.String str, java.lang.String str2, @NotNull OptionsDirection optionsDirection, @NotNull kotlin.Pair<? extends SortBy, ? extends SortOrder> pair, @NotNull java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>> map, boolean z) {
        Intrinsics.checkNotNullParameter(optionsCategoryGroupVo, "");
        Intrinsics.checkNotNullParameter(optionsDirection, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new C41507qsC(optionsCategoryGroupVo, str, str2, optionsDirection, pair, map, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OptionsCategoryGroupVo OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlin.Pair<SortBy, SortOrder> copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41507qsC)) {
            return false;
        }
        C41507qsC c41507qsC = (C41507qsC) obj;
        return Intrinsics.EZpvd(this.EZpvd, c41507qsC.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c41507qsC.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c41507qsC.gEmmrt) && this.OLrzqt == c41507qsC.OLrzqt && Intrinsics.EZpvd(this.djBIcL, c41507qsC.djBIcL) && Intrinsics.EZpvd(this.copydefault, c41507qsC.copydefault) && this.AEQbTJ == c41507qsC.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.gEmmrt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.OLrzqt.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<OptionsCategoryGroupVo, java.util.Map<java.lang.String, java.util.List<InterfaceC41642quf>>> valueOf() {
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.Pair<? extends com.okinc.market.quotation.ui.model.SortBy, ? extends com.okinc.market.quotation.ui.model.SortOrder> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.Map<com.okinc.market.quotation.ui.model.OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends o.quf>>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41507qsC(@NotNull OptionsCategoryGroupVo optionsCategoryGroupVo, java.lang.String str, java.lang.String str2, @NotNull OptionsDirection optionsDirection, @NotNull kotlin.Pair<? extends SortBy, ? extends SortOrder> pair, @NotNull java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>> map, boolean z) {
        Intrinsics.checkNotNullParameter(optionsCategoryGroupVo, "");
        Intrinsics.checkNotNullParameter(optionsDirection, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.EZpvd = optionsCategoryGroupVo;
        this.KWHzl = str;
        this.gEmmrt = str2;
        this.OLrzqt = optionsDirection;
        this.djBIcL = pair;
        this.copydefault = map;
        this.AEQbTJ = z;
    }

    public java.lang.String toString() {
        return "SubscribeOptionsVosPayload(category=" + this.EZpvd.AEQbTJ() + ", expTime=" + this.KWHzl + ", strikePrice=" + this.gEmmrt + ", direction=" + this.OLrzqt + ", sorter=" + this.djBIcL + ", isEnableWsTickers=" + this.AEQbTJ + ")";
    }
}
