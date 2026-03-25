package o;

import com.okinc.market.discover.features.markets.sub.rank.spot.ui.MarketDiscoverSpotNewRankListFragment$executeSubscribeData$1;
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
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qmO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41201qmO extends AbstractC41190qmD implements InterfaceC49363unD {
    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment
    public boolean OLrzqt() {
        return true;
    }

    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C41382qpk c41382qpk;
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        C42767rcd c42767rcdAhwBna = AhwBna();
        if (c42767rcdAhwBna == null || (c41382qpk = c42767rcdAhwBna.KWHzl) == null) {
            return;
        }
        c41382qpk.OLrzqt();
        c41382qpk.setSubTitle(C33070mpX.AYXKKw(qZH.PendingIntent.svY));
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [31=4] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, com.okinc.market.quotation.ui.AbsQuotationFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull AbsQuotationFragment.SubscribeType subscribeType, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketDiscoverSpotNewRankListFragment$executeSubscribeData$1 marketDiscoverSpotNewRankListFragment$executeSubscribeData$1;
        C41201qmO c41201qmO;
        C41600qtq c41600qtq;
        C41201qmO c41201qmO2;
        java.lang.Object objKWHzl;
        C41600qtq c41600qtq2;
        kotlin.Pair pair;
        ChargeGroupVo chargeGroupVo;
        MarketDiscoverSpotListViewModel marketDiscoverSpotListViewModelEZpvd;
        CategoryGroupVo categoryGroupVoIsConnected;
        kotlin.Pair<SortBy, SortOrder> pairValues;
        if (continuation instanceof MarketDiscoverSpotNewRankListFragment$executeSubscribeData$1) {
            marketDiscoverSpotNewRankListFragment$executeSubscribeData$1 = (MarketDiscoverSpotNewRankListFragment$executeSubscribeData$1) continuation;
            int i = marketDiscoverSpotNewRankListFragment$executeSubscribeData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDiscoverSpotNewRankListFragment$executeSubscribeData$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDiscoverSpotNewRankListFragment$executeSubscribeData$1 = new MarketDiscoverSpotNewRankListFragment$executeSubscribeData$1(this, continuation);
            }
        }
        MarketDiscoverSpotNewRankListFragment$executeSubscribeData$1 marketDiscoverSpotNewRankListFragment$executeSubscribeData$12 = marketDiscoverSpotNewRankListFragment$executeSubscribeData$1;
        java.lang.Object objEZpvd = marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            MarketDiscoverSpotGroupViewModel marketDiscoverSpotGroupViewModelFIwbmz = fIwbmz();
            marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.L$0 = this;
            marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.label = 1;
            objEZpvd = marketDiscoverSpotGroupViewModelFIwbmz.EZpvd(marketDiscoverSpotNewRankListFragment$executeSubscribeData$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41201qmO = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(objEZpvd);
                        return Unit.INSTANCE;
                    }
                    pair = (kotlin.Pair) marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.L$2;
                    C41600qtq c41600qtq3 = (C41600qtq) marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.L$1;
                    c41201qmO2 = (C41201qmO) marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    c41600qtq2 = c41600qtq3;
                    chargeGroupVo = (ChargeGroupVo) objEZpvd;
                    C41298qoF.AEQbTJ.EZpvd(c41201qmO2.getTAG(), "executeSubscribeData, categoryGroup = " + c41201qmO2.isConnected().AhwBna() + ", filter = " + pair + ", sorter = " + c41201qmO2.values());
                    marketDiscoverSpotListViewModelEZpvd = c41201qmO2.EZpvd();
                    categoryGroupVoIsConnected = c41201qmO2.isConnected();
                    pairValues = c41201qmO2.values();
                    marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.L$0 = null;
                    marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.L$1 = null;
                    marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.L$2 = null;
                    marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.label = 4;
                    if (MarketDiscoverSpotListViewModel.subscribeData$OKMarket_market_impl$default(marketDiscoverSpotListViewModelEZpvd, categoryGroupVoIsConnected, chargeGroupVo, pairValues, c41600qtq2, null, marketDiscoverSpotNewRankListFragment$executeSubscribeData$12, 16, null) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                c41600qtq = (C41600qtq) marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.L$1;
                c41201qmO2 = (C41201qmO) marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                kotlin.Pair pair2 = (kotlin.Pair) objEZpvd;
                MarketDiscoverSpotGroupViewModel marketDiscoverSpotGroupViewModelFIwbmz2 = c41201qmO2.fIwbmz();
                CategoryGroupVo categoryGroupVoIsConnected2 = c41201qmO2.isConnected();
                marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.L$0 = c41201qmO2;
                marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.L$1 = c41600qtq;
                marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.L$2 = pair2;
                marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.label = 3;
                objKWHzl = marketDiscoverSpotGroupViewModelFIwbmz2.KWHzl(categoryGroupVoIsConnected2, marketDiscoverSpotNewRankListFragment$executeSubscribeData$12);
                if (objKWHzl != objCopydefault) {
                    return objCopydefault;
                }
                c41600qtq2 = c41600qtq;
                pair = pair2;
                objEZpvd = objKWHzl;
                chargeGroupVo = (ChargeGroupVo) objEZpvd;
                C41298qoF.AEQbTJ.EZpvd(c41201qmO2.getTAG(), "executeSubscribeData, categoryGroup = " + c41201qmO2.isConnected().AhwBna() + ", filter = " + pair + ", sorter = " + c41201qmO2.values());
                marketDiscoverSpotListViewModelEZpvd = c41201qmO2.EZpvd();
                categoryGroupVoIsConnected = c41201qmO2.isConnected();
                pairValues = c41201qmO2.values();
                marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.L$0 = null;
                marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.L$1 = null;
                marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.L$2 = null;
                marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.label = 4;
                if (MarketDiscoverSpotListViewModel.subscribeData$OKMarket_market_impl$default(marketDiscoverSpotListViewModelEZpvd, categoryGroupVoIsConnected, chargeGroupVo, pairValues, c41600qtq2, null, marketDiscoverSpotNewRankListFragment$executeSubscribeData$12, 16, null) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            c41201qmO = (C41201qmO) marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        C41600qtq c41600qtq4 = (C41600qtq) objEZpvd;
        MarketDiscoverSpotGroupViewModel marketDiscoverSpotGroupViewModelFIwbmz3 = c41201qmO.fIwbmz();
        marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.L$0 = c41201qmO;
        marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.L$1 = c41600qtq4;
        marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.label = 2;
        java.lang.Object objAEQbTJ = marketDiscoverSpotGroupViewModelFIwbmz3.AEQbTJ(marketDiscoverSpotNewRankListFragment$executeSubscribeData$12);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        C41201qmO c41201qmO3 = c41201qmO;
        c41600qtq = c41600qtq4;
        objEZpvd = objAEQbTJ;
        c41201qmO2 = c41201qmO3;
        kotlin.Pair pair22 = (kotlin.Pair) objEZpvd;
        MarketDiscoverSpotGroupViewModel marketDiscoverSpotGroupViewModelFIwbmz22 = c41201qmO2.fIwbmz();
        CategoryGroupVo categoryGroupVoIsConnected22 = c41201qmO2.isConnected();
        marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.L$0 = c41201qmO2;
        marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.L$1 = c41600qtq;
        marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.L$2 = pair22;
        marketDiscoverSpotNewRankListFragment$executeSubscribeData$12.label = 3;
        objKWHzl = marketDiscoverSpotGroupViewModelFIwbmz22.KWHzl(categoryGroupVoIsConnected22, marketDiscoverSpotNewRankListFragment$executeSubscribeData$12);
        if (objKWHzl != objCopydefault) {
        }
    }
}
