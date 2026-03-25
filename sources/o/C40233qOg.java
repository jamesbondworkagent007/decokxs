package o;

import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.quotation.ui.model.OptionsCategoryGroupVo;
import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qOg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40233qOg {
    public final Flow<C40244qOr> AEQbTJ;
    public final Quintet<java.lang.String, Quartet<java.lang.String, java.util.List<InterfaceC41641que>, java.util.List<CategoryGroupVo>, java.util.List<ChargeGroupVo>>, kotlin.Pair<java.lang.String, C41467qrP>, Triple<java.lang.String, java.util.Map<OptionsCategoryGroupVo, java.util.Map<java.lang.String, java.util.List<InterfaceC41642quf>>>, java.lang.Integer>, Triple<java.lang.String, java.util.List<DexChainGroupVo>, java.util.List<InterfaceC41655qus>>> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qOg */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C40233qOg copy$default(C40233qOg c40233qOg, Quintet quintet, Flow flow, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            quintet = c40233qOg.OLrzqt;
        }
        if ((i & 2) != 0) {
            flow = c40233qOg.AEQbTJ;
        }
        return c40233qOg.copydefault(quintet, flow);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<C40244qOr> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Quintet<java.lang.String, Quartet<java.lang.String, java.util.List<InterfaceC41641que>, java.util.List<CategoryGroupVo>, java.util.List<ChargeGroupVo>>, kotlin.Pair<java.lang.String, C41467qrP>, Triple<java.lang.String, java.util.Map<OptionsCategoryGroupVo, java.util.Map<java.lang.String, java.util.List<InterfaceC41642quf>>>, java.lang.Integer>, Triple<java.lang.String, java.util.List<DexChainGroupVo>, java.util.List<InterfaceC41655qus>>> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40233qOg copydefault(@NotNull Quintet<java.lang.String, ? extends Quartet<java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>>, kotlin.Pair<java.lang.String, C41467qrP>, ? extends Triple<java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, java.lang.Integer>, ? extends Triple<java.lang.String, ? extends java.util.List<DexChainGroupVo>, ? extends java.util.List<? extends InterfaceC41655qus>>> quintet, @NotNull Flow<C40244qOr> flow) {
        Intrinsics.checkNotNullParameter(quintet, "");
        Intrinsics.checkNotNullParameter(flow, "");
        return new C40233qOg(quintet, flow);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40233qOg)) {
            return false;
        }
        C40233qOg c40233qOg = (C40233qOg) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c40233qOg.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c40233qOg.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SubscribeNavSearchResultPayload(navSearchResult=" + this.OLrzqt + ", displayingListConfig=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.okinc.trade.arch.util.Quintet<java.lang.String, ? extends com.okinc.trade.arch.util.Quartet<java.lang.String, ? extends java.util.List<? extends o.que>, ? extends java.util.List<com.okinc.market.quotation.ui.model.CategoryGroupVo>, ? extends java.util.List<com.okinc.market.quotation.ui.model.ChargeGroupVo>>, kotlin.Pair<java.lang.String, o.qrP>, ? extends kotlin.Triple<java.lang.String, ? extends java.util.Map<com.okinc.market.quotation.ui.model.OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends o.quf>>>, java.lang.Integer>, ? extends kotlin.Triple<java.lang.String, ? extends java.util.List<com.okinc.market.quotation.ui.model.dex.DexChainGroupVo>, ? extends java.util.List<? extends o.qus>>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C40233qOg(@NotNull Quintet<java.lang.String, ? extends Quartet<java.lang.String, ? extends java.util.List<? extends InterfaceC41641que>, ? extends java.util.List<CategoryGroupVo>, ? extends java.util.List<ChargeGroupVo>>, kotlin.Pair<java.lang.String, C41467qrP>, ? extends Triple<java.lang.String, ? extends java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>, java.lang.Integer>, ? extends Triple<java.lang.String, ? extends java.util.List<DexChainGroupVo>, ? extends java.util.List<? extends InterfaceC41655qus>>> quintet, @NotNull Flow<C40244qOr> flow) {
        Intrinsics.checkNotNullParameter(quintet, "");
        Intrinsics.checkNotNullParameter(flow, "");
        this.OLrzqt = quintet;
        this.AEQbTJ = flow;
    }
}
