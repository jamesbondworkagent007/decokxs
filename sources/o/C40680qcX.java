package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$1;
import com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragmentWithPeriod$setListener$2;
import com.okinc.market.discover.features.markets.sub.futures.viewmodel.MarketDiscoverFuturesGroupViewModel;
import com.okinc.market.discover.features.markets.sub.futures.viewmodel.MarketDiscoverFuturesListViewModelWithPeriod;
import com.okinc.market.quotation.ui.AbsQuotationFragment;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.FuturesTypeEnum;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qcX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C40680qcX extends AbstractC40661qcE implements InterfaceC49363unD {
    public final InterfaceC56387yDm fIwbmz;

    @Override // com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment
    public boolean AkhnZx() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment, com.okinc.market.quotation.ui.AbsQuotationFragment
    public java.lang.Object OLrzqt(@NotNull AbsQuotationFragment.SubscribeType subscribeType, @NotNull Continuation<? super Unit> continuation) {
        return EZpvd(this, subscribeType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object OLrzqt(@NotNull Continuation<? super PeriodEnum> continuation) {
        return KWHzl(this, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC40661qcE, com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment, o.AbstractC40708qcz, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ android.content.Context getContext() {
        return super.getContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC40661qcE, com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment, o.AbstractC40708qcz, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC40661qcE, com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment, o.AbstractC40708qcz, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onAttach(android.content.Context context) {
        super.onAttach(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC40661qcE, com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment, o.AbstractC40708qcz, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        return super.onGetLayoutInflater(bundle);
    }

    public C40680qcX() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragmentWithPeriod$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragmentWithPeriod$special$$inlined$viewModels$default$2
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
        this.fIwbmz = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketDiscoverFuturesListViewModelWithPeriod.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragmentWithPeriod$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragmentWithPeriod$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragmentWithPeriod$special$$inlined$viewModels$default$5
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

    /* JADX DEBUG: Method merged with bridge method: values()Lcom/okinc/market/discover/features/markets/sub/futures/viewmodel/MarketDiscoverFuturesListViewModel; */
    /* JADX DEBUG: Possible override for method com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment.fIwbmz()V */
    @Override // com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment
    /* JADX INFO: renamed from: fIwbmz */
    public MarketDiscoverFuturesListViewModelWithPeriod values() {
        return (MarketDiscoverFuturesListViewModelWithPeriod) this.fIwbmz.getValue();
    }

    public final C40740qde fARcdN() {
        RecyclerView.Adapter<?> adapterAYXKKw = AYXKKw();
        Intrinsics.copydefault(adapterAYXKKw, "");
        return (C40740qde) adapterAYXKKw;
    }

    /* JADX DEBUG: Possible override for method o.qcz.OLrzqt()V */
    @Override // com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment
    public RecyclerView.Adapter<?> OLrzqt() {
        return new C40740qde(AhwBna(), djBIcL(), gEmmrt());
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [49=4] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object EZpvd(C40680qcX c40680qcX, AbsQuotationFragment.SubscribeType subscribeType, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$1 marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$1;
        C40680qcX c40680qcX2;
        C41467qrP c41467qrP;
        java.lang.Object objOLrzqt;
        C41467qrP c41467qrP2;
        Triple<? extends FuturesTypeEnum, FuturesUnitVo, CategoryGroupVo> triple;
        C40680qcX c40680qcX3;
        MarketDiscoverFuturesListViewModelWithPeriod marketDiscoverFuturesListViewModelWithPeriodValues;
        CategoryGroupVo categoryGroupVoAhwBna;
        kotlin.Pair<SortBy, SortOrder> pairIsConnected;
        if (continuation instanceof MarketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$1) {
            marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$1 = (MarketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$1) continuation;
            int i = marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$1.label = i - Integer.MIN_VALUE;
            } else {
                marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$1 = new MarketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$1(c40680qcX, continuation);
            }
        }
        MarketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$1 marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12 = marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$1;
        java.lang.Object objCopydefault = marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C41298qoF.AEQbTJ.EZpvd(c40680qcX.getTAG(), "executeSubscribeData (WithPeriod)");
            MarketDiscoverFuturesGroupViewModel marketDiscoverFuturesGroupViewModelDbNXlk = c40680qcX.DbNXlk();
            marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.L$0 = c40680qcX;
            marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.label = 1;
            objCopydefault = marketDiscoverFuturesGroupViewModelDbNXlk.copydefault(marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(objCopydefault);
                        return Unit.INSTANCE;
                    }
                    Triple<? extends FuturesTypeEnum, FuturesUnitVo, CategoryGroupVo> triple2 = (Triple) marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.L$2;
                    C41467qrP c41467qrP3 = (C41467qrP) marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.L$1;
                    c40680qcX3 = (C40680qcX) marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    triple = triple2;
                    c41467qrP2 = c41467qrP3;
                    marketDiscoverFuturesListViewModelWithPeriodValues = c40680qcX3.values();
                    categoryGroupVoAhwBna = c40680qcX3.AhwBna();
                    pairIsConnected = c40680qcX3.isConnected();
                    marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.L$0 = null;
                    marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.L$1 = null;
                    marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.L$2 = null;
                    marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.label = 4;
                    if (marketDiscoverFuturesListViewModelWithPeriodValues.OLrzqt(categoryGroupVoAhwBna, pairIsConnected, triple, c41467qrP2, (PeriodEnum) objCopydefault, marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    return Unit.INSTANCE;
                }
                c41467qrP = (C41467qrP) marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.L$1;
                c40680qcX2 = (C40680qcX) marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                Triple<? extends FuturesTypeEnum, FuturesUnitVo, CategoryGroupVo> triple3 = (Triple) objCopydefault;
                marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.L$0 = c40680qcX2;
                marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.L$1 = c41467qrP;
                marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.L$2 = triple3;
                marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.label = 3;
                objOLrzqt = c40680qcX2.OLrzqt(marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12);
                if (objOLrzqt != objCopydefault2) {
                    return objCopydefault2;
                }
                c41467qrP2 = c41467qrP;
                triple = triple3;
                objCopydefault = objOLrzqt;
                c40680qcX3 = c40680qcX2;
                marketDiscoverFuturesListViewModelWithPeriodValues = c40680qcX3.values();
                categoryGroupVoAhwBna = c40680qcX3.AhwBna();
                pairIsConnected = c40680qcX3.isConnected();
                marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.L$0 = null;
                marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.L$1 = null;
                marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.L$2 = null;
                marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.label = 4;
                if (marketDiscoverFuturesListViewModelWithPeriodValues.OLrzqt(categoryGroupVoAhwBna, pairIsConnected, triple, c41467qrP2, (PeriodEnum) objCopydefault, marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12) == objCopydefault2) {
                }
                return Unit.INSTANCE;
            }
            c40680qcX = (C40680qcX) marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        C41467qrP c41467qrP4 = (C41467qrP) objCopydefault;
        MarketDiscoverFuturesGroupViewModel marketDiscoverFuturesGroupViewModelDbNXlk2 = c40680qcX.DbNXlk();
        marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.L$0 = c40680qcX;
        marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.L$1 = c41467qrP4;
        marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.label = 2;
        java.lang.Object objAEQbTJ = marketDiscoverFuturesGroupViewModelDbNXlk2.AEQbTJ(marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12);
        if (objAEQbTJ == objCopydefault2) {
            return objCopydefault2;
        }
        c40680qcX2 = c40680qcX;
        c41467qrP = c41467qrP4;
        objCopydefault = objAEQbTJ;
        Triple<? extends FuturesTypeEnum, FuturesUnitVo, CategoryGroupVo> triple32 = (Triple) objCopydefault;
        marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.L$0 = c40680qcX2;
        marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.L$1 = c41467qrP;
        marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.L$2 = triple32;
        marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12.label = 3;
        objOLrzqt = c40680qcX2.OLrzqt(marketDiscoverFuturesListFragmentWithPeriod$executeSubscribeData$12);
        if (objOLrzqt != objCopydefault2) {
        }
    }

    public static /* synthetic */ java.lang.Object KWHzl(C40680qcX c40680qcX, Continuation<? super PeriodEnum> continuation) {
        return c40680qcX.DbNXlk().EZpvd(continuation);
    }

    @Override // com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment
    public void EZpvd(java.util.List<? extends InterfaceC41638qub> list) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            C40740qde c40740qdeFARcdN = fARcdN();
            if (list == null) {
                list = yDY.AhwBna();
            }
            c40740qdeFARcdN.setItems(list);
            fARcdN().notifyDataSetChanged();
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ(getTAG(), "", thM7380exceptionOrNullimpl);
        }
    }

    @Override // com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment, o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        collectLatestOnLifecycle(DbNXlk(), new MutablePropertyReference1Impl() { // from class: com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragmentWithPeriod$setListener$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((MarketDiscoverFuturesGroupViewModel.Activity) obj).KWHzl();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((MarketDiscoverFuturesGroupViewModel.Activity) obj).copydefault((PeriodEnum) obj2);
            }
        }, Lifecycle.State.CREATED, new MarketDiscoverFuturesListFragmentWithPeriod$setListener$2(this, null));
    }
}
