package o;

import com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment;
import com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragmentV2$executeSubscribeData$1;
import com.okinc.market.discover.features.markets.sub.futures.viewmodel.MarketDiscoverFuturesGroupViewModel;
import com.okinc.market.discover.features.markets.sub.futures.viewmodel.MarketDiscoverFuturesListViewModel;
import com.okinc.market.quotation.ui.AbsQuotationFragment;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qcW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40679qcW extends MarketDiscoverFuturesListFragment {
    @Override // com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C42708rbX c42708rbXValueOf;
        C41382qpk c41382qpk;
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        if (Intrinsics.EZpvd(AhwBna(), CategoryGroupVo.Companion.KWHzl()) || (c42708rbXValueOf = valueOf()) == null || (c41382qpk = c42708rbXValueOf.AEQbTJ) == null) {
            return;
        }
        c41382qpk.OLrzqt();
    }

    @Override // com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment
    public boolean fetchVPNInfo() {
        return !Intrinsics.EZpvd(AhwBna(), CategoryGroupVo.Companion.KWHzl());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment, com.okinc.market.quotation.ui.AbsQuotationFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull AbsQuotationFragment.SubscribeType subscribeType, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketDiscoverFuturesListFragmentV2$executeSubscribeData$1 marketDiscoverFuturesListFragmentV2$executeSubscribeData$1;
        C40679qcW c40679qcW;
        C41467qrP c41467qrP;
        C40679qcW c40679qcW2;
        Triple triple;
        CategoryGroupVo categoryGroupVoAhwBna;
        MarketDiscoverFuturesListViewModel marketDiscoverFuturesListViewModelValues;
        kotlin.Pair<SortBy, SortOrder> pairIsConnected;
        if (continuation instanceof MarketDiscoverFuturesListFragmentV2$executeSubscribeData$1) {
            marketDiscoverFuturesListFragmentV2$executeSubscribeData$1 = (MarketDiscoverFuturesListFragmentV2$executeSubscribeData$1) continuation;
            int i = marketDiscoverFuturesListFragmentV2$executeSubscribeData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDiscoverFuturesListFragmentV2$executeSubscribeData$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDiscoverFuturesListFragmentV2$executeSubscribeData$1 = new MarketDiscoverFuturesListFragmentV2$executeSubscribeData$1(this, continuation);
            }
        }
        MarketDiscoverFuturesListFragmentV2$executeSubscribeData$1 marketDiscoverFuturesListFragmentV2$executeSubscribeData$12 = marketDiscoverFuturesListFragmentV2$executeSubscribeData$1;
        java.lang.Object objCopydefault = marketDiscoverFuturesListFragmentV2$executeSubscribeData$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = marketDiscoverFuturesListFragmentV2$executeSubscribeData$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            MarketDiscoverFuturesGroupViewModel marketDiscoverFuturesGroupViewModelDbNXlk = DbNXlk();
            marketDiscoverFuturesListFragmentV2$executeSubscribeData$12.L$0 = this;
            marketDiscoverFuturesListFragmentV2$executeSubscribeData$12.label = 1;
            objCopydefault = marketDiscoverFuturesGroupViewModelDbNXlk.copydefault(marketDiscoverFuturesListFragmentV2$executeSubscribeData$12);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c40679qcW = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objCopydefault);
                    return Unit.INSTANCE;
                }
                C41467qrP c41467qrP2 = (C41467qrP) marketDiscoverFuturesListFragmentV2$executeSubscribeData$12.L$1;
                c40679qcW2 = (C40679qcW) marketDiscoverFuturesListFragmentV2$executeSubscribeData$12.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                c41467qrP = c41467qrP2;
                triple = (Triple) objCopydefault;
                categoryGroupVoAhwBna = !Intrinsics.EZpvd(c40679qcW2.AhwBna(), CategoryGroupVo.Companion.KWHzl()) ? triple != null ? (CategoryGroupVo) triple.getThird() : null : c40679qcW2.AhwBna();
                C41298qoF c41298qoF = C41298qoF.AEQbTJ;
                java.lang.String tag = c40679qcW2.getTAG();
                java.lang.String strAhwBna = categoryGroupVoAhwBna == null ? categoryGroupVoAhwBna.AhwBna() : null;
                c41298qoF.EZpvd(tag, "executeSubscribeData, categoryGroup = " + strAhwBna + ", filter = " + triple + ", sorter = " + c40679qcW2.isConnected());
                marketDiscoverFuturesListViewModelValues = c40679qcW2.values();
                if (categoryGroupVoAhwBna == null) {
                    categoryGroupVoAhwBna = c40679qcW2.AhwBna();
                }
                pairIsConnected = c40679qcW2.isConnected();
                marketDiscoverFuturesListFragmentV2$executeSubscribeData$12.L$0 = null;
                marketDiscoverFuturesListFragmentV2$executeSubscribeData$12.L$1 = null;
                marketDiscoverFuturesListFragmentV2$executeSubscribeData$12.label = 3;
                if (MarketDiscoverFuturesListViewModel.subscribeData$default(marketDiscoverFuturesListViewModelValues, categoryGroupVoAhwBna, pairIsConnected, triple, c41467qrP, null, marketDiscoverFuturesListFragmentV2$executeSubscribeData$12, 16, null) == objCopydefault2) {
                    return objCopydefault2;
                }
                return Unit.INSTANCE;
            }
            c40679qcW = (C40679qcW) marketDiscoverFuturesListFragmentV2$executeSubscribeData$12.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        C41467qrP c41467qrP3 = (C41467qrP) objCopydefault;
        MarketDiscoverFuturesGroupViewModel marketDiscoverFuturesGroupViewModelDbNXlk2 = c40679qcW.DbNXlk();
        marketDiscoverFuturesListFragmentV2$executeSubscribeData$12.L$0 = c40679qcW;
        marketDiscoverFuturesListFragmentV2$executeSubscribeData$12.L$1 = c41467qrP3;
        marketDiscoverFuturesListFragmentV2$executeSubscribeData$12.label = 2;
        java.lang.Object objAEQbTJ = marketDiscoverFuturesGroupViewModelDbNXlk2.AEQbTJ(marketDiscoverFuturesListFragmentV2$executeSubscribeData$12);
        if (objAEQbTJ == objCopydefault2) {
            return objCopydefault2;
        }
        c41467qrP = c41467qrP3;
        objCopydefault = objAEQbTJ;
        c40679qcW2 = c40679qcW;
        triple = (Triple) objCopydefault;
        if (!Intrinsics.EZpvd(c40679qcW2.AhwBna(), CategoryGroupVo.Companion.KWHzl())) {
        }
        C41298qoF c41298qoF2 = C41298qoF.AEQbTJ;
        java.lang.String tag2 = c40679qcW2.getTAG();
        if (categoryGroupVoAhwBna == null) {
        }
        c41298qoF2.EZpvd(tag2, "executeSubscribeData, categoryGroup = " + strAhwBna + ", filter = " + triple + ", sorter = " + c40679qcW2.isConnected());
        marketDiscoverFuturesListViewModelValues = c40679qcW2.values();
        if (categoryGroupVoAhwBna == null) {
        }
        pairIsConnected = c40679qcW2.isConnected();
        marketDiscoverFuturesListFragmentV2$executeSubscribeData$12.L$0 = null;
        marketDiscoverFuturesListFragmentV2$executeSubscribeData$12.L$1 = null;
        marketDiscoverFuturesListFragmentV2$executeSubscribeData$12.label = 3;
        if (MarketDiscoverFuturesListViewModel.subscribeData$default(marketDiscoverFuturesListViewModelValues, categoryGroupVoAhwBna, pairIsConnected, triple, c41467qrP, null, marketDiscoverFuturesListFragmentV2$executeSubscribeData$12, 16, null) == objCopydefault2) {
        }
        return Unit.INSTANCE;
    }
}
