package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.market.discover.features.markets.sub.rank.spot.ui.MarketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$1;
import com.okinc.market.discover.features.markets.sub.rank.spot.ui.viewmodel.MarketSpotListDownRankViewModelWithPeriod;
import com.okinc.market.discover.features.markets.sub.spot.viewmodel.MarketDiscoverSpotGroupViewModel;
import com.okinc.market.quotation.ui.AbsQuotationFragment;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qmI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41195qmI extends AbstractC41235qmw implements InterfaceC49363unD {
    public final InterfaceC56387yDm AEQbTJ;

    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment
    public boolean OLrzqt() {
        return true;
    }

    public C41195qmI() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.market.discover.features.markets.sub.rank.spot.ui.MarketDiscoverSpotDownRankListFragmentWithPeriod$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.discover.features.markets.sub.rank.spot.ui.MarketDiscoverSpotDownRankListFragmentWithPeriod$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketSpotListDownRankViewModelWithPeriod.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.discover.features.markets.sub.rank.spot.ui.MarketDiscoverSpotDownRankListFragmentWithPeriod$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.discover.features.markets.sub.rank.spot.ui.MarketDiscoverSpotDownRankListFragmentWithPeriod$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.discover.features.markets.sub.rank.spot.ui.MarketDiscoverSpotDownRankListFragmentWithPeriod$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd()Lcom/okinc/market/discover/features/markets/sub/spot/viewmodel/MarketDiscoverSpotListViewModel; */
    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Lcom/okinc/market/discover/features/markets/sub/spot/viewmodel/MarketDiscoverSpotListViewModelWithPeriod; */
    /* JADX DEBUG: Possible override for method com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment.AEQbTJ()V */
    /* JADX DEBUG: Possible override for method o.qmw.AEQbTJ()V */
    /* JADX DEBUG: Possible override for method o.qnu.AEQbTJ()V */
    /* JADX DEBUG: Possible override for method o.qnv.AEQbTJ()V */
    @Override // o.C41255qnP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public MarketSpotListDownRankViewModelWithPeriod EZpvd() {
        return (MarketSpotListDownRankViewModelWithPeriod) this.AEQbTJ.getValue();
    }

    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AEQbTJ(new kotlin.Pair<>(SortBy.CHANGE, SortOrder.ASC));
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
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [42=5] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0131 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.C41255qnP, com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, com.okinc.market.quotation.ui.AbsQuotationFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull AbsQuotationFragment.SubscribeType subscribeType, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$1 marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$1;
        C41195qmI c41195qmI;
        C41600qtq c41600qtq;
        C41195qmI c41195qmI2;
        java.lang.Object objKWHzl;
        kotlin.Pair pair;
        C41600qtq c41600qtq2;
        java.lang.Object objKWHzl2;
        PeriodEnum periodEnum;
        C41600qtq c41600qtq3;
        kotlin.Pair pair2;
        ChargeGroupVo chargeGroupVo;
        MarketSpotListDownRankViewModelWithPeriod marketSpotListDownRankViewModelWithPeriodEZpvd;
        CategoryGroupVo categoryGroupVoIsConnected;
        kotlin.Pair<SortBy, SortOrder> pairValues;
        if (continuation instanceof MarketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$1) {
            marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$1 = (MarketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$1) continuation;
            int i = marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$1 = new MarketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$1(this, continuation);
            }
        }
        MarketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$1 marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12 = marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$1;
        java.lang.Object objOLrzqt = marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            MarketDiscoverSpotGroupViewModel marketDiscoverSpotGroupViewModelFIwbmz = fIwbmz();
            marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$0 = this;
            marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.label = 1;
            objOLrzqt = marketDiscoverSpotGroupViewModelFIwbmz.OLrzqt(marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c41195qmI = this;
        } else if (i2 == 1) {
            c41195qmI = (C41195qmI) marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(objOLrzqt);
                        return Unit.INSTANCE;
                    }
                    PeriodEnum periodEnum2 = (PeriodEnum) marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$3;
                    pair2 = (kotlin.Pair) marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$2;
                    C41600qtq c41600qtq4 = (C41600qtq) marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$1;
                    c41195qmI2 = (C41195qmI) marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$0;
                    C56391yDq.AEQbTJ(objOLrzqt);
                    periodEnum = periodEnum2;
                    c41600qtq3 = c41600qtq4;
                    chargeGroupVo = (ChargeGroupVo) objOLrzqt;
                    C41298qoF c41298qoF = C41298qoF.AEQbTJ;
                    java.lang.String tag = c41195qmI2.getTAG();
                    CategoryGroupVo categoryGroupVoIsConnected2 = c41195qmI2.isConnected();
                    c41298qoF.EZpvd(tag, "executeSubscribeData (WithPeriod), categoryGroup = " + (categoryGroupVoIsConnected2 == null ? categoryGroupVoIsConnected2.AhwBna() : null) + ", filter = " + pair2 + ", period = " + periodEnum);
                    marketSpotListDownRankViewModelWithPeriodEZpvd = c41195qmI2.EZpvd();
                    categoryGroupVoIsConnected = c41195qmI2.isConnected();
                    pairValues = c41195qmI2.values();
                    marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$0 = null;
                    marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$1 = null;
                    marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$2 = null;
                    marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$3 = null;
                    marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.label = 5;
                    if (marketSpotListDownRankViewModelWithPeriodEZpvd.EZpvd(categoryGroupVoIsConnected, chargeGroupVo, pairValues, c41600qtq3, periodEnum, marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                pair = (kotlin.Pair) marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$2;
                c41600qtq2 = (C41600qtq) marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$1;
                c41195qmI2 = (C41195qmI) marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                PeriodEnum periodEnum3 = (PeriodEnum) objOLrzqt;
                MarketDiscoverSpotGroupViewModel marketDiscoverSpotGroupViewModelFIwbmz2 = c41195qmI2.fIwbmz();
                CategoryGroupVo categoryGroupVoIsConnected3 = c41195qmI2.isConnected();
                marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$0 = c41195qmI2;
                marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$1 = c41600qtq2;
                marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$2 = pair;
                marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$3 = periodEnum3;
                marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.label = 4;
                objKWHzl2 = marketDiscoverSpotGroupViewModelFIwbmz2.KWHzl(categoryGroupVoIsConnected3, marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12);
                if (objKWHzl2 != objCopydefault) {
                    return objCopydefault;
                }
                periodEnum = periodEnum3;
                objOLrzqt = objKWHzl2;
                c41600qtq3 = c41600qtq2;
                pair2 = pair;
                chargeGroupVo = (ChargeGroupVo) objOLrzqt;
                C41298qoF c41298qoF2 = C41298qoF.AEQbTJ;
                java.lang.String tag2 = c41195qmI2.getTAG();
                CategoryGroupVo categoryGroupVoIsConnected22 = c41195qmI2.isConnected();
                if (categoryGroupVoIsConnected22 == null) {
                }
                c41298qoF2.EZpvd(tag2, "executeSubscribeData (WithPeriod), categoryGroup = " + (categoryGroupVoIsConnected22 == null ? categoryGroupVoIsConnected22.AhwBna() : null) + ", filter = " + pair2 + ", period = " + periodEnum);
                marketSpotListDownRankViewModelWithPeriodEZpvd = c41195qmI2.EZpvd();
                categoryGroupVoIsConnected = c41195qmI2.isConnected();
                pairValues = c41195qmI2.values();
                marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$0 = null;
                marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$1 = null;
                marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$2 = null;
                marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$3 = null;
                marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.label = 5;
                if (marketSpotListDownRankViewModelWithPeriodEZpvd.EZpvd(categoryGroupVoIsConnected, chargeGroupVo, pairValues, c41600qtq3, periodEnum, marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            c41600qtq = (C41600qtq) marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$1;
            c41195qmI2 = (C41195qmI) marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            kotlin.Pair pair3 = (kotlin.Pair) objOLrzqt;
            marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$0 = c41195qmI2;
            marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$1 = c41600qtq;
            marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$2 = pair3;
            marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.label = 3;
            objKWHzl = c41195qmI2.KWHzl(marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12);
            if (objKWHzl != objCopydefault) {
                return objCopydefault;
            }
            C41600qtq c41600qtq5 = c41600qtq;
            pair = pair3;
            objOLrzqt = objKWHzl;
            c41600qtq2 = c41600qtq5;
            PeriodEnum periodEnum32 = (PeriodEnum) objOLrzqt;
            MarketDiscoverSpotGroupViewModel marketDiscoverSpotGroupViewModelFIwbmz22 = c41195qmI2.fIwbmz();
            CategoryGroupVo categoryGroupVoIsConnected32 = c41195qmI2.isConnected();
            marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$0 = c41195qmI2;
            marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$1 = c41600qtq2;
            marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$2 = pair;
            marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$3 = periodEnum32;
            marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.label = 4;
            objKWHzl2 = marketDiscoverSpotGroupViewModelFIwbmz22.KWHzl(categoryGroupVoIsConnected32, marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12);
            if (objKWHzl2 != objCopydefault) {
            }
        }
        C41600qtq c41600qtq6 = (C41600qtq) objOLrzqt;
        MarketDiscoverSpotGroupViewModel marketDiscoverSpotGroupViewModelFIwbmz3 = c41195qmI.fIwbmz();
        marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$0 = c41195qmI;
        marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$1 = c41600qtq6;
        marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.label = 2;
        java.lang.Object objAEQbTJ = marketDiscoverSpotGroupViewModelFIwbmz3.AEQbTJ(marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        C41195qmI c41195qmI3 = c41195qmI;
        c41600qtq = c41600qtq6;
        objOLrzqt = objAEQbTJ;
        c41195qmI2 = c41195qmI3;
        kotlin.Pair pair32 = (kotlin.Pair) objOLrzqt;
        marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$0 = c41195qmI2;
        marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$1 = c41600qtq;
        marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.L$2 = pair32;
        marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12.label = 3;
        objKWHzl = c41195qmI2.KWHzl(marketDiscoverSpotDownRankListFragmentWithPeriod$executeSubscribeData$12);
        if (objKWHzl != objCopydefault) {
        }
    }
}
