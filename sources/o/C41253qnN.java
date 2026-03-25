package o;

import com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment;
import com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragmentV2$executeSubscribeData$1;
import com.okinc.market.discover.features.markets.sub.spot.viewmodel.MarketDiscoverSpotGroupViewModel;
import com.okinc.market.discover.features.markets.sub.spot.viewmodel.MarketDiscoverSpotListViewModel;
import com.okinc.market.quotation.ui.AbsQuotationFragment;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qnN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41253qnN extends MarketDiscoverSpotListFragment {
    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C42767rcd c42767rcdAhwBna;
        C41382qpk c41382qpk;
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        if (Intrinsics.EZpvd(isConnected(), CategoryGroupVo.Companion.KWHzl()) || (c42767rcdAhwBna = AhwBna()) == null || (c41382qpk = c42767rcdAhwBna.KWHzl) == null) {
            return;
        }
        c41382qpk.OLrzqt();
    }

    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment
    public boolean OLrzqt() {
        return !Intrinsics.EZpvd(isConnected(), CategoryGroupVo.Companion.KWHzl());
    }

    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment
    public boolean copydefault(@NotNull ChargeGroupVo chargeGroupVo) {
        Intrinsics.checkNotNullParameter(chargeGroupVo, "");
        return !Intrinsics.EZpvd(chargeGroupVo, ChargeGroupVo.Companion.KWHzl());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, com.okinc.market.quotation.ui.AbsQuotationFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull AbsQuotationFragment.SubscribeType subscribeType, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketDiscoverSpotListFragmentV2$executeSubscribeData$1 marketDiscoverSpotListFragmentV2$executeSubscribeData$1;
        C41253qnN c41253qnN;
        C41600qtq c41600qtq;
        C41253qnN c41253qnN2;
        CategoryGroupVo categoryGroupVoIsConnected;
        MarketDiscoverSpotListViewModel marketDiscoverSpotListViewModelEZpvd;
        CategoryGroupVo categoryGroupVo;
        ChargeGroupVo chargeGroupVo;
        kotlin.Pair<SortBy, SortOrder> pairValues;
        if (continuation instanceof MarketDiscoverSpotListFragmentV2$executeSubscribeData$1) {
            marketDiscoverSpotListFragmentV2$executeSubscribeData$1 = (MarketDiscoverSpotListFragmentV2$executeSubscribeData$1) continuation;
            int i = marketDiscoverSpotListFragmentV2$executeSubscribeData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDiscoverSpotListFragmentV2$executeSubscribeData$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDiscoverSpotListFragmentV2$executeSubscribeData$1 = new MarketDiscoverSpotListFragmentV2$executeSubscribeData$1(this, continuation);
            }
        }
        MarketDiscoverSpotListFragmentV2$executeSubscribeData$1 marketDiscoverSpotListFragmentV2$executeSubscribeData$12 = marketDiscoverSpotListFragmentV2$executeSubscribeData$1;
        java.lang.Object objEZpvd = marketDiscoverSpotListFragmentV2$executeSubscribeData$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDiscoverSpotListFragmentV2$executeSubscribeData$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            MarketDiscoverSpotGroupViewModel marketDiscoverSpotGroupViewModelFIwbmz = fIwbmz();
            marketDiscoverSpotListFragmentV2$executeSubscribeData$12.L$0 = this;
            marketDiscoverSpotListFragmentV2$executeSubscribeData$12.label = 1;
            objEZpvd = marketDiscoverSpotGroupViewModelFIwbmz.EZpvd(marketDiscoverSpotListFragmentV2$executeSubscribeData$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41253qnN = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objEZpvd);
                    return Unit.INSTANCE;
                }
                C41600qtq c41600qtq2 = (C41600qtq) marketDiscoverSpotListFragmentV2$executeSubscribeData$12.L$1;
                c41253qnN2 = (C41253qnN) marketDiscoverSpotListFragmentV2$executeSubscribeData$12.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                c41600qtq = c41600qtq2;
                kotlin.Pair pair = (kotlin.Pair) objEZpvd;
                categoryGroupVoIsConnected = !Intrinsics.EZpvd(c41253qnN2.isConnected(), CategoryGroupVo.Companion.KWHzl()) ? pair != null ? (CategoryGroupVo) pair.getSecond() : null : c41253qnN2.isConnected();
                C41298qoF c41298qoF = C41298qoF.AEQbTJ;
                java.lang.String tag = c41253qnN2.getTAG();
                java.lang.String strAhwBna = categoryGroupVoIsConnected == null ? categoryGroupVoIsConnected.AhwBna() : null;
                c41298qoF.EZpvd(tag, "executeSubscribeData, categoryGroup = " + strAhwBna + ", filter = " + pair + ", sorter = " + c41253qnN2.values());
                marketDiscoverSpotListViewModelEZpvd = c41253qnN2.EZpvd();
                if (categoryGroupVoIsConnected == null) {
                    categoryGroupVoIsConnected = c41253qnN2.isConnected();
                }
                categoryGroupVo = categoryGroupVoIsConnected;
                chargeGroupVo = pair == null ? (ChargeGroupVo) pair.getFirst() : null;
                pairValues = c41253qnN2.values();
                marketDiscoverSpotListFragmentV2$executeSubscribeData$12.L$0 = null;
                marketDiscoverSpotListFragmentV2$executeSubscribeData$12.L$1 = null;
                marketDiscoverSpotListFragmentV2$executeSubscribeData$12.label = 3;
                if (MarketDiscoverSpotListViewModel.subscribeData$OKMarket_market_impl$default(marketDiscoverSpotListViewModelEZpvd, categoryGroupVo, chargeGroupVo, pairValues, c41600qtq, null, marketDiscoverSpotListFragmentV2$executeSubscribeData$12, 16, null) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            c41253qnN = (C41253qnN) marketDiscoverSpotListFragmentV2$executeSubscribeData$12.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        C41600qtq c41600qtq3 = (C41600qtq) objEZpvd;
        MarketDiscoverSpotGroupViewModel marketDiscoverSpotGroupViewModelFIwbmz2 = c41253qnN.fIwbmz();
        marketDiscoverSpotListFragmentV2$executeSubscribeData$12.L$0 = c41253qnN;
        marketDiscoverSpotListFragmentV2$executeSubscribeData$12.L$1 = c41600qtq3;
        marketDiscoverSpotListFragmentV2$executeSubscribeData$12.label = 2;
        java.lang.Object objAEQbTJ = marketDiscoverSpotGroupViewModelFIwbmz2.AEQbTJ(marketDiscoverSpotListFragmentV2$executeSubscribeData$12);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        c41600qtq = c41600qtq3;
        objEZpvd = objAEQbTJ;
        c41253qnN2 = c41253qnN;
        kotlin.Pair pair2 = (kotlin.Pair) objEZpvd;
        if (!Intrinsics.EZpvd(c41253qnN2.isConnected(), CategoryGroupVo.Companion.KWHzl())) {
        }
        C41298qoF c41298qoF2 = C41298qoF.AEQbTJ;
        java.lang.String tag2 = c41253qnN2.getTAG();
        if (categoryGroupVoIsConnected == null) {
        }
        c41298qoF2.EZpvd(tag2, "executeSubscribeData, categoryGroup = " + strAhwBna + ", filter = " + pair2 + ", sorter = " + c41253qnN2.values());
        marketDiscoverSpotListViewModelEZpvd = c41253qnN2.EZpvd();
        if (categoryGroupVoIsConnected == null) {
        }
        categoryGroupVo = categoryGroupVoIsConnected;
        if (pair2 == null) {
        }
        pairValues = c41253qnN2.values();
        marketDiscoverSpotListFragmentV2$executeSubscribeData$12.L$0 = null;
        marketDiscoverSpotListFragmentV2$executeSubscribeData$12.L$1 = null;
        marketDiscoverSpotListFragmentV2$executeSubscribeData$12.label = 3;
        if (MarketDiscoverSpotListViewModel.subscribeData$OKMarket_market_impl$default(marketDiscoverSpotListViewModelEZpvd, categoryGroupVo, chargeGroupVo, pairValues, c41600qtq, null, marketDiscoverSpotListFragmentV2$executeSubscribeData$12, 16, null) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
