package o;

import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.quotation.ui.model.OptionsCategoryGroupVo;
import com.okinc.trade.arch.util.Quartet;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import o.C40239qOm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qOc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40229qOc {
    public final java.util.List<InterfaceC40237qOk> AEQbTJ;
    public final kotlin.Pair<java.util.List<InterfaceC40237qOk>, C40239qOm.ActionBar.Application> EZpvd;
    public final kotlin.Pair<java.util.List<InterfaceC40237qOk>, C40239qOm.ActionBar.C0923ActionBar> KWHzl;
    public final Triple<java.lang.String, java.util.Map<OptionsCategoryGroupVo, java.util.Map<java.lang.String, java.util.List<InterfaceC41642quf>>>, java.lang.Integer> OLrzqt;
    public final kotlin.Pair<java.lang.String, C41467qrP> copydefault;
    public final Quartet<java.lang.String, java.util.List<InterfaceC41641que>, java.util.List<CategoryGroupVo>, java.util.List<ChargeGroupVo>> gEmmrt;
    public final kotlin.Pair<java.util.List<InterfaceC40237qOk>, java.lang.Boolean> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.qOc */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C40229qOc copy$default(C40229qOc c40229qOc, Quartet quartet, kotlin.Pair pair, Triple triple, kotlin.Pair pair2, kotlin.Pair pair3, kotlin.Pair pair4, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            quartet = c40229qOc.gEmmrt;
        }
        if ((i & 2) != 0) {
            pair = c40229qOc.copydefault;
        }
        kotlin.Pair pair5 = pair;
        if ((i & 4) != 0) {
            triple = c40229qOc.OLrzqt;
        }
        Triple triple2 = triple;
        if ((i & 8) != 0) {
            pair2 = c40229qOc.valueOf;
        }
        kotlin.Pair pair6 = pair2;
        if ((i & 16) != 0) {
            pair3 = c40229qOc.KWHzl;
        }
        kotlin.Pair pair7 = pair3;
        if ((i & 32) != 0) {
            pair4 = c40229qOc.EZpvd;
        }
        kotlin.Pair pair8 = pair4;
        if ((i & 64) != 0) {
            list = c40229qOc.AEQbTJ;
        }
        return c40229qOc.OLrzqt(quartet, pair5, triple2, pair6, pair7, pair8, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlin.Pair<java.util.List<InterfaceC40237qOk>, C40239qOm.ActionBar.C0923ActionBar> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlin.Pair<java.util.List<InterfaceC40237qOk>, C40239qOm.ActionBar.Application> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Triple<java.lang.String, java.util.Map<OptionsCategoryGroupVo, java.util.Map<java.lang.String, java.util.List<InterfaceC41642quf>>>, java.lang.Integer> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlin.Pair<java.util.List<InterfaceC40237qOk>, java.lang.Boolean> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40229qOc OLrzqt(Quartet<java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>> quartet, kotlin.Pair<java.lang.String, C41467qrP> pair, Triple<java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, java.lang.Integer> triple, @NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC40237qOk>, java.lang.Boolean> pair2, @NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC40237qOk>, C40239qOm.ActionBar.C0923ActionBar> pair3, @NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC40237qOk>, C40239qOm.ActionBar.Application> pair4, @NotNull java.util.List<? extends InterfaceC40237qOk> list) {
        Intrinsics.checkNotNullParameter(pair2, "");
        Intrinsics.checkNotNullParameter(pair3, "");
        Intrinsics.checkNotNullParameter(pair4, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C40229qOc(quartet, pair, triple, pair2, pair3, pair4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Quartet<java.lang.String, java.util.List<InterfaceC41641que>, java.util.List<CategoryGroupVo>, java.util.List<ChargeGroupVo>> copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC40237qOk> djBIcL() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40229qOc)) {
            return false;
        }
        C40229qOc c40229qOc = (C40229qOc) obj;
        return Intrinsics.EZpvd(this.gEmmrt, c40229qOc.gEmmrt) && Intrinsics.EZpvd(this.copydefault, c40229qOc.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c40229qOc.OLrzqt) && Intrinsics.EZpvd(this.valueOf, c40229qOc.valueOf) && Intrinsics.EZpvd(this.KWHzl, c40229qOc.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c40229qOc.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c40229qOc.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Quartet<java.lang.String, java.util.List<InterfaceC41641que>, java.util.List<CategoryGroupVo>, java.util.List<ChargeGroupVo>> quartet = this.gEmmrt;
        int iHashCode = quartet == null ? 0 : quartet.hashCode();
        kotlin.Pair<java.lang.String, C41467qrP> pair = this.copydefault;
        int iHashCode2 = pair == null ? 0 : pair.hashCode();
        Triple<java.lang.String, java.util.Map<OptionsCategoryGroupVo, java.util.Map<java.lang.String, java.util.List<InterfaceC41642quf>>>, java.lang.Integer> triple = this.OLrzqt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + (triple != null ? triple.hashCode() : 0)) * 31) + this.valueOf.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AssembleNavSearchResultPayload(searchSpotResult=" + this.gEmmrt + ", searchFuturesResult=" + this.copydefault + ", searchOptionsResult=" + this.OLrzqt + ", spotVoList=" + this.valueOf + ", futuresVoList=" + this.KWHzl + ", optionsVoList=" + this.EZpvd + ", dexVoList=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.okinc.trade.arch.util.Quartet<java.lang.String, ? extends java.util.List<? extends o.que>, ? extends java.util.List<com.okinc.market.quotation.ui.model.CategoryGroupVo>, ? extends java.util.List<com.okinc.market.quotation.ui.model.ChargeGroupVo>> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.Triple<java.lang.String, ? extends java.util.Map<com.okinc.market.quotation.ui.model.OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends o.quf>>>, java.lang.Integer> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.Pair<? extends java.util.List<? extends o.qOk>, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.Pair<? extends java.util.List<? extends o.qOk>, o.qOm$ActionBar$ActionBar> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.Pair<? extends java.util.List<? extends o.qOk>, o.qOm$ActionBar$Application> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.List<? extends o.qOk> */
    /* JADX WARN: Multi-variable type inference failed */
    public C40229qOc(Quartet<java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>> quartet, kotlin.Pair<java.lang.String, C41467qrP> pair, Triple<java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, java.lang.Integer> triple, @NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC40237qOk>, java.lang.Boolean> pair2, @NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC40237qOk>, C40239qOm.ActionBar.C0923ActionBar> pair3, @NotNull kotlin.Pair<? extends java.util.List<? extends InterfaceC40237qOk>, C40239qOm.ActionBar.Application> pair4, @NotNull java.util.List<? extends InterfaceC40237qOk> list) {
        Intrinsics.checkNotNullParameter(pair2, "");
        Intrinsics.checkNotNullParameter(pair3, "");
        Intrinsics.checkNotNullParameter(pair4, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.gEmmrt = quartet;
        this.copydefault = pair;
        this.OLrzqt = triple;
        this.valueOf = pair2;
        this.KWHzl = pair3;
        this.EZpvd = pair4;
        this.AEQbTJ = list;
    }
}
