package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.market.discover.features.markets.sub.rank.spot.ui.MarketDiscoverSpotUpRankListFragment$executeSubscribeData$1;
import com.okinc.market.discover.features.markets.sub.rank.spot.ui.viewmodel.MarketSpotListUpRankViewModel;
import com.okinc.market.discover.features.markets.sub.spot.viewmodel.MarketDiscoverSpotGroupViewModel;
import com.okinc.market.discover.features.markets.sub.spot.viewmodel.MarketDiscoverSpotListViewModel;
import com.okinc.market.quotation.ui.AbsQuotationFragment;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qmX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41210qmX extends AbstractC41238qmz implements InterfaceC49363unD {
    public final InterfaceC56387yDm EZpvd;

    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment
    public boolean OLrzqt() {
        return true;
    }

    public C41210qmX() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.market.discover.features.markets.sub.rank.spot.ui.MarketDiscoverSpotUpRankListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.discover.features.markets.sub.rank.spot.ui.MarketDiscoverSpotUpRankListFragment$special$$inlined$viewModels$default$2
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketSpotListUpRankViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.discover.features.markets.sub.rank.spot.ui.MarketDiscoverSpotUpRankListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.discover.features.markets.sub.rank.spot.ui.MarketDiscoverSpotUpRankListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.discover.features.markets.sub.rank.spot.ui.MarketDiscoverSpotUpRankListFragment$special$$inlined$viewModels$default$5
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

    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment
    public MarketDiscoverSpotListViewModel EZpvd() {
        return (MarketDiscoverSpotListViewModel) this.EZpvd.getValue();
    }

    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AEQbTJ(new kotlin.Pair<>(SortBy.CHANGE, SortOrder.DESC));
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

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [49=4] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, com.okinc.market.quotation.ui.AbsQuotationFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull AbsQuotationFragment.SubscribeType subscribeType, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketDiscoverSpotUpRankListFragment$executeSubscribeData$1 marketDiscoverSpotUpRankListFragment$executeSubscribeData$1;
        C41210qmX c41210qmX;
        C41600qtq c41600qtq;
        C41210qmX c41210qmX2;
        java.lang.Object objKWHzl;
        C41600qtq c41600qtq2;
        kotlin.Pair pair;
        ChargeGroupVo chargeGroupVo;
        MarketDiscoverSpotListViewModel marketDiscoverSpotListViewModelEZpvd;
        CategoryGroupVo categoryGroupVoIsConnected;
        kotlin.Pair<SortBy, SortOrder> pairValues;
        if (continuation instanceof MarketDiscoverSpotUpRankListFragment$executeSubscribeData$1) {
            marketDiscoverSpotUpRankListFragment$executeSubscribeData$1 = (MarketDiscoverSpotUpRankListFragment$executeSubscribeData$1) continuation;
            int i = marketDiscoverSpotUpRankListFragment$executeSubscribeData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDiscoverSpotUpRankListFragment$executeSubscribeData$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDiscoverSpotUpRankListFragment$executeSubscribeData$1 = new MarketDiscoverSpotUpRankListFragment$executeSubscribeData$1(this, continuation);
            }
        }
        MarketDiscoverSpotUpRankListFragment$executeSubscribeData$1 marketDiscoverSpotUpRankListFragment$executeSubscribeData$12 = marketDiscoverSpotUpRankListFragment$executeSubscribeData$1;
        java.lang.Object objOLrzqt = marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            MarketDiscoverSpotGroupViewModel marketDiscoverSpotGroupViewModelFIwbmz = fIwbmz();
            marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.L$0 = this;
            marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.label = 1;
            objOLrzqt = marketDiscoverSpotGroupViewModelFIwbmz.OLrzqt(marketDiscoverSpotUpRankListFragment$executeSubscribeData$12);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c41210qmX = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(objOLrzqt);
                        return Unit.INSTANCE;
                    }
                    pair = (kotlin.Pair) marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.L$2;
                    C41600qtq c41600qtq3 = (C41600qtq) marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.L$1;
                    c41210qmX2 = (C41210qmX) marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.L$0;
                    C56391yDq.AEQbTJ(objOLrzqt);
                    c41600qtq2 = c41600qtq3;
                    chargeGroupVo = (ChargeGroupVo) objOLrzqt;
                    C41298qoF c41298qoF = C41298qoF.AEQbTJ;
                    java.lang.String tag = c41210qmX2.getTAG();
                    CategoryGroupVo categoryGroupVoIsConnected2 = c41210qmX2.isConnected();
                    c41298qoF.EZpvd(tag, "executeSubscribeData, categoryGroup = " + (categoryGroupVoIsConnected2 == null ? categoryGroupVoIsConnected2.AhwBna() : null) + ", filter = " + pair + ", period = 1D (fixed)");
                    marketDiscoverSpotListViewModelEZpvd = c41210qmX2.EZpvd();
                    categoryGroupVoIsConnected = c41210qmX2.isConnected();
                    pairValues = c41210qmX2.values();
                    marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.L$0 = null;
                    marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.L$1 = null;
                    marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.L$2 = null;
                    marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.label = 4;
                    if (MarketDiscoverSpotListViewModel.subscribeData$OKMarket_market_impl$default(marketDiscoverSpotListViewModelEZpvd, categoryGroupVoIsConnected, chargeGroupVo, pairValues, c41600qtq2, null, marketDiscoverSpotUpRankListFragment$executeSubscribeData$12, 16, null) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                c41600qtq = (C41600qtq) marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.L$1;
                c41210qmX2 = (C41210qmX) marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                kotlin.Pair pair2 = (kotlin.Pair) objOLrzqt;
                MarketDiscoverSpotGroupViewModel marketDiscoverSpotGroupViewModelFIwbmz2 = c41210qmX2.fIwbmz();
                CategoryGroupVo categoryGroupVoIsConnected3 = c41210qmX2.isConnected();
                marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.L$0 = c41210qmX2;
                marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.L$1 = c41600qtq;
                marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.L$2 = pair2;
                marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.label = 3;
                objKWHzl = marketDiscoverSpotGroupViewModelFIwbmz2.KWHzl(categoryGroupVoIsConnected3, marketDiscoverSpotUpRankListFragment$executeSubscribeData$12);
                if (objKWHzl != objCopydefault) {
                    return objCopydefault;
                }
                c41600qtq2 = c41600qtq;
                pair = pair2;
                objOLrzqt = objKWHzl;
                chargeGroupVo = (ChargeGroupVo) objOLrzqt;
                C41298qoF c41298qoF2 = C41298qoF.AEQbTJ;
                java.lang.String tag2 = c41210qmX2.getTAG();
                CategoryGroupVo categoryGroupVoIsConnected22 = c41210qmX2.isConnected();
                if (categoryGroupVoIsConnected22 == null) {
                }
                c41298qoF2.EZpvd(tag2, "executeSubscribeData, categoryGroup = " + (categoryGroupVoIsConnected22 == null ? categoryGroupVoIsConnected22.AhwBna() : null) + ", filter = " + pair + ", period = 1D (fixed)");
                marketDiscoverSpotListViewModelEZpvd = c41210qmX2.EZpvd();
                categoryGroupVoIsConnected = c41210qmX2.isConnected();
                pairValues = c41210qmX2.values();
                marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.L$0 = null;
                marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.L$1 = null;
                marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.L$2 = null;
                marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.label = 4;
                if (MarketDiscoverSpotListViewModel.subscribeData$OKMarket_market_impl$default(marketDiscoverSpotListViewModelEZpvd, categoryGroupVoIsConnected, chargeGroupVo, pairValues, c41600qtq2, null, marketDiscoverSpotUpRankListFragment$executeSubscribeData$12, 16, null) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            c41210qmX = (C41210qmX) marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        C41600qtq c41600qtq4 = (C41600qtq) objOLrzqt;
        MarketDiscoverSpotGroupViewModel marketDiscoverSpotGroupViewModelFIwbmz3 = c41210qmX.fIwbmz();
        marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.L$0 = c41210qmX;
        marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.L$1 = c41600qtq4;
        marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.label = 2;
        java.lang.Object objAEQbTJ = marketDiscoverSpotGroupViewModelFIwbmz3.AEQbTJ(marketDiscoverSpotUpRankListFragment$executeSubscribeData$12);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        C41210qmX c41210qmX3 = c41210qmX;
        c41600qtq = c41600qtq4;
        objOLrzqt = objAEQbTJ;
        c41210qmX2 = c41210qmX3;
        kotlin.Pair pair22 = (kotlin.Pair) objOLrzqt;
        MarketDiscoverSpotGroupViewModel marketDiscoverSpotGroupViewModelFIwbmz22 = c41210qmX2.fIwbmz();
        CategoryGroupVo categoryGroupVoIsConnected32 = c41210qmX2.isConnected();
        marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.L$0 = c41210qmX2;
        marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.L$1 = c41600qtq;
        marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.L$2 = pair22;
        marketDiscoverSpotUpRankListFragment$executeSubscribeData$12.label = 3;
        objKWHzl = marketDiscoverSpotGroupViewModelFIwbmz22.KWHzl(categoryGroupVoIsConnected32, marketDiscoverSpotUpRankListFragment$executeSubscribeData$12);
        if (objKWHzl != objCopydefault) {
        }
    }
}
