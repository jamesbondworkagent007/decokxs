package o;

import com.okinc.market.common.biz_spot.bean.DefiWebCoins;
import com.okinc.market.search.features.main.recommend.history.data.model.Product;
import com.okinc.market.search.features.main.result.ui.model.AnnouncementPo;
import com.okinc.market.search.features.main.result.ui.model.CampaignPo;
import com.okinc.market.search.features.main.root.data.po.P2pAndDeposit;
import com.okinc.market.search.features.main.root.data.po.SearchTrader;
import com.okinc.market.search.features.main.root.data.po.TradingStrategy;
import com.okinc.search.bean.SearchResultContentPo;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qGI {
    public final java.util.List<TradingStrategy> AEQbTJ;
    public final java.util.List<Product> AYXKKw;
    public final java.util.List<SearchTrader> AhwBna;
    public final java.util.List<AnnouncementPo> EZpvd;
    public final java.util.List<DefiWebCoins> KWHzl;
    public final SearchResultContentPo OLrzqt;
    public final java.util.List<CampaignPo> copydefault;
    public final P2pAndDeposit djBIcL;
    public final java.util.List<qGF> gEmmrt;
    public final Triple<java.util.List<C54713xSo>, java.util.List<C54713xSo>, java.util.List<C54713xSo>> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SearchTrader> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final P2pAndDeposit AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<DefiWebCoins> AhwBna() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Triple<java.util.List<C54713xSo>, java.util.List<C54713xSo>, java.util.List<C54713xSo>> EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TradingStrategy> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<qGF> OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final qGI OLrzqt(@NotNull Triple<? extends java.util.List<C54713xSo>, ? extends java.util.List<C54713xSo>, ? extends java.util.List<C54713xSo>> triple, java.util.List<Product> list, java.util.List<SearchTrader> list2, java.util.List<TradingStrategy> list3, java.util.List<DefiWebCoins> list4, P2pAndDeposit p2pAndDeposit, java.util.List<CampaignPo> list5, java.util.List<AnnouncementPo> list6, SearchResultContentPo searchResultContentPo, java.util.List<qGF> list7) {
        Intrinsics.checkNotNullParameter(triple, "");
        return new qGI(triple, list, list2, list3, list4, p2pAndDeposit, list5, list6, searchResultContentPo, list7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<Product> copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchResultContentPo djBIcL() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qGI)) {
            return false;
        }
        qGI qgi = (qGI) obj;
        return Intrinsics.EZpvd(this.valueOf, qgi.valueOf) && Intrinsics.EZpvd(this.AYXKKw, qgi.AYXKKw) && Intrinsics.EZpvd(this.AhwBna, qgi.AhwBna) && Intrinsics.EZpvd(this.AEQbTJ, qgi.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, qgi.KWHzl) && Intrinsics.EZpvd(this.djBIcL, qgi.djBIcL) && Intrinsics.EZpvd(this.copydefault, qgi.copydefault) && Intrinsics.EZpvd(this.EZpvd, qgi.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, qgi.OLrzqt) && Intrinsics.EZpvd(this.gEmmrt, qgi.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AnnouncementPo> gEmmrt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.valueOf.hashCode();
        java.util.List<Product> list = this.AYXKKw;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        java.util.List<SearchTrader> list2 = this.AhwBna;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        java.util.List<TradingStrategy> list3 = this.AEQbTJ;
        int iHashCode4 = list3 == null ? 0 : list3.hashCode();
        java.util.List<DefiWebCoins> list4 = this.KWHzl;
        int iHashCode5 = list4 == null ? 0 : list4.hashCode();
        P2pAndDeposit p2pAndDeposit = this.djBIcL;
        int iHashCode6 = p2pAndDeposit == null ? 0 : p2pAndDeposit.hashCode();
        java.util.List<CampaignPo> list5 = this.copydefault;
        int iHashCode7 = list5 == null ? 0 : list5.hashCode();
        java.util.List<AnnouncementPo> list6 = this.EZpvd;
        int iHashCode8 = list6 == null ? 0 : list6.hashCode();
        SearchResultContentPo searchResultContentPo = this.OLrzqt;
        int iHashCode9 = searchResultContentPo == null ? 0 : searchResultContentPo.hashCode();
        java.util.List<qGF> list7 = this.gEmmrt;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (list7 != null ? list7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AggregateSearchResult(instruments=" + this.valueOf + ", products=" + this.AYXKKw + ", traders=" + this.AhwBna + ", bots=" + this.AEQbTJ + ", defiCoins=" + this.KWHzl + ", p2pDeposit=" + this.djBIcL + ", campaign=" + this.copydefault + ", announcement=" + this.EZpvd + ", contentPo=" + this.OLrzqt + ", imChats=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<CampaignPo> valueOf() {
        return this.copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.Triple<? extends java.util.List<o.xSo>, ? extends java.util.List<o.xSo>, ? extends java.util.List<o.xSo>> */
    /* JADX WARN: Multi-variable type inference failed */
    public qGI(@NotNull Triple<? extends java.util.List<C54713xSo>, ? extends java.util.List<C54713xSo>, ? extends java.util.List<C54713xSo>> triple, java.util.List<Product> list, java.util.List<SearchTrader> list2, java.util.List<TradingStrategy> list3, java.util.List<DefiWebCoins> list4, P2pAndDeposit p2pAndDeposit, java.util.List<CampaignPo> list5, java.util.List<AnnouncementPo> list6, SearchResultContentPo searchResultContentPo, java.util.List<qGF> list7) {
        Intrinsics.checkNotNullParameter(triple, "");
        this.valueOf = triple;
        this.AYXKKw = list;
        this.AhwBna = list2;
        this.AEQbTJ = list3;
        this.KWHzl = list4;
        this.djBIcL = p2pAndDeposit;
        this.copydefault = list5;
        this.EZpvd = list6;
        this.OLrzqt = searchResultContentPo;
        this.gEmmrt = list7;
    }
}
