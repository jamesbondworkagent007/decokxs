package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$1;
import com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragmentWithPeriod$setListener$2;
import com.okinc.market.discover.features.markets.sub.spot.viewmodel.MarketDiscoverSpotGroupViewModel;
import com.okinc.market.discover.features.markets.sub.spot.viewmodel.MarketDiscoverSpotListViewModelWithPeriod;
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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qnP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C41255qnP extends AbstractC41287qnv implements InterfaceC49363unD {
    public final InterfaceC56387yDm iwGUEr;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, com.okinc.market.quotation.ui.AbsQuotationFragment
    public java.lang.Object OLrzqt(@NotNull AbsQuotationFragment.SubscribeType subscribeType, @NotNull Continuation<? super Unit> continuation) {
        return KWHzl(this, subscribeType, continuation);
    }

    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment
    public boolean ejfBZ() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC41287qnv, com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, o.AbstractC41286qnu, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ android.content.Context getContext() {
        return super.getContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC41287qnv, com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, o.AbstractC41286qnu, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC41287qnv, com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, o.AbstractC41286qnu, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onAttach(android.content.Context context) {
        super.onAttach(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC41287qnv, com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, o.AbstractC41286qnu, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        return super.onGetLayoutInflater(bundle);
    }

    public C41255qnP() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragmentWithPeriod$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragmentWithPeriod$special$$inlined$viewModels$default$2
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
        this.iwGUEr = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketDiscoverSpotListViewModelWithPeriod.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragmentWithPeriod$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragmentWithPeriod$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragmentWithPeriod$special$$inlined$viewModels$default$5
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
    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public MarketDiscoverSpotListViewModelWithPeriod EZpvd() {
        return (MarketDiscoverSpotListViewModelWithPeriod) this.iwGUEr.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [31=4] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object KWHzl(C41255qnP c41255qnP, AbsQuotationFragment.SubscribeType subscribeType, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$1 marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$1;
        C41255qnP c41255qnP2;
        C41600qtq c41600qtq;
        java.lang.Object objKWHzl;
        C41600qtq c41600qtq2;
        kotlin.Pair pair;
        C41255qnP c41255qnP3;
        PeriodEnum periodEnum;
        MarketDiscoverSpotListViewModelWithPeriod marketDiscoverSpotListViewModelWithPeriodEZpvd;
        CategoryGroupVo categoryGroupVoIsConnected;
        ChargeGroupVo chargeGroupVo;
        kotlin.Pair<SortBy, SortOrder> pairValues;
        if (continuation instanceof MarketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$1) {
            marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$1 = (MarketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$1) continuation;
            int i = marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$1 = new MarketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$1(c41255qnP, continuation);
            }
        }
        MarketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$1 marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12 = marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$1;
        java.lang.Object objEZpvd = marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C41298qoF.AEQbTJ.EZpvd(c41255qnP.getTAG(), "executeSubscribeData (WithPeriod)");
            MarketDiscoverSpotGroupViewModel marketDiscoverSpotGroupViewModelFIwbmz = c41255qnP.fIwbmz();
            marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.L$0 = c41255qnP;
            marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.label = 1;
            objEZpvd = marketDiscoverSpotGroupViewModelFIwbmz.EZpvd(marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
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
                    pair = (kotlin.Pair) marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.L$2;
                    C41600qtq c41600qtq3 = (C41600qtq) marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.L$1;
                    c41255qnP3 = (C41255qnP) marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    c41600qtq2 = c41600qtq3;
                    periodEnum = (PeriodEnum) objEZpvd;
                    marketDiscoverSpotListViewModelWithPeriodEZpvd = c41255qnP3.EZpvd();
                    categoryGroupVoIsConnected = c41255qnP3.isConnected();
                    chargeGroupVo = pair == null ? (ChargeGroupVo) pair.getFirst() : null;
                    pairValues = c41255qnP3.values();
                    marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.L$0 = null;
                    marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.L$1 = null;
                    marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.L$2 = null;
                    marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.label = 4;
                    if (marketDiscoverSpotListViewModelWithPeriodEZpvd.EZpvd(categoryGroupVoIsConnected, chargeGroupVo, pairValues, c41600qtq2, periodEnum, marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                c41600qtq = (C41600qtq) marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.L$1;
                c41255qnP2 = (C41255qnP) marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                kotlin.Pair pair2 = (kotlin.Pair) objEZpvd;
                marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.L$0 = c41255qnP2;
                marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.L$1 = c41600qtq;
                marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.L$2 = pair2;
                marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.label = 3;
                objKWHzl = c41255qnP2.KWHzl(marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12);
                if (objKWHzl != objCopydefault) {
                    return objCopydefault;
                }
                c41600qtq2 = c41600qtq;
                pair = pair2;
                objEZpvd = objKWHzl;
                c41255qnP3 = c41255qnP2;
                periodEnum = (PeriodEnum) objEZpvd;
                marketDiscoverSpotListViewModelWithPeriodEZpvd = c41255qnP3.EZpvd();
                categoryGroupVoIsConnected = c41255qnP3.isConnected();
                if (pair == null) {
                }
                pairValues = c41255qnP3.values();
                marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.L$0 = null;
                marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.L$1 = null;
                marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.L$2 = null;
                marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.label = 4;
                if (marketDiscoverSpotListViewModelWithPeriodEZpvd.EZpvd(categoryGroupVoIsConnected, chargeGroupVo, pairValues, c41600qtq2, periodEnum, marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            c41255qnP = (C41255qnP) marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        C41600qtq c41600qtq4 = (C41600qtq) objEZpvd;
        MarketDiscoverSpotGroupViewModel marketDiscoverSpotGroupViewModelFIwbmz2 = c41255qnP.fIwbmz();
        marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.L$0 = c41255qnP;
        marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.L$1 = c41600qtq4;
        marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.label = 2;
        java.lang.Object objAEQbTJ = marketDiscoverSpotGroupViewModelFIwbmz2.AEQbTJ(marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        c41255qnP2 = c41255qnP;
        c41600qtq = c41600qtq4;
        objEZpvd = objAEQbTJ;
        kotlin.Pair pair22 = (kotlin.Pair) objEZpvd;
        marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.L$0 = c41255qnP2;
        marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.L$1 = c41600qtq;
        marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.L$2 = pair22;
        marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12.label = 3;
        objKWHzl = c41255qnP2.KWHzl(marketDiscoverSpotListFragmentWithPeriod$executeSubscribeData$12);
        if (objKWHzl != objCopydefault) {
        }
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super PeriodEnum> continuation) {
        return fIwbmz().KWHzl(continuation);
    }

    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment
    public void AEQbTJ(java.util.List<? extends InterfaceC40516qYt> list) {
        C41319qoa c41319qoaAYXKKw = AYXKKw();
        if (list == null) {
            list = yDY.AhwBna();
        }
        c41319qoaAYXKKw.setItems(list);
        AYXKKw().notifyDataSetChanged();
    }

    @Override // com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragment, o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        collectLatestOnLifecycle(fIwbmz(), new MutablePropertyReference1Impl() { // from class: com.okinc.market.discover.features.markets.sub.spot.MarketDiscoverSpotListFragmentWithPeriod$setListener$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketDiscoverSpotGroupViewModel.Application) obj).OLrzqt();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketDiscoverSpotGroupViewModel.Application) obj).EZpvd((PeriodEnum) obj2);
            }
        }, Lifecycle.State.CREATED, new MarketDiscoverSpotListFragmentWithPeriod$setListener$2(this, null));
    }
}
